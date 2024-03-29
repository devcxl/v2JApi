// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/mtproto/config.proto

package com.v2ray.core.proxy.mtproto;

/**
 * Protobuf type {@code v2ray.core.proxy.mtproto.Account}
 */
public final class Account extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.mtproto.Account)
    AccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Account.newBuilder() to construct.
  private Account(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Account() {
    secret_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Account();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.proxy.mtproto.Config.internal_static_v2ray_core_proxy_mtproto_Account_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.mtproto.Config.internal_static_v2ray_core_proxy_mtproto_Account_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.proxy.mtproto.Account.class, com.v2ray.core.proxy.mtproto.Account.Builder.class);
  }

  public static final int SECRET_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString secret_;
  /**
   * <code>bytes secret = 1;</code>
   * @return The secret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecret() {
    return secret_;
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
    if (!secret_.isEmpty()) {
      output.writeBytes(1, secret_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!secret_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, secret_);
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
    if (!(obj instanceof com.v2ray.core.proxy.mtproto.Account)) {
      return super.equals(obj);
    }
    com.v2ray.core.proxy.mtproto.Account other = (com.v2ray.core.proxy.mtproto.Account) obj;

    if (!getSecret()
        .equals(other.getSecret())) return false;
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
    hash = (37 * hash) + SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getSecret().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.mtproto.Account parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.proxy.mtproto.Account prototype) {
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
   * Protobuf type {@code v2ray.core.proxy.mtproto.Account}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.mtproto.Account)
      com.v2ray.core.proxy.mtproto.AccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.mtproto.Config.internal_static_v2ray_core_proxy_mtproto_Account_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.mtproto.Config.internal_static_v2ray_core_proxy_mtproto_Account_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.proxy.mtproto.Account.class, com.v2ray.core.proxy.mtproto.Account.Builder.class);
    }

    // Construct using com.v2ray.core.proxy.mtproto.Account.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      secret_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.mtproto.Config.internal_static_v2ray_core_proxy_mtproto_Account_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.mtproto.Account getDefaultInstanceForType() {
      return com.v2ray.core.proxy.mtproto.Account.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.proxy.mtproto.Account build() {
      com.v2ray.core.proxy.mtproto.Account result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.mtproto.Account buildPartial() {
      com.v2ray.core.proxy.mtproto.Account result = new com.v2ray.core.proxy.mtproto.Account(this);
      result.secret_ = secret_;
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
      if (other instanceof com.v2ray.core.proxy.mtproto.Account) {
        return mergeFrom((com.v2ray.core.proxy.mtproto.Account)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.proxy.mtproto.Account other) {
      if (other == com.v2ray.core.proxy.mtproto.Account.getDefaultInstance()) return this;
      if (other.getSecret() != com.google.protobuf.ByteString.EMPTY) {
        setSecret(other.getSecret());
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
              secret_ = input.readBytes();

              break;
            } // case 10
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

    private com.google.protobuf.ByteString secret_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes secret = 1;</code>
     * @return The secret.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSecret() {
      return secret_;
    }
    /**
     * <code>bytes secret = 1;</code>
     * @param value The secret to set.
     * @return This builder for chaining.
     */
    public Builder setSecret(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      secret_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes secret = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecret() {
      
      secret_ = getDefaultInstance().getSecret();
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.mtproto.Account)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.mtproto.Account)
  private static final com.v2ray.core.proxy.mtproto.Account DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.proxy.mtproto.Account();
  }

  public static com.v2ray.core.proxy.mtproto.Account getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Account>
      PARSER = new com.google.protobuf.AbstractParser<Account>() {
    @java.lang.Override
    public Account parsePartialFrom(
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

  public static com.google.protobuf.Parser<Account> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Account> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.proxy.mtproto.Account getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

