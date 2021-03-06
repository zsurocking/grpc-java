/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.grpc.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2016-07-11")
public class Message implements org.apache.thrift.TBase<Message, Message._Fields>, java.io.Serializable, Cloneable, Comparable<Message> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Message");

  private static final org.apache.thrift.protocol.TField I_FIELD_DESC = new org.apache.thrift.protocol.TField("i", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField B_FIELD_DESC = new org.apache.thrift.protocol.TField("b", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField S_FIELD_DESC = new org.apache.thrift.protocol.TField("s", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField L_FIELD_DESC = new org.apache.thrift.protocol.TField("l", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new MessageStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new MessageTupleSchemeFactory();

  public int i; // required
  public boolean b; // required
  public String s; // required
  public List<Integer> l; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    I((short)1, "i"),
    B((short)2, "b"),
    S((short)3, "s"),
    L((short)4, "l");

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
        case 1: // I
          return I;
        case 2: // B
          return B;
        case 3: // S
          return S;
        case 4: // L
          return L;
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
  private static final int __I_ISSET_ID = 0;
  private static final int __B_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.I, new org.apache.thrift.meta_data.FieldMetaData("i", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.B, new org.apache.thrift.meta_data.FieldMetaData("b", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.S, new org.apache.thrift.meta_data.FieldMetaData("s", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.L, new org.apache.thrift.meta_data.FieldMetaData("l", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Message.class, metaDataMap);
  }

  public Message() {
  }

  public Message(
    int i,
    boolean b,
    String s,
    List<Integer> l)
  {
    this();
    this.i = i;
    setIIsSet(true);
    this.b = b;
    setBIsSet(true);
    this.s = s;
    this.l = l;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Message(Message other) {
    __isset_bitfield = other.__isset_bitfield;
    this.i = other.i;
    this.b = other.b;
    if (other.isSetS()) {
      this.s = other.s;
    }
    if (other.isSetL()) {
      List<Integer> __this__l = new ArrayList<Integer>(other.l);
      this.l = __this__l;
    }
  }

  public Message deepCopy() {
    return new Message(this);
  }

  @Override
  public void clear() {
    setIIsSet(false);
    this.i = 0;
    setBIsSet(false);
    this.b = false;
    this.s = null;
    this.l = null;
  }

  public int getI() {
    return this.i;
  }

  public Message setI(int i) {
    this.i = i;
    setIIsSet(true);
    return this;
  }

  public void unsetI() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __I_ISSET_ID);
  }

  /** Returns true if field i is set (has been assigned a value) and false otherwise */
  public boolean isSetI() {
    return EncodingUtils.testBit(__isset_bitfield, __I_ISSET_ID);
  }

  public void setIIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __I_ISSET_ID, value);
  }

  public boolean isB() {
    return this.b;
  }

  public Message setB(boolean b) {
    this.b = b;
    setBIsSet(true);
    return this;
  }

  public void unsetB() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __B_ISSET_ID);
  }

  /** Returns true if field b is set (has been assigned a value) and false otherwise */
  public boolean isSetB() {
    return EncodingUtils.testBit(__isset_bitfield, __B_ISSET_ID);
  }

  public void setBIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __B_ISSET_ID, value);
  }

  public String getS() {
    return this.s;
  }

  public Message setS(String s) {
    this.s = s;
    return this;
  }

  public void unsetS() {
    this.s = null;
  }

  /** Returns true if field s is set (has been assigned a value) and false otherwise */
  public boolean isSetS() {
    return this.s != null;
  }

  public void setSIsSet(boolean value) {
    if (!value) {
      this.s = null;
    }
  }

  public int getLSize() {
    return (this.l == null) ? 0 : this.l.size();
  }

  public java.util.Iterator<Integer> getLIterator() {
    return (this.l == null) ? null : this.l.iterator();
  }

  public void addToL(int elem) {
    if (this.l == null) {
      this.l = new ArrayList<Integer>();
    }
    this.l.add(elem);
  }

  public List<Integer> getL() {
    return this.l;
  }

  public Message setL(List<Integer> l) {
    this.l = l;
    return this;
  }

  public void unsetL() {
    this.l = null;
  }

  /** Returns true if field l is set (has been assigned a value) and false otherwise */
  public boolean isSetL() {
    return this.l != null;
  }

  public void setLIsSet(boolean value) {
    if (!value) {
      this.l = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case I:
      if (value == null) {
        unsetI();
      } else {
        setI((Integer)value);
      }
      break;

    case B:
      if (value == null) {
        unsetB();
      } else {
        setB((Boolean)value);
      }
      break;

    case S:
      if (value == null) {
        unsetS();
      } else {
        setS((String)value);
      }
      break;

    case L:
      if (value == null) {
        unsetL();
      } else {
        setL((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case I:
      return getI();

    case B:
      return isB();

    case S:
      return getS();

    case L:
      return getL();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case I:
      return isSetI();
    case B:
      return isSetB();
    case S:
      return isSetS();
    case L:
      return isSetL();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Message)
      return this.equals((Message)that);
    return false;
  }

  public boolean equals(Message that) {
    if (that == null)
      return false;

    boolean this_present_i = true;
    boolean that_present_i = true;
    if (this_present_i || that_present_i) {
      if (!(this_present_i && that_present_i))
        return false;
      if (this.i != that.i)
        return false;
    }

    boolean this_present_b = true;
    boolean that_present_b = true;
    if (this_present_b || that_present_b) {
      if (!(this_present_b && that_present_b))
        return false;
      if (this.b != that.b)
        return false;
    }

    boolean this_present_s = true && this.isSetS();
    boolean that_present_s = true && that.isSetS();
    if (this_present_s || that_present_s) {
      if (!(this_present_s && that_present_s))
        return false;
      if (!this.s.equals(that.s))
        return false;
    }

    boolean this_present_l = true && this.isSetL();
    boolean that_present_l = true && that.isSetL();
    if (this_present_l || that_present_l) {
      if (!(this_present_l && that_present_l))
        return false;
      if (!this.l.equals(that.l))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + i;

    hashCode = hashCode * 8191 + ((b) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetS()) ? 131071 : 524287);
    if (isSetS())
      hashCode = hashCode * 8191 + s.hashCode();

    hashCode = hashCode * 8191 + ((isSetL()) ? 131071 : 524287);
    if (isSetL())
      hashCode = hashCode * 8191 + l.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Message other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetI()).compareTo(other.isSetI());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetI()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.i, other.i);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetB()).compareTo(other.isSetB());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetB()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.b, other.b);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetS()).compareTo(other.isSetS());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetS()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.s, other.s);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetL()).compareTo(other.isSetL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.l, other.l);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Message(");
    boolean first = true;

    sb.append("i:");
    sb.append(this.i);
    first = false;
    if (!first) sb.append(", ");
    sb.append("b:");
    sb.append(this.b);
    first = false;
    if (!first) sb.append(", ");
    sb.append("s:");
    if (this.s == null) {
      sb.append("null");
    } else {
      sb.append(this.s);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("l:");
    if (this.l == null) {
      sb.append("null");
    } else {
      sb.append(this.l);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MessageStandardSchemeFactory implements SchemeFactory {
    public MessageStandardScheme getScheme() {
      return new MessageStandardScheme();
    }
  }

  private static class MessageStandardScheme extends StandardScheme<Message> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Message struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // I
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.i = iprot.readI32();
              struct.setIIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // B
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.b = iprot.readBool();
              struct.setBIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // S
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.s = iprot.readString();
              struct.setSIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // L
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.l = new ArrayList<Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.l.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Message struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(I_FIELD_DESC);
      oprot.writeI32(struct.i);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(B_FIELD_DESC);
      oprot.writeBool(struct.b);
      oprot.writeFieldEnd();
      if (struct.s != null) {
        oprot.writeFieldBegin(S_FIELD_DESC);
        oprot.writeString(struct.s);
        oprot.writeFieldEnd();
      }
      if (struct.l != null) {
        oprot.writeFieldBegin(L_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.l.size()));
          for (int _iter3 : struct.l)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageTupleSchemeFactory implements SchemeFactory {
    public MessageTupleScheme getScheme() {
      return new MessageTupleScheme();
    }
  }

  private static class MessageTupleScheme extends TupleScheme<Message> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetI()) {
        optionals.set(0);
      }
      if (struct.isSetB()) {
        optionals.set(1);
      }
      if (struct.isSetS()) {
        optionals.set(2);
      }
      if (struct.isSetL()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetI()) {
        oprot.writeI32(struct.i);
      }
      if (struct.isSetB()) {
        oprot.writeBool(struct.b);
      }
      if (struct.isSetS()) {
        oprot.writeString(struct.s);
      }
      if (struct.isSetL()) {
        {
          oprot.writeI32(struct.l.size());
          for (int _iter4 : struct.l)
          {
            oprot.writeI32(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.i = iprot.readI32();
        struct.setIIsSet(true);
      }
      if (incoming.get(1)) {
        struct.b = iprot.readBool();
        struct.setBIsSet(true);
      }
      if (incoming.get(2)) {
        struct.s = iprot.readString();
        struct.setSIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.l = new ArrayList<Integer>(_list5.size);
          int _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readI32();
            struct.l.add(_elem6);
          }
        }
        struct.setLIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

