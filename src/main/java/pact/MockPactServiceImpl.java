package pact;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.server.TThreadPoolServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.TException;

public class MockPactServiceImpl implements MockPactService.Iface {

	private Map<String,HTTPInteraction> interactions;
	
	public MockPactServiceImpl() {
		interactions = new HashMap<String, HTTPInteraction>();
	}
	
	@Override
	public void addInteraction(HTTPInteraction interaction) throws TException {
        System.out.println("Adding interaction: " + interaction.getDescription());
		interactions.put(interaction.getDescription(), interaction);
	}

	@Override
	public void clearInteraction(String description) throws TException {
        System.out.println("Clearing Interaction: " + description);
		interactions.remove(interactions.get(description));
	}

	@Override
	public VerifyResponse verifyInteraction(String description)
			throws TException {
        
		VerifyResponse result = new VerifyResponse(false);
		if (interactions.containsKey(description))
			// Do more here later.
			result.setSuccess(true);
		else
			result.setDescription("Failed to find interaction matching description: " + description);
		return result;
	}

    static class MyHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public static void main(String [] args) {
        
        MockPactServiceImpl mockPactService = new MockPactServiceImpl();

		try {
            MockPactService.Processor processor = new MockPactService.Processor(mockPactService);
            ExecutorService executorService = Executors.newFixedThreadPool(8);

            TServerTransport serverTransport = new TServerSocket(8080);
            TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(serverTransport);
            serverArgs.executorService(executorService);
            serverArgs.processor(processor);
            TServer server = new TThreadPoolServer(serverArgs);

            MyHandler handler = new MyHandler();


            for(int i = 0; i < args.length; i++) {
                HttpServer httpServer = HttpServer.create(new InetSocketAddress(Integer.parseInt(args[i])), 0);
                httpServer.createContext("/", handler);
                httpServer.setExecutor(executorService); // creates a default executor
                httpServer.start();
            }

            System.out.println("Mock Pack Service running. Press any key to stop.");
            server.serve();

            System.in.read();
        }
        catch (IOException e) {
            System.err.println("How could that read even fail?");
            e.printStackTrace();
        }
        catch (Exception  e) {
            System.err.println("Something else failed. But its hackday");
            e.printStackTrace();
        }
        finally {
            System.out.println("Couldn't find the any key huh?");
            System.exit(0);
        }
    }

}
