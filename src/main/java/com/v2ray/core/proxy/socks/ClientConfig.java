// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/socks/config.proto

package com.v2ray.core.proxy.socks;

/**
 * <pre>
 * ClientConfig is the protobuf config for Socks client.
 * </pre>
 *
 * Protobuf type {@code v2ray.core.proxy.socks.ClientConfig}
 */
public final class ClientConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.socks.ClientConfig)
    ClientConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientConfig.newBuilder() to construct.
  private ClientConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientConfig() {
    server_ = java.util.Collections.emptyList();
    version_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ClientConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ClientConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.proxy.socks.ClientConfig.class, com.v2ray.core.proxy.socks.ClientConfig.Builder.class);
  }

  public static final int SERVER_FIELD_NUMBER = 1;
  private java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> server_;
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> getServerList() {
    return server_;
  }
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
      getServerOrBuilderList() {
    return server_;
  }
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  @java.lang.Override
  public int getServerCount() {
    return server_.size();
  }
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.protocol.ServerEndpoint getServer(int index) {
    return server_.get(index);
  }
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.protocol.ServerEndpointOrBuilder getServerOrBuilder(
      int index) {
    return server_.get(index);
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
   * @return The enum numeric value on the wire for version.
   */
  @java.lang.Override public int getVersionValue() {
    return version_;
  }
  /**
   * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
   * @return The version.
   */
  @java.lang.Override public com.v2ray.core.proxy.socks.Version getVersion() {
    @SuppressWarnings("deprecation")
    com.v2ray.core.proxy.socks.Version result = com.v2ray.core.proxy.socks.Version.valueOf(version_);
    return result == null ? com.v2ray.core.proxy.socks.Version.UNRECOGNIZED : result;
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
    for (int i = 0; i < server_.size(); i++) {
      output.writeMessage(1, server_.get(i));
    }
    if (version_ != com.v2ray.core.proxy.socks.Version.SOCKS5.getNumber()) {
      output.writeEnum(2, version_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < server_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, server_.get(i));
    }
    if (version_ != com.v2ray.core.proxy.socks.Version.SOCKS5.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, version_);
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
    if (!(obj instanceof com.v2ray.core.proxy.socks.ClientConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.proxy.socks.ClientConfig other = (com.v2ray.core.proxy.socks.ClientConfig) obj;

    if (!getServerList()
        .equals(other.getServerList())) return false;
    if (version_ != other.version_) return false;
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
    if (getServerCount() > 0) {
      hash = (37 * hash) + SERVER_FIELD_NUMBER;
      hash = (53 * hash) + getServerList().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + version_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.socks.ClientConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.proxy.socks.ClientConfig prototype) {
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
   * <pre>
   * ClientConfig is the protobuf config for Socks client.
   * </pre>
   *
   * Protobuf type {@code v2ray.core.proxy.socks.ClientConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.socks.ClientConfig)
      com.v2ray.core.proxy.socks.ClientConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ClientConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ClientConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.proxy.socks.ClientConfig.class, com.v2ray.core.proxy.socks.ClientConfig.Builder.class);
    }

    // Construct using com.v2ray.core.proxy.socks.ClientConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (serverBuilder_ == null) {
        server_ = java.util.Collections.emptyList();
      } else {
        server_ = null;
        serverBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ClientConfig_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.socks.ClientConfig getDefaultInstanceForType() {
      return com.v2ray.core.proxy.socks.ClientConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.proxy.socks.ClientConfig build() {
      com.v2ray.core.proxy.socks.ClientConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.socks.ClientConfig buildPartial() {
      com.v2ray.core.proxy.socks.ClientConfig result = new com.v2ray.core.proxy.socks.ClientConfig(this);
      int from_bitField0_ = bitField0_;
      if (serverBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          server_ = java.util.Collections.unmodifiableList(server_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.server_ = server_;
      } else {
        result.server_ = serverBuilder_.build();
      }
      result.version_ = version_;
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
      if (other instanceof com.v2ray.core.proxy.socks.ClientConfig) {
        return mergeFrom((com.v2ray.core.proxy.socks.ClientConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.proxy.socks.ClientConfig other) {
      if (other == com.v2ray.core.proxy.socks.ClientConfig.getDefaultInstance()) return this;
      if (serverBuilder_ == null) {
        if (!other.server_.isEmpty()) {
          if (server_.isEmpty()) {
            server_ = other.server_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServerIsMutable();
            server_.addAll(other.server_);
          }
          onChanged();
        }
      } else {
        if (!other.server_.isEmpty()) {
          if (serverBuilder_.isEmpty()) {
            serverBuilder_.dispose();
            serverBuilder_ = null;
            server_ = other.server_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serverBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServerFieldBuilder() : null;
          } else {
            serverBuilder_.addAllMessages(other.server_);
          }
        }
      }
      if (other.version_ != 0) {
        setVersionValue(other.getVersionValue());
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
              com.v2ray.core.common.protocol.ServerEndpoint m =
                  input.readMessage(
                      com.v2ray.core.common.protocol.ServerEndpoint.parser(),
                      extensionRegistry);
              if (serverBuilder_ == null) {
                ensureServerIsMutable();
                server_.add(m);
              } else {
                serverBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              version_ = input.readEnum();

              break;
            } // case 16
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
    private int bitField0_;

    private java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> server_ =
      java.util.Collections.emptyList();
    private void ensureServerIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        server_ = new java.util.ArrayList<com.v2ray.core.common.protocol.ServerEndpoint>(server_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.ServerEndpoint, com.v2ray.core.common.protocol.ServerEndpoint.Builder, com.v2ray.core.common.protocol.ServerEndpointOrBuilder> serverBuilder_;

    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> getServerList() {
      if (serverBuilder_ == null) {
        return java.util.Collections.unmodifiableList(server_);
      } else {
        return serverBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public int getServerCount() {
      if (serverBuilder_ == null) {
        return server_.size();
      } else {
        return serverBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint getServer(int index) {
      if (serverBuilder_ == null) {
        return server_.get(index);
      } else {
        return serverBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder setServer(
        int index, com.v2ray.core.common.protocol.ServerEndpoint value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerIsMutable();
        server_.set(index, value);
        onChanged();
      } else {
        serverBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder setServer(
        int index, com.v2ray.core.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.set(index, builderForValue.build());
        onChanged();
      } else {
        serverBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder addServer(com.v2ray.core.common.protocol.ServerEndpoint value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerIsMutable();
        server_.add(value);
        onChanged();
      } else {
        serverBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder addServer(
        int index, com.v2ray.core.common.protocol.ServerEndpoint value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerIsMutable();
        server_.add(index, value);
        onChanged();
      } else {
        serverBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder addServer(
        com.v2ray.core.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.add(builderForValue.build());
        onChanged();
      } else {
        serverBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder addServer(
        int index, com.v2ray.core.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.add(index, builderForValue.build());
        onChanged();
      } else {
        serverBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder addAllServer(
        java.lang.Iterable<? extends com.v2ray.core.common.protocol.ServerEndpoint> values) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, server_);
        onChanged();
      } else {
        serverBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder clearServer() {
      if (serverBuilder_ == null) {
        server_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serverBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public Builder removeServer(int index) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.remove(index);
        onChanged();
      } else {
        serverBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint.Builder getServerBuilder(
        int index) {
      return getServerFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpointOrBuilder getServerOrBuilder(
        int index) {
      if (serverBuilder_ == null) {
        return server_.get(index);  } else {
        return serverBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public java.util.List<? extends com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
         getServerOrBuilderList() {
      if (serverBuilder_ != null) {
        return serverBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(server_);
      }
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint.Builder addServerBuilder() {
      return getServerFieldBuilder().addBuilder(
          com.v2ray.core.common.protocol.ServerEndpoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint.Builder addServerBuilder(
        int index) {
      return getServerFieldBuilder().addBuilder(
          index, com.v2ray.core.common.protocol.ServerEndpoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Sever is a list of Socks server addresses.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.ServerEndpoint.Builder> 
         getServerBuilderList() {
      return getServerFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.ServerEndpoint, com.v2ray.core.common.protocol.ServerEndpoint.Builder, com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
        getServerFieldBuilder() {
      if (serverBuilder_ == null) {
        serverBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.common.protocol.ServerEndpoint, com.v2ray.core.common.protocol.ServerEndpoint.Builder, com.v2ray.core.common.protocol.ServerEndpointOrBuilder>(
                server_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        server_ = null;
      }
      return serverBuilder_;
    }

    private int version_ = 0;
    /**
     * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
     * @return The enum numeric value on the wire for version.
     */
    @java.lang.Override public int getVersionValue() {
      return version_;
    }
    /**
     * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
     * @param value The enum numeric value on the wire for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionValue(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
     * @return The version.
     */
    @java.lang.Override
    public com.v2ray.core.proxy.socks.Version getVersion() {
      @SuppressWarnings("deprecation")
      com.v2ray.core.proxy.socks.Version result = com.v2ray.core.proxy.socks.Version.valueOf(version_);
      return result == null ? com.v2ray.core.proxy.socks.Version.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(com.v2ray.core.proxy.socks.Version value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      version_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.proxy.socks.Version version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.socks.ClientConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.socks.ClientConfig)
  private static final com.v2ray.core.proxy.socks.ClientConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.proxy.socks.ClientConfig();
  }

  public static com.v2ray.core.proxy.socks.ClientConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientConfig>
      PARSER = new com.google.protobuf.AbstractParser<ClientConfig>() {
    @java.lang.Override
    public ClientConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.proxy.socks.ClientConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

