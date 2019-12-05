/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.orderseat.facade.response;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-05")
public class OrderSeatResponse implements org.apache.thrift.TBase<OrderSeatResponse, OrderSeatResponse._Fields>, java.io.Serializable, Cloneable, Comparable<OrderSeatResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OrderSeatResponse");

  private static final org.apache.thrift.protocol.TField SEAT_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("seatResult", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OrderSeatResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OrderSeatResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<Result> seatResult; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEAT_RESULT((short)1, "seatResult");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SEAT_RESULT
          return SEAT_RESULT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEAT_RESULT, new org.apache.thrift.meta_data.FieldMetaData("seatResult", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Result.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OrderSeatResponse.class, metaDataMap);
  }

  public OrderSeatResponse() {
  }

  public OrderSeatResponse(
    java.util.List<Result> seatResult)
  {
    this();
    this.seatResult = seatResult;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OrderSeatResponse(OrderSeatResponse other) {
    if (other.isSetSeatResult()) {
      java.util.List<Result> __this__seatResult = new java.util.ArrayList<Result>(other.seatResult.size());
      for (Result other_element : other.seatResult) {
        __this__seatResult.add(new Result(other_element));
      }
      this.seatResult = __this__seatResult;
    }
  }

  public OrderSeatResponse deepCopy() {
    return new OrderSeatResponse(this);
  }

  @Override
  public void clear() {
    this.seatResult = null;
  }

  public int getSeatResultSize() {
    return (this.seatResult == null) ? 0 : this.seatResult.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Result> getSeatResultIterator() {
    return (this.seatResult == null) ? null : this.seatResult.iterator();
  }

  public void addToSeatResult(Result elem) {
    if (this.seatResult == null) {
      this.seatResult = new java.util.ArrayList<Result>();
    }
    this.seatResult.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Result> getSeatResult() {
    return this.seatResult;
  }

  public OrderSeatResponse setSeatResult(@org.apache.thrift.annotation.Nullable java.util.List<Result> seatResult) {
    this.seatResult = seatResult;
    return this;
  }

  public void unsetSeatResult() {
    this.seatResult = null;
  }

  /** Returns true if field seatResult is set (has been assigned a value) and false otherwise */
  public boolean isSetSeatResult() {
    return this.seatResult != null;
  }

  public void setSeatResultIsSet(boolean value) {
    if (!value) {
      this.seatResult = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SEAT_RESULT:
      if (value == null) {
        unsetSeatResult();
      } else {
        setSeatResult((java.util.List<Result>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SEAT_RESULT:
      return getSeatResult();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SEAT_RESULT:
      return isSetSeatResult();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OrderSeatResponse)
      return this.equals((OrderSeatResponse)that);
    return false;
  }

  public boolean equals(OrderSeatResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_seatResult = true && this.isSetSeatResult();
    boolean that_present_seatResult = true && that.isSetSeatResult();
    if (this_present_seatResult || that_present_seatResult) {
      if (!(this_present_seatResult && that_present_seatResult))
        return false;
      if (!this.seatResult.equals(that.seatResult))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSeatResult()) ? 131071 : 524287);
    if (isSetSeatResult())
      hashCode = hashCode * 8191 + seatResult.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OrderSeatResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSeatResult()).compareTo(other.isSetSeatResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeatResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seatResult, other.seatResult);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OrderSeatResponse(");
    boolean first = true;

    sb.append("seatResult:");
    if (this.seatResult == null) {
      sb.append("null");
    } else {
      sb.append(this.seatResult);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OrderSeatResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OrderSeatResponseStandardScheme getScheme() {
      return new OrderSeatResponseStandardScheme();
    }
  }

  private static class OrderSeatResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<OrderSeatResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OrderSeatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEAT_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.seatResult = new java.util.ArrayList<Result>(_list0.size);
                @org.apache.thrift.annotation.Nullable Result _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Result();
                  _elem1.read(iprot);
                  struct.seatResult.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSeatResultIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OrderSeatResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.seatResult != null) {
        oprot.writeFieldBegin(SEAT_RESULT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.seatResult.size()));
          for (Result _iter3 : struct.seatResult)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OrderSeatResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OrderSeatResponseTupleScheme getScheme() {
      return new OrderSeatResponseTupleScheme();
    }
  }

  private static class OrderSeatResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<OrderSeatResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OrderSeatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSeatResult()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSeatResult()) {
        {
          oprot.writeI32(struct.seatResult.size());
          for (Result _iter4 : struct.seatResult)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OrderSeatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.seatResult = new java.util.ArrayList<Result>(_list5.size);
          @org.apache.thrift.annotation.Nullable Result _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new Result();
            _elem6.read(iprot);
            struct.seatResult.add(_elem6);
          }
        }
        struct.setSeatResultIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

