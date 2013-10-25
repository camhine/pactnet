namespace java pact
namespace rb Pact.Consumer.Thrift

enum HTTPMethod {
  COPY,
  DELETE,
  GET,
  HEAD,
  OPTIONS,
  MOVE,
  PATCH,
  POST,
  PUT,
  TRACE
}

struct HTTPRequest {
  1: required HTTPMethod method,
  2: optional string path, # maybe required
  3: optional map<string,string> headers,
  4: optional map<string,string> queryParams,
  5: optional string body
}

struct HTTPResponse {
  1: required i32 status,
  2: optional string body,
  3: optional map<string,string> headers,
}

struct HTTPInteraction {
  1: required string description,
  2: required HTTPRequest request,
  3: required HTTPResponse response
  # TODO: Provider states in interactions
}

struct VerifyResponse {
  1: required bool success,
  2: optional string description
}

service MockPactService {
  void addInteraction(1:HTTPInteraction interaction)
  void clearInteraction(1:string description)
  VerifyResponse verifyInteraction(1:string description)
}