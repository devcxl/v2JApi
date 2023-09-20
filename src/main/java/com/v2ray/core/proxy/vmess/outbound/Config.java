// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vmess/outbound/config.proto

package com.v2ray.core.proxy.vmess.outbound;

/**
 * Protobuf type {@code v2ray.core.proxy.vmess.outbound.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.vmess.outbound.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    receiver_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.proxy.vmess.outbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.vmess.outbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_outbound_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.proxy.vmess.outbound.Config.class, com.v2ray.core.proxy.vmess.outbound.Config.Builder.class);
  }

  public static final int RECEIVER_FIELD_NUMBER = 1;
  private java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> receiver_;
  /**
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> getReceiverList() {
    return receiver_;
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
      getReceiverOrBuilderList() {
    return receiver_;
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  @java.lang.Override
  public int getReceiverCount() {
    return receiver_.size();
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.protocol.ServerEndpoint getReceiver(int index) {
    return receiver_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.protocol.ServerEndpointOrBuilder getReceiverOrBuilder(
      int index) {
    return receiver_.get(index);
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
    for (int i = 0; i < receiver_.size(); i++) {
      output.writeMessage(1, receiver_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < receiver_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, receiver_.get(i));
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
    if (!(obj instanceof com.v2ray.core.proxy.vmess.outbound.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.proxy.vmess.outbound.Config other = (com.v2ray.core.proxy.vmess.outbound.Config) obj;

    if (!getReceiverList()
        .equals(other.getReceiverList())) return false;
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
    if (getReceiverCount() > 0) {
      hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
      hash = (53 * hash) + getReceiverList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.vmess.outbound.Config parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.proxy.vmess.outbound.Config prototype) {
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
   * Protobuf type {@code v2ray.core.proxy.vmess.outbound.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.vmess.outbound.Config)
      com.v2ray.core.proxy.vmess.outbound.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.vmess.outbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.vmess.outbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_outbound_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.proxy.vmess.outbound.Config.class, com.v2ray.core.proxy.vmess.outbound.Config.Builder.class);
    }

    // Construct using com.v2ray.core.proxy.vmess.outbound.Config.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (receiverBuilder_ == null) {
        receiver_ = java.util.Collections.emptyList();
      } else {
        receiver_ = null;
        receiverBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.vmess.outbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.vmess.outbound.Config getDefaultInstanceForType() {
      return com.v2ray.core.proxy.vmess.outbound.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.proxy.vmess.outbound.Config build() {
      com.v2ray.core.proxy.vmess.outbound.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.vmess.outbound.Config buildPartial() {
      com.v2ray.core.proxy.vmess.outbound.Config result = new com.v2ray.core.proxy.vmess.outbound.Config(this);
      int from_bitField0_ = bitField0_;
      if (receiverBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          receiver_ = java.util.Collections.unmodifiableList(receiver_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.receiver_ = receiver_;
      } else {
        result.receiver_ = receiverBuilder_.build();
      }
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
      if (other instanceof com.v2ray.core.proxy.vmess.outbound.Config) {
        return mergeFrom((com.v2ray.core.proxy.vmess.outbound.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.proxy.vmess.outbound.Config other) {
      if (other == com.v2ray.core.proxy.vmess.outbound.Config.getDefaultInstance()) return this;
      if (receiverBuilder_ == null) {
        if (!other.receiver_.isEmpty()) {
          if (receiver_.isEmpty()) {
            receiver_ = other.receiver_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReceiverIsMutable();
            receiver_.addAll(other.receiver_);
          }
          onChanged();
        }
      } else {
        if (!other.receiver_.isEmpty()) {
          if (receiverBuilder_.isEmpty()) {
            receiverBuilder_.dispose();
            receiverBuilder_ = null;
            receiver_ = other.receiver_;
            bitField0_ = (bitField0_ & ~0x00000001);
            receiverBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReceiverFieldBuilder() : null;
          } else {
            receiverBuilder_.addAllMessages(other.receiver_);
          }
        }
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
              if (receiverBuilder_ == null) {
                ensureReceiverIsMutable();
                receiver_.add(m);
              } else {
                receiverBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> receiver_ =
      java.util.Collections.emptyList();
    private void ensureReceiverIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        receiver_ = new java.util.ArrayList<com.v2ray.core.common.protocol.ServerEndpoint>(receiver_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.ServerEndpoint, com.v2ray.core.common.protocol.ServerEndpoint.Builder, com.v2ray.core.common.protocol.ServerEndpointOrBuilder> receiverBuilder_;

    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> getReceiverList() {
      if (receiverBuilder_ == null) {
        return java.util.Collections.unmodifiableList(receiver_);
      } else {
        return receiverBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public int getReceiverCount() {
      if (receiverBuilder_ == null) {
        return receiver_.size();
      } else {
        return receiverBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint getReceiver(int index) {
      if (receiverBuilder_ == null) {
        return receiver_.get(index);
      } else {
        return receiverBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder setReceiver(
        int index, com.v2ray.core.common.protocol.ServerEndpoint value) {
      if (receiverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceiverIsMutable();
        receiver_.set(index, value);
        onChanged();
      } else {
        receiverBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder setReceiver(
        int index, com.v2ray.core.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (receiverBuilder_ == null) {
        ensureReceiverIsMutable();
        receiver_.set(index, builderForValue.build());
        onChanged();
      } else {
        receiverBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder addReceiver(com.v2ray.core.common.protocol.ServerEndpoint value) {
      if (receiverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceiverIsMutable();
        receiver_.add(value);
        onChanged();
      } else {
        receiverBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder addReceiver(
        int index, com.v2ray.core.common.protocol.ServerEndpoint value) {
      if (receiverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceiverIsMutable();
        receiver_.add(index, value);
        onChanged();
      } else {
        receiverBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder addReceiver(
        com.v2ray.core.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (receiverBuilder_ == null) {
        ensureReceiverIsMutable();
        receiver_.add(builderForValue.build());
        onChanged();
      } else {
        receiverBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder addReceiver(
        int index, com.v2ray.core.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (receiverBuilder_ == null) {
        ensureReceiverIsMutable();
        receiver_.add(index, builderForValue.build());
        onChanged();
      } else {
        receiverBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder addAllReceiver(
        java.lang.Iterable<? extends com.v2ray.core.common.protocol.ServerEndpoint> values) {
      if (receiverBuilder_ == null) {
        ensureReceiverIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, receiver_);
        onChanged();
      } else {
        receiverBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder clearReceiver() {
      if (receiverBuilder_ == null) {
        receiver_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        receiverBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public Builder removeReceiver(int index) {
      if (receiverBuilder_ == null) {
        ensureReceiverIsMutable();
        receiver_.remove(index);
        onChanged();
      } else {
        receiverBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint.Builder getReceiverBuilder(
        int index) {
      return getReceiverFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpointOrBuilder getReceiverOrBuilder(
        int index) {
      if (receiverBuilder_ == null) {
        return receiver_.get(index);  } else {
        return receiverBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public java.util.List<? extends com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
         getReceiverOrBuilderList() {
      if (receiverBuilder_ != null) {
        return receiverBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(receiver_);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint.Builder addReceiverBuilder() {
      return getReceiverFieldBuilder().addBuilder(
          com.v2ray.core.common.protocol.ServerEndpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public com.v2ray.core.common.protocol.ServerEndpoint.Builder addReceiverBuilder(
        int index) {
      return getReceiverFieldBuilder().addBuilder(
          index, com.v2ray.core.common.protocol.ServerEndpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.ServerEndpoint Receiver = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.ServerEndpoint.Builder> 
         getReceiverBuilderList() {
      return getReceiverFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.ServerEndpoint, com.v2ray.core.common.protocol.ServerEndpoint.Builder, com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
        getReceiverFieldBuilder() {
      if (receiverBuilder_ == null) {
        receiverBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.common.protocol.ServerEndpoint, com.v2ray.core.common.protocol.ServerEndpoint.Builder, com.v2ray.core.common.protocol.ServerEndpointOrBuilder>(
                receiver_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        receiver_ = null;
      }
      return receiverBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.vmess.outbound.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.vmess.outbound.Config)
  private static final com.v2ray.core.proxy.vmess.outbound.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.proxy.vmess.outbound.Config();
  }

  public static com.v2ray.core.proxy.vmess.outbound.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
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

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.proxy.vmess.outbound.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

