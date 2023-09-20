// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

/**
 * Protobuf type {@code v2ray.core.app.proxyman.SniffingConfig}
 */
public final class SniffingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.proxyman.SniffingConfig)
    SniffingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SniffingConfig.newBuilder() to construct.
  private SniffingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SniffingConfig() {
    destinationOverride_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SniffingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SniffingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SniffingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.proxyman.SniffingConfig.class, com.v2ray.core.app.proxyman.SniffingConfig.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <pre>
   * Whether or not to enable content sniffing on an inbound connection.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int DESTINATION_OVERRIDE_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList destinationOverride_;
  /**
   * <pre>
   * Override target destination if sniff'ed protocol is in the given list.
   * Supported values are "http", "tls", "fakedns".
   * </pre>
   *
   * <code>repeated string destination_override = 2;</code>
   * @return A list containing the destinationOverride.
   */
  public com.google.protobuf.ProtocolStringList
      getDestinationOverrideList() {
    return destinationOverride_;
  }
  /**
   * <pre>
   * Override target destination if sniff'ed protocol is in the given list.
   * Supported values are "http", "tls", "fakedns".
   * </pre>
   *
   * <code>repeated string destination_override = 2;</code>
   * @return The count of destinationOverride.
   */
  public int getDestinationOverrideCount() {
    return destinationOverride_.size();
  }
  /**
   * <pre>
   * Override target destination if sniff'ed protocol is in the given list.
   * Supported values are "http", "tls", "fakedns".
   * </pre>
   *
   * <code>repeated string destination_override = 2;</code>
   * @param index The index of the element to return.
   * @return The destinationOverride at the given index.
   */
  public java.lang.String getDestinationOverride(int index) {
    return destinationOverride_.get(index);
  }
  /**
   * <pre>
   * Override target destination if sniff'ed protocol is in the given list.
   * Supported values are "http", "tls", "fakedns".
   * </pre>
   *
   * <code>repeated string destination_override = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the destinationOverride at the given index.
   */
  public com.google.protobuf.ByteString
      getDestinationOverrideBytes(int index) {
    return destinationOverride_.getByteString(index);
  }

  public static final int METADATA_ONLY_FIELD_NUMBER = 3;
  private boolean metadataOnly_;
  /**
   * <pre>
   * Whether should only try to sniff metadata without waiting for client input.
   * Can be used to support SMTP like protocol where server send the first message.
   * </pre>
   *
   * <code>bool metadata_only = 3;</code>
   * @return The metadataOnly.
   */
  @java.lang.Override
  public boolean getMetadataOnly() {
    return metadataOnly_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    for (int i = 0; i < destinationOverride_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationOverride_.getRaw(i));
    }
    if (metadataOnly_ != false) {
      output.writeBool(3, metadataOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < destinationOverride_.size(); i++) {
        dataSize += computeStringSizeNoTag(destinationOverride_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDestinationOverrideList().size();
    }
    if (metadataOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, metadataOnly_);
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
    if (!(obj instanceof com.v2ray.core.app.proxyman.SniffingConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.proxyman.SniffingConfig other = (com.v2ray.core.app.proxyman.SniffingConfig) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (!getDestinationOverrideList()
        .equals(other.getDestinationOverrideList())) return false;
    if (getMetadataOnly()
        != other.getMetadataOnly()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    if (getDestinationOverrideCount() > 0) {
      hash = (37 * hash) + DESTINATION_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getDestinationOverrideList().hashCode();
    }
    hash = (37 * hash) + METADATA_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMetadataOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.SniffingConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.proxyman.SniffingConfig prototype) {
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
   * Protobuf type {@code v2ray.core.app.proxyman.SniffingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.proxyman.SniffingConfig)
      com.v2ray.core.app.proxyman.SniffingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SniffingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SniffingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.proxyman.SniffingConfig.class, com.v2ray.core.app.proxyman.SniffingConfig.Builder.class);
    }

    // Construct using com.v2ray.core.app.proxyman.SniffingConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;

      destinationOverride_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      metadataOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SniffingConfig_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.app.proxyman.SniffingConfig getDefaultInstanceForType() {
      return com.v2ray.core.app.proxyman.SniffingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.app.proxyman.SniffingConfig build() {
      com.v2ray.core.app.proxyman.SniffingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.app.proxyman.SniffingConfig buildPartial() {
      com.v2ray.core.app.proxyman.SniffingConfig result = new com.v2ray.core.app.proxyman.SniffingConfig(this);
      int from_bitField0_ = bitField0_;
      result.enabled_ = enabled_;
      if (((bitField0_ & 0x00000001) != 0)) {
        destinationOverride_ = destinationOverride_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.destinationOverride_ = destinationOverride_;
      result.metadataOnly_ = metadataOnly_;
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
      if (other instanceof com.v2ray.core.app.proxyman.SniffingConfig) {
        return mergeFrom((com.v2ray.core.app.proxyman.SniffingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.proxyman.SniffingConfig other) {
      if (other == com.v2ray.core.app.proxyman.SniffingConfig.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (!other.destinationOverride_.isEmpty()) {
        if (destinationOverride_.isEmpty()) {
          destinationOverride_ = other.destinationOverride_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDestinationOverrideIsMutable();
          destinationOverride_.addAll(other.destinationOverride_);
        }
        onChanged();
      }
      if (other.getMetadataOnly() != false) {
        setMetadataOnly(other.getMetadataOnly());
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
            case 8: {
              enabled_ = input.readBool();

              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDestinationOverrideIsMutable();
              destinationOverride_.add(s);
              break;
            } // case 18
            case 24: {
              metadataOnly_ = input.readBool();

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
    private int bitField0_;

    private boolean enabled_ ;
    /**
     * <pre>
     * Whether or not to enable content sniffing on an inbound connection.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Whether or not to enable content sniffing on an inbound connection.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to enable content sniffing on an inbound connection.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList destinationOverride_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDestinationOverrideIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        destinationOverride_ = new com.google.protobuf.LazyStringArrayList(destinationOverride_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @return A list containing the destinationOverride.
     */
    public com.google.protobuf.ProtocolStringList
        getDestinationOverrideList() {
      return destinationOverride_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @return The count of destinationOverride.
     */
    public int getDestinationOverrideCount() {
      return destinationOverride_.size();
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @param index The index of the element to return.
     * @return The destinationOverride at the given index.
     */
    public java.lang.String getDestinationOverride(int index) {
      return destinationOverride_.get(index);
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the destinationOverride at the given index.
     */
    public com.google.protobuf.ByteString
        getDestinationOverrideBytes(int index) {
      return destinationOverride_.getByteString(index);
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @param index The index to set the value at.
     * @param value The destinationOverride to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationOverride(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDestinationOverrideIsMutable();
      destinationOverride_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @param value The destinationOverride to add.
     * @return This builder for chaining.
     */
    public Builder addDestinationOverride(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDestinationOverrideIsMutable();
      destinationOverride_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @param values The destinationOverride to add.
     * @return This builder for chaining.
     */
    public Builder addAllDestinationOverride(
        java.lang.Iterable<java.lang.String> values) {
      ensureDestinationOverrideIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, destinationOverride_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationOverride() {
      destinationOverride_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Override target destination if sniff'ed protocol is in the given list.
     * Supported values are "http", "tls", "fakedns".
     * </pre>
     *
     * <code>repeated string destination_override = 2;</code>
     * @param value The bytes of the destinationOverride to add.
     * @return This builder for chaining.
     */
    public Builder addDestinationOverrideBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDestinationOverrideIsMutable();
      destinationOverride_.add(value);
      onChanged();
      return this;
    }

    private boolean metadataOnly_ ;
    /**
     * <pre>
     * Whether should only try to sniff metadata without waiting for client input.
     * Can be used to support SMTP like protocol where server send the first message.
     * </pre>
     *
     * <code>bool metadata_only = 3;</code>
     * @return The metadataOnly.
     */
    @java.lang.Override
    public boolean getMetadataOnly() {
      return metadataOnly_;
    }
    /**
     * <pre>
     * Whether should only try to sniff metadata without waiting for client input.
     * Can be used to support SMTP like protocol where server send the first message.
     * </pre>
     *
     * <code>bool metadata_only = 3;</code>
     * @param value The metadataOnly to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataOnly(boolean value) {
      
      metadataOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether should only try to sniff metadata without waiting for client input.
     * Can be used to support SMTP like protocol where server send the first message.
     * </pre>
     *
     * <code>bool metadata_only = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadataOnly() {
      
      metadataOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.proxyman.SniffingConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.proxyman.SniffingConfig)
  private static final com.v2ray.core.app.proxyman.SniffingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.proxyman.SniffingConfig();
  }

  public static com.v2ray.core.app.proxyman.SniffingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SniffingConfig>
      PARSER = new com.google.protobuf.AbstractParser<SniffingConfig>() {
    @java.lang.Override
    public SniffingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SniffingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SniffingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.app.proxyman.SniffingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
