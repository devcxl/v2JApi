// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/network.proto

package com.v2ray.core.common.net;

/**
 * Protobuf enum {@code v2ray.core.common.net.Network}
 */
public enum Network
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <code>RawTCP = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  RawTCP(1),
  /**
   * <code>TCP = 2;</code>
   */
  TCP(2),
  /**
   * <code>UDP = 3;</code>
   */
  UDP(3),
  /**
   * <code>UNIX = 4;</code>
   */
  UNIX(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>RawTCP = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int RawTCP_VALUE = 1;
  /**
   * <code>TCP = 2;</code>
   */
  public static final int TCP_VALUE = 2;
  /**
   * <code>UDP = 3;</code>
   */
  public static final int UDP_VALUE = 3;
  /**
   * <code>UNIX = 4;</code>
   */
  public static final int UNIX_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Network valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Network forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return RawTCP;
      case 2: return TCP;
      case 3: return UDP;
      case 4: return UNIX;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Network>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Network> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Network>() {
          public Network findValueByNumber(int number) {
            return Network.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.v2ray.core.common.net.NetworkOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Network[] VALUES = values();

  public static Network valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Network(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:v2ray.core.common.net.Network)
}

