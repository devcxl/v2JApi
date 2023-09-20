// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/protocol/server_spec.proto

package com.v2ray.core.common.protocol;

/**
 * Protobuf type {@code v2ray.core.common.protocol.ServerEndpoint}
 */
public final class ServerEndpoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.common.protocol.ServerEndpoint)
    ServerEndpointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerEndpoint.newBuilder() to construct.
  private ServerEndpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerEndpoint() {
    user_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerEndpoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.common.protocol.ServerSpec.internal_static_v2ray_core_common_protocol_ServerEndpoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.common.protocol.ServerSpec.internal_static_v2ray_core_common_protocol_ServerEndpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.common.protocol.ServerEndpoint.class, com.v2ray.core.common.protocol.ServerEndpoint.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private com.v2ray.core.common.net.IPOrDomain address_;
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public com.v2ray.core.common.net.IPOrDomain getAddress() {
    return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
  }
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <code>uint32 port = 2;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int USER_FIELD_NUMBER = 3;
  private java.util.List<com.v2ray.core.common.protocol.User> user_;
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.v2ray.core.common.protocol.User> getUserList() {
    return user_;
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.v2ray.core.common.protocol.UserOrBuilder> 
      getUserOrBuilderList() {
    return user_;
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
   */
  @java.lang.Override
  public int getUserCount() {
    return user_.size();
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.protocol.User getUser(int index) {
    return user_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
   */
  @java.lang.Override
  public com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder(
      int index) {
    return user_.get(index);
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
    if (address_ != null) {
      output.writeMessage(1, getAddress());
    }
    if (port_ != 0) {
      output.writeUInt32(2, port_);
    }
    for (int i = 0; i < user_.size(); i++) {
      output.writeMessage(3, user_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAddress());
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, port_);
    }
    for (int i = 0; i < user_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, user_.get(i));
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
    if (!(obj instanceof com.v2ray.core.common.protocol.ServerEndpoint)) {
      return super.equals(obj);
    }
    com.v2ray.core.common.protocol.ServerEndpoint other = (com.v2ray.core.common.protocol.ServerEndpoint) obj;

    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (getPort()
        != other.getPort()) return false;
    if (!getUserList()
        .equals(other.getUserList())) return false;
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
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    if (getUserCount() > 0) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.ServerEndpoint parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.common.protocol.ServerEndpoint prototype) {
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
   * Protobuf type {@code v2ray.core.common.protocol.ServerEndpoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.common.protocol.ServerEndpoint)
      com.v2ray.core.common.protocol.ServerEndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.protocol.ServerSpec.internal_static_v2ray_core_common_protocol_ServerEndpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.protocol.ServerSpec.internal_static_v2ray_core_common_protocol_ServerEndpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.common.protocol.ServerEndpoint.class, com.v2ray.core.common.protocol.ServerEndpoint.Builder.class);
    }

    // Construct using com.v2ray.core.common.protocol.ServerEndpoint.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      port_ = 0;

      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
      } else {
        user_ = null;
        userBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.common.protocol.ServerSpec.internal_static_v2ray_core_common_protocol_ServerEndpoint_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.common.protocol.ServerEndpoint getDefaultInstanceForType() {
      return com.v2ray.core.common.protocol.ServerEndpoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.common.protocol.ServerEndpoint build() {
      com.v2ray.core.common.protocol.ServerEndpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.common.protocol.ServerEndpoint buildPartial() {
      com.v2ray.core.common.protocol.ServerEndpoint result = new com.v2ray.core.common.protocol.ServerEndpoint(this);
      int from_bitField0_ = bitField0_;
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.port_ = port_;
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          user_ = java.util.Collections.unmodifiableList(user_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
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
      if (other instanceof com.v2ray.core.common.protocol.ServerEndpoint) {
        return mergeFrom((com.v2ray.core.common.protocol.ServerEndpoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.common.protocol.ServerEndpoint other) {
      if (other == com.v2ray.core.common.protocol.ServerEndpoint.getDefaultInstance()) return this;
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (userBuilder_ == null) {
        if (!other.user_.isEmpty()) {
          if (user_.isEmpty()) {
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserIsMutable();
            user_.addAll(other.user_);
          }
          onChanged();
        }
      } else {
        if (!other.user_.isEmpty()) {
          if (userBuilder_.isEmpty()) {
            userBuilder_.dispose();
            userBuilder_ = null;
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserFieldBuilder() : null;
          } else {
            userBuilder_.addAllMessages(other.user_);
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
              input.readMessage(
                  getAddressFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 16: {
              port_ = input.readUInt32();

              break;
            } // case 16
            case 26: {
              com.v2ray.core.common.protocol.User m =
                  input.readMessage(
                      com.v2ray.core.common.protocol.User.parser(),
                      extensionRegistry);
              if (userBuilder_ == null) {
                ensureUserIsMutable();
                user_.add(m);
              } else {
                userBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private com.v2ray.core.common.net.IPOrDomain address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> addressBuilder_;
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     * @return The address.
     */
    public com.v2ray.core.common.net.IPOrDomain getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder setAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder setAddress(
        com.v2ray.core.common.net.IPOrDomain.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder mergeAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.v2ray.core.common.net.IPOrDomain.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private int port_ ;
    /**
     * <code>uint32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>uint32 port = 2;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 port = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.v2ray.core.common.protocol.User> user_ =
      java.util.Collections.emptyList();
    private void ensureUserIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        user_ = new java.util.ArrayList<com.v2ray.core.common.protocol.User>(user_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder> userBuilder_;

    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.User> getUserList() {
      if (userBuilder_ == null) {
        return java.util.Collections.unmodifiableList(user_);
      } else {
        return userBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public int getUserCount() {
      if (userBuilder_ == null) {
        return user_.size();
      } else {
        return userBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public com.v2ray.core.common.protocol.User getUser(int index) {
      if (userBuilder_ == null) {
        return user_.get(index);
      } else {
        return userBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder setUser(
        int index, com.v2ray.core.common.protocol.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.set(index, value);
        onChanged();
      } else {
        userBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder setUser(
        int index, com.v2ray.core.common.protocol.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.set(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder addUser(com.v2ray.core.common.protocol.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(value);
        onChanged();
      } else {
        userBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder addUser(
        int index, com.v2ray.core.common.protocol.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(index, value);
        onChanged();
      } else {
        userBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder addUser(
        com.v2ray.core.common.protocol.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder addUser(
        int index, com.v2ray.core.common.protocol.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder addAllUser(
        java.lang.Iterable<? extends com.v2ray.core.common.protocol.User> values) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, user_);
        onChanged();
      } else {
        userBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public Builder removeUser(int index) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.remove(index);
        onChanged();
      } else {
        userBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public com.v2ray.core.common.protocol.User.Builder getUserBuilder(
        int index) {
      return getUserFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder(
        int index) {
      if (userBuilder_ == null) {
        return user_.get(index);  } else {
        return userBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public java.util.List<? extends com.v2ray.core.common.protocol.UserOrBuilder> 
         getUserOrBuilderList() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(user_);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public com.v2ray.core.common.protocol.User.Builder addUserBuilder() {
      return getUserFieldBuilder().addBuilder(
          com.v2ray.core.common.protocol.User.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public com.v2ray.core.common.protocol.User.Builder addUserBuilder(
        int index) {
      return getUserFieldBuilder().addBuilder(
          index, com.v2ray.core.common.protocol.User.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 3;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.User.Builder> 
         getUserBuilderList() {
      return getUserFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder>(
                user_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.common.protocol.ServerEndpoint)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.common.protocol.ServerEndpoint)
  private static final com.v2ray.core.common.protocol.ServerEndpoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.common.protocol.ServerEndpoint();
  }

  public static com.v2ray.core.common.protocol.ServerEndpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerEndpoint>
      PARSER = new com.google.protobuf.AbstractParser<ServerEndpoint>() {
    @java.lang.Override
    public ServerEndpoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServerEndpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerEndpoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.common.protocol.ServerEndpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

