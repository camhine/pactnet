/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package pact;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HTTPRequest implements org.apache.thrift.TBase<HTTPRequest, HTTPRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HTTPRequest");

  private static final org.apache.thrift.protocol.TField METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("method", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HEADERS_FIELD_DESC = new org.apache.thrift.protocol.TField("headers", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("queryParams", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HTTPRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HTTPRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see HTTPMethod
   */
  public HTTPMethod method; // required
  public String path; // optional
  public Map<String,String> headers; // optional
  public Map<String,String> queryParams; // optional
  public String body; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see HTTPMethod
     */
    METHOD((short)1, "method"),
    PATH((short)2, "path"),
    HEADERS((short)3, "headers"),
    QUERY_PARAMS((short)4, "queryParams"),
    BODY((short)5, "body");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METHOD
          return METHOD;
        case 2: // PATH
          return PATH;
        case 3: // HEADERS
          return HEADERS;
        case 4: // QUERY_PARAMS
          return QUERY_PARAMS;
        case 5: // BODY
          return BODY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.PATH,_Fields.HEADERS,_Fields.QUERY_PARAMS,_Fields.BODY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METHOD, new org.apache.thrift.meta_data.FieldMetaData("method", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, HTTPMethod.class)));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEADERS, new org.apache.thrift.meta_data.FieldMetaData("headers", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.QUERY_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("queryParams", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HTTPRequest.class, metaDataMap);
  }

  public HTTPRequest() {
  }

  public HTTPRequest(
    HTTPMethod method)
  {
    this();
    this.method = method;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HTTPRequest(HTTPRequest other) {
    if (other.isSetMethod()) {
      this.method = other.method;
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
    if (other.isSetHeaders()) {
      Map<String,String> __this__headers = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.headers.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__headers_copy_key = other_element_key;

        String __this__headers_copy_value = other_element_value;

        __this__headers.put(__this__headers_copy_key, __this__headers_copy_value);
      }
      this.headers = __this__headers;
    }
    if (other.isSetQueryParams()) {
      Map<String,String> __this__queryParams = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.queryParams.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__queryParams_copy_key = other_element_key;

        String __this__queryParams_copy_value = other_element_value;

        __this__queryParams.put(__this__queryParams_copy_key, __this__queryParams_copy_value);
      }
      this.queryParams = __this__queryParams;
    }
    if (other.isSetBody()) {
      this.body = other.body;
    }
  }

  public HTTPRequest deepCopy() {
    return new HTTPRequest(this);
  }

  @Override
  public void clear() {
    this.method = null;
    this.path = null;
    this.headers = null;
    this.queryParams = null;
    this.body = null;
  }

  /**
   * 
   * @see HTTPMethod
   */
  public HTTPMethod getMethod() {
    return this.method;
  }

  /**
   * 
   * @see HTTPMethod
   */
  public HTTPRequest setMethod(HTTPMethod method) {
    this.method = method;
    return this;
  }

  public void unsetMethod() {
    this.method = null;
  }

  /** Returns true if field method is set (has been assigned a value) and false otherwise */
  public boolean isSetMethod() {
    return this.method != null;
  }

  public void setMethodIsSet(boolean value) {
    if (!value) {
      this.method = null;
    }
  }

  public String getPath() {
    return this.path;
  }

  public HTTPRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public int getHeadersSize() {
    return (this.headers == null) ? 0 : this.headers.size();
  }

  public void putToHeaders(String key, String val) {
    if (this.headers == null) {
      this.headers = new HashMap<String,String>();
    }
    this.headers.put(key, val);
  }

  public Map<String,String> getHeaders() {
    return this.headers;
  }

  public HTTPRequest setHeaders(Map<String,String> headers) {
    this.headers = headers;
    return this;
  }

  public void unsetHeaders() {
    this.headers = null;
  }

  /** Returns true if field headers is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaders() {
    return this.headers != null;
  }

  public void setHeadersIsSet(boolean value) {
    if (!value) {
      this.headers = null;
    }
  }

  public int getQueryParamsSize() {
    return (this.queryParams == null) ? 0 : this.queryParams.size();
  }

  public void putToQueryParams(String key, String val) {
    if (this.queryParams == null) {
      this.queryParams = new HashMap<String,String>();
    }
    this.queryParams.put(key, val);
  }

  public Map<String,String> getQueryParams() {
    return this.queryParams;
  }

  public HTTPRequest setQueryParams(Map<String,String> queryParams) {
    this.queryParams = queryParams;
    return this;
  }

  public void unsetQueryParams() {
    this.queryParams = null;
  }

  /** Returns true if field queryParams is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryParams() {
    return this.queryParams != null;
  }

  public void setQueryParamsIsSet(boolean value) {
    if (!value) {
      this.queryParams = null;
    }
  }

  public String getBody() {
    return this.body;
  }

  public HTTPRequest setBody(String body) {
    this.body = body;
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METHOD:
      if (value == null) {
        unsetMethod();
      } else {
        setMethod((HTTPMethod)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case HEADERS:
      if (value == null) {
        unsetHeaders();
      } else {
        setHeaders((Map<String,String>)value);
      }
      break;

    case QUERY_PARAMS:
      if (value == null) {
        unsetQueryParams();
      } else {
        setQueryParams((Map<String,String>)value);
      }
      break;

    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METHOD:
      return getMethod();

    case PATH:
      return getPath();

    case HEADERS:
      return getHeaders();

    case QUERY_PARAMS:
      return getQueryParams();

    case BODY:
      return getBody();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METHOD:
      return isSetMethod();
    case PATH:
      return isSetPath();
    case HEADERS:
      return isSetHeaders();
    case QUERY_PARAMS:
      return isSetQueryParams();
    case BODY:
      return isSetBody();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HTTPRequest)
      return this.equals((HTTPRequest)that);
    return false;
  }

  public boolean equals(HTTPRequest that) {
    if (that == null)
      return false;

    boolean this_present_method = true && this.isSetMethod();
    boolean that_present_method = true && that.isSetMethod();
    if (this_present_method || that_present_method) {
      if (!(this_present_method && that_present_method))
        return false;
      if (!this.method.equals(that.method))
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_headers = true && this.isSetHeaders();
    boolean that_present_headers = true && that.isSetHeaders();
    if (this_present_headers || that_present_headers) {
      if (!(this_present_headers && that_present_headers))
        return false;
      if (!this.headers.equals(that.headers))
        return false;
    }

    boolean this_present_queryParams = true && this.isSetQueryParams();
    boolean that_present_queryParams = true && that.isSetQueryParams();
    if (this_present_queryParams || that_present_queryParams) {
      if (!(this_present_queryParams && that_present_queryParams))
        return false;
      if (!this.queryParams.equals(that.queryParams))
        return false;
    }

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(HTTPRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HTTPRequest typedOther = (HTTPRequest)other;

    lastComparison = Boolean.valueOf(isSetMethod()).compareTo(typedOther.isSetMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.method, typedOther.method);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(typedOther.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, typedOther.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeaders()).compareTo(typedOther.isSetHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headers, typedOther.headers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryParams()).compareTo(typedOther.isSetQueryParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryParams, typedOther.queryParams);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBody()).compareTo(typedOther.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, typedOther.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HTTPRequest(");
    boolean first = true;

    sb.append("method:");
    if (this.method == null) {
      sb.append("null");
    } else {
      sb.append(this.method);
    }
    first = false;
    if (isSetPath()) {
      if (!first) sb.append(", ");
      sb.append("path:");
      if (this.path == null) {
        sb.append("null");
      } else {
        sb.append(this.path);
      }
      first = false;
    }
    if (isSetHeaders()) {
      if (!first) sb.append(", ");
      sb.append("headers:");
      if (this.headers == null) {
        sb.append("null");
      } else {
        sb.append(this.headers);
      }
      first = false;
    }
    if (isSetQueryParams()) {
      if (!first) sb.append(", ");
      sb.append("queryParams:");
      if (this.queryParams == null) {
        sb.append("null");
      } else {
        sb.append(this.queryParams);
      }
      first = false;
    }
    if (isSetBody()) {
      if (!first) sb.append(", ");
      sb.append("body:");
      if (this.body == null) {
        sb.append("null");
      } else {
        sb.append(this.body);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (method == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'method' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HTTPRequestStandardSchemeFactory implements SchemeFactory {
    public HTTPRequestStandardScheme getScheme() {
      return new HTTPRequestStandardScheme();
    }
  }

  private static class HTTPRequestStandardScheme extends StandardScheme<HTTPRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HTTPRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.method = HTTPMethod.findByValue(iprot.readI32());
              struct.setMethodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HEADERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.headers = new HashMap<String,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2; // optional
                  String _val3; // required
                  _key2 = iprot.readString();
                  _val3 = iprot.readString();
                  struct.headers.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setHeadersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.queryParams = new HashMap<String,String>(2*_map4.size);
                for (int _i5 = 0; _i5 < _map4.size; ++_i5)
                {
                  String _key6; // optional
                  String _val7; // required
                  _key6 = iprot.readString();
                  _val7 = iprot.readString();
                  struct.queryParams.put(_key6, _val7);
                }
                iprot.readMapEnd();
              }
              struct.setQueryParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.body = iprot.readString();
              struct.setBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HTTPRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.method != null) {
        oprot.writeFieldBegin(METHOD_FIELD_DESC);
        oprot.writeI32(struct.method.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.path != null) {
        if (struct.isSetPath()) {
          oprot.writeFieldBegin(PATH_FIELD_DESC);
          oprot.writeString(struct.path);
          oprot.writeFieldEnd();
        }
      }
      if (struct.headers != null) {
        if (struct.isSetHeaders()) {
          oprot.writeFieldBegin(HEADERS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.headers.size()));
            for (Map.Entry<String, String> _iter8 : struct.headers.entrySet())
            {
              oprot.writeString(_iter8.getKey());
              oprot.writeString(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.queryParams != null) {
        if (struct.isSetQueryParams()) {
          oprot.writeFieldBegin(QUERY_PARAMS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.queryParams.size()));
            for (Map.Entry<String, String> _iter9 : struct.queryParams.entrySet())
            {
              oprot.writeString(_iter9.getKey());
              oprot.writeString(_iter9.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.body != null) {
        if (struct.isSetBody()) {
          oprot.writeFieldBegin(BODY_FIELD_DESC);
          oprot.writeString(struct.body);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HTTPRequestTupleSchemeFactory implements SchemeFactory {
    public HTTPRequestTupleScheme getScheme() {
      return new HTTPRequestTupleScheme();
    }
  }

  private static class HTTPRequestTupleScheme extends TupleScheme<HTTPRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HTTPRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.method.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetPath()) {
        optionals.set(0);
      }
      if (struct.isSetHeaders()) {
        optionals.set(1);
      }
      if (struct.isSetQueryParams()) {
        optionals.set(2);
      }
      if (struct.isSetBody()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
      if (struct.isSetHeaders()) {
        {
          oprot.writeI32(struct.headers.size());
          for (Map.Entry<String, String> _iter10 : struct.headers.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
      if (struct.isSetQueryParams()) {
        {
          oprot.writeI32(struct.queryParams.size());
          for (Map.Entry<String, String> _iter11 : struct.queryParams.entrySet())
          {
            oprot.writeString(_iter11.getKey());
            oprot.writeString(_iter11.getValue());
          }
        }
      }
      if (struct.isSetBody()) {
        oprot.writeString(struct.body);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HTTPRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.method = HTTPMethod.findByValue(iprot.readI32());
      struct.setMethodIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map12 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.headers = new HashMap<String,String>(2*_map12.size);
          for (int _i13 = 0; _i13 < _map12.size; ++_i13)
          {
            String _key14; // optional
            String _val15; // required
            _key14 = iprot.readString();
            _val15 = iprot.readString();
            struct.headers.put(_key14, _val15);
          }
        }
        struct.setHeadersIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.queryParams = new HashMap<String,String>(2*_map16.size);
          for (int _i17 = 0; _i17 < _map16.size; ++_i17)
          {
            String _key18; // optional
            String _val19; // required
            _key18 = iprot.readString();
            _val19 = iprot.readString();
            struct.queryParams.put(_key18, _val19);
          }
        }
        struct.setQueryParamsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.body = iprot.readString();
        struct.setBodyIsSet(true);
      }
    }
  }

}

