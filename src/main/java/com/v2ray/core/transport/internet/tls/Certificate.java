// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/tls/config.proto

package com.v2ray.core.transport.internet.tls;

/**
 * Protobuf type {@code v2ray.core.transport.internet.tls.Certificate}
 */
public final class Certificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.tls.Certificate)
    CertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Certificate.newBuilder() to construct.
  private Certificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Certificate() {
    certificate_ = com.google.protobuf.ByteString.EMPTY;
    key_ = com.google.protobuf.ByteString.EMPTY;
    usage_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Certificate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.tls.Certificate.class, com.v2ray.core.transport.internet.tls.Certificate.Builder.class);
  }

  /**
   * Protobuf enum {@code v2ray.core.transport.internet.tls.Certificate.Usage}
   */
  public enum Usage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENCIPHERMENT = 0;</code>
     */
    ENCIPHERMENT(0),
    /**
     * <code>AUTHORITY_VERIFY = 1;</code>
     */
    AUTHORITY_VERIFY(1),
    /**
     * <code>AUTHORITY_ISSUE = 2;</code>
     */
    AUTHORITY_ISSUE(2),
    /**
     * <code>AUTHORITY_VERIFY_CLIENT = 3;</code>
     */
    AUTHORITY_VERIFY_CLIENT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ENCIPHERMENT = 0;</code>
     */
    public static final int ENCIPHERMENT_VALUE = 0;
    /**
     * <code>AUTHORITY_VERIFY = 1;</code>
     */
    public static final int AUTHORITY_VERIFY_VALUE = 1;
    /**
     * <code>AUTHORITY_ISSUE = 2;</code>
     */
    public static final int AUTHORITY_ISSUE_VALUE = 2;
    /**
     * <code>AUTHORITY_VERIFY_CLIENT = 3;</code>
     */
    public static final int AUTHORITY_VERIFY_CLIENT_VALUE = 3;


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
    public static Usage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Usage forNumber(int value) {
      switch (value) {
        case 0: return ENCIPHERMENT;
        case 1: return AUTHORITY_VERIFY;
        case 2: return AUTHORITY_ISSUE;
        case 3: return AUTHORITY_VERIFY_CLIENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Usage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Usage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Usage>() {
            public Usage findValueByNumber(int number) {
              return Usage.forNumber(number);
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
      return com.v2ray.core.transport.internet.tls.Certificate.getDescriptor().getEnumTypes().get(0);
    }

    private static final Usage[] VALUES = values();

    public static Usage valueOf(
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

    private Usage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:v2ray.core.transport.internet.tls.Certificate.Usage)
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString certificate_;
  /**
   * <pre>
   * TLS certificate in x509 format.
   * </pre>
   *
   * <code>bytes Certificate = 1;</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCertificate() {
    return certificate_;
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * TLS key in x509 format.
   * </pre>
   *
   * <code>bytes Key = 2;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int USAGE_FIELD_NUMBER = 3;
  private int usage_;
  /**
   * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
   * @return The enum numeric value on the wire for usage.
   */
  @java.lang.Override public int getUsageValue() {
    return usage_;
  }
  /**
   * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
   * @return The usage.
   */
  @java.lang.Override public com.v2ray.core.transport.internet.tls.Certificate.Usage getUsage() {
    @SuppressWarnings("deprecation")
    com.v2ray.core.transport.internet.tls.Certificate.Usage result = com.v2ray.core.transport.internet.tls.Certificate.Usage.valueOf(usage_);
    return result == null ? com.v2ray.core.transport.internet.tls.Certificate.Usage.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!certificate_.isEmpty()) {
      output.writeBytes(1, certificate_);
    }
    if (!key_.isEmpty()) {
      output.writeBytes(2, key_);
    }
    if (usage_ != com.v2ray.core.transport.internet.tls.Certificate.Usage.ENCIPHERMENT.getNumber()) {
      output.writeEnum(3, usage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!certificate_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, certificate_);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, key_);
    }
    if (usage_ != com.v2ray.core.transport.internet.tls.Certificate.Usage.ENCIPHERMENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, usage_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.internet.tls.Certificate)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.tls.Certificate other = (com.v2ray.core.transport.internet.tls.Certificate) obj;

    if (!getCertificate()
        .equals(other.getCertificate())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
    if (usage_ != other.usage_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getCertificate().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + USAGE_FIELD_NUMBER;
    hash = (53 * hash) + usage_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.internet.tls.Certificate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.transport.internet.tls.Certificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.tls.Certificate)
      com.v2ray.core.transport.internet.tls.CertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.tls.Certificate.class, com.v2ray.core.transport.internet.tls.Certificate.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.tls.Certificate.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      certificate_ = com.google.protobuf.ByteString.EMPTY;

      key_ = com.google.protobuf.ByteString.EMPTY;

      usage_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.tls.Certificate getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.tls.Certificate.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.tls.Certificate build() {
      com.v2ray.core.transport.internet.tls.Certificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.tls.Certificate buildPartial() {
      com.v2ray.core.transport.internet.tls.Certificate result = new com.v2ray.core.transport.internet.tls.Certificate(this);
      result.certificate_ = certificate_;
      result.key_ = key_;
      result.usage_ = usage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.internet.tls.Certificate) {
        return mergeFrom((com.v2ray.core.transport.internet.tls.Certificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.tls.Certificate other) {
      if (other == com.v2ray.core.transport.internet.tls.Certificate.getDefaultInstance()) return this;
      if (other.getCertificate() != com.google.protobuf.ByteString.EMPTY) {
        setCertificate(other.getCertificate());
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.usage_ != 0) {
        setUsageValue(other.getUsageValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              certificate_ = input.readBytes();

              break;
            } // case 10
            case 18: {
              key_ = input.readBytes();

              break;
            } // case 18
            case 24: {
              usage_ = input.readEnum();

              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes Certificate = 1;</code>
     * @return The certificate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCertificate() {
      return certificate_;
    }
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes Certificate = 1;</code>
     * @param value The certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificate(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      certificate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes Certificate = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificate() {
      
      certificate_ = getDefaultInstance().getCertificate();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes Key = 2;</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes Key = 2;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes Key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private int usage_ = 0;
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @return The enum numeric value on the wire for usage.
     */
    @java.lang.Override public int getUsageValue() {
      return usage_;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @param value The enum numeric value on the wire for usage to set.
     * @return This builder for chaining.
     */
    public Builder setUsageValue(int value) {
      
      usage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @return The usage.
     */
    @java.lang.Override
    public com.v2ray.core.transport.internet.tls.Certificate.Usage getUsage() {
      @SuppressWarnings("deprecation")
      com.v2ray.core.transport.internet.tls.Certificate.Usage result = com.v2ray.core.transport.internet.tls.Certificate.Usage.valueOf(usage_);
      return result == null ? com.v2ray.core.transport.internet.tls.Certificate.Usage.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @param value The usage to set.
     * @return This builder for chaining.
     */
    public Builder setUsage(com.v2ray.core.transport.internet.tls.Certificate.Usage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      usage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsage() {
      
      usage_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.tls.Certificate)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.tls.Certificate)
  private static final com.v2ray.core.transport.internet.tls.Certificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.tls.Certificate();
  }

  public static com.v2ray.core.transport.internet.tls.Certificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Certificate>
      PARSER = new com.google.protobuf.AbstractParser<Certificate>() {
    @java.lang.Override
    public Certificate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Certificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Certificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.transport.internet.tls.Certificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

