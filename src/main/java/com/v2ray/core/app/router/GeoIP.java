// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.v2ray.core.app.router;

/**
 * Protobuf type {@code v2ray.core.app.router.GeoIP}
 */
public final class GeoIP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.router.GeoIP)
    GeoIPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeoIP.newBuilder() to construct.
  private GeoIP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeoIP() {
    countryCode_ = "";
    cidr_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GeoIP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoIP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoIP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.router.GeoIP.class, com.v2ray.core.app.router.GeoIP.Builder.class);
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object countryCode_;
  /**
   * <code>string country_code = 1;</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public java.lang.String getCountryCode() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryCode_ = s;
      return s;
    }
  }
  /**
   * <code>string country_code = 1;</code>
   * @return The bytes for countryCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryCodeBytes() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CIDR_FIELD_NUMBER = 2;
  private java.util.List<com.v2ray.core.app.router.CIDR> cidr_;
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.v2ray.core.app.router.CIDR> getCidrList() {
    return cidr_;
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.v2ray.core.app.router.CIDROrBuilder> 
      getCidrOrBuilderList() {
    return cidr_;
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  @java.lang.Override
  public int getCidrCount() {
    return cidr_.size();
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  @java.lang.Override
  public com.v2ray.core.app.router.CIDR getCidr(int index) {
    return cidr_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  @java.lang.Override
  public com.v2ray.core.app.router.CIDROrBuilder getCidrOrBuilder(
      int index) {
    return cidr_.get(index);
  }

  public static final int REVERSE_MATCH_FIELD_NUMBER = 3;
  private boolean reverseMatch_;
  /**
   * <code>bool reverse_match = 3;</code>
   * @return The reverseMatch.
   */
  @java.lang.Override
  public boolean getReverseMatch() {
    return reverseMatch_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, countryCode_);
    }
    for (int i = 0; i < cidr_.size(); i++) {
      output.writeMessage(2, cidr_.get(i));
    }
    if (reverseMatch_ != false) {
      output.writeBool(3, reverseMatch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, countryCode_);
    }
    for (int i = 0; i < cidr_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, cidr_.get(i));
    }
    if (reverseMatch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, reverseMatch_);
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
    if (!(obj instanceof com.v2ray.core.app.router.GeoIP)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.router.GeoIP other = (com.v2ray.core.app.router.GeoIP) obj;

    if (!getCountryCode()
        .equals(other.getCountryCode())) return false;
    if (!getCidrList()
        .equals(other.getCidrList())) return false;
    if (getReverseMatch()
        != other.getReverseMatch()) return false;
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
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode().hashCode();
    if (getCidrCount() > 0) {
      hash = (37 * hash) + CIDR_FIELD_NUMBER;
      hash = (53 * hash) + getCidrList().hashCode();
    }
    hash = (37 * hash) + REVERSE_MATCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReverseMatch());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.router.GeoIP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.router.GeoIP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.router.GeoIP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.router.GeoIP parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.router.GeoIP prototype) {
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
   * Protobuf type {@code v2ray.core.app.router.GeoIP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.router.GeoIP)
      com.v2ray.core.app.router.GeoIPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoIP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoIP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.router.GeoIP.class, com.v2ray.core.app.router.GeoIP.Builder.class);
    }

    // Construct using com.v2ray.core.app.router.GeoIP.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      countryCode_ = "";

      if (cidrBuilder_ == null) {
        cidr_ = java.util.Collections.emptyList();
      } else {
        cidr_ = null;
        cidrBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      reverseMatch_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoIP_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.app.router.GeoIP getDefaultInstanceForType() {
      return com.v2ray.core.app.router.GeoIP.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.app.router.GeoIP build() {
      com.v2ray.core.app.router.GeoIP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.app.router.GeoIP buildPartial() {
      com.v2ray.core.app.router.GeoIP result = new com.v2ray.core.app.router.GeoIP(this);
      int from_bitField0_ = bitField0_;
      result.countryCode_ = countryCode_;
      if (cidrBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cidr_ = java.util.Collections.unmodifiableList(cidr_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cidr_ = cidr_;
      } else {
        result.cidr_ = cidrBuilder_.build();
      }
      result.reverseMatch_ = reverseMatch_;
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
      if (other instanceof com.v2ray.core.app.router.GeoIP) {
        return mergeFrom((com.v2ray.core.app.router.GeoIP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.router.GeoIP other) {
      if (other == com.v2ray.core.app.router.GeoIP.getDefaultInstance()) return this;
      if (!other.getCountryCode().isEmpty()) {
        countryCode_ = other.countryCode_;
        onChanged();
      }
      if (cidrBuilder_ == null) {
        if (!other.cidr_.isEmpty()) {
          if (cidr_.isEmpty()) {
            cidr_ = other.cidr_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCidrIsMutable();
            cidr_.addAll(other.cidr_);
          }
          onChanged();
        }
      } else {
        if (!other.cidr_.isEmpty()) {
          if (cidrBuilder_.isEmpty()) {
            cidrBuilder_.dispose();
            cidrBuilder_ = null;
            cidr_ = other.cidr_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cidrBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCidrFieldBuilder() : null;
          } else {
            cidrBuilder_.addAllMessages(other.cidr_);
          }
        }
      }
      if (other.getReverseMatch() != false) {
        setReverseMatch(other.getReverseMatch());
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
              countryCode_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              com.v2ray.core.app.router.CIDR m =
                  input.readMessage(
                      com.v2ray.core.app.router.CIDR.parser(),
                      extensionRegistry);
              if (cidrBuilder_ == null) {
                ensureCidrIsMutable();
                cidr_.add(m);
              } else {
                cidrBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              reverseMatch_ = input.readBool();

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

    private java.lang.Object countryCode_ = "";
    /**
     * <code>string country_code = 1;</code>
     * @return The countryCode.
     */
    public java.lang.String getCountryCode() {
      java.lang.Object ref = countryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country_code = 1;</code>
     * @return The bytes for countryCode.
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      java.lang.Object ref = countryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country_code = 1;</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      countryCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string country_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      
      countryCode_ = getDefaultInstance().getCountryCode();
      onChanged();
      return this;
    }
    /**
     * <code>string country_code = 1;</code>
     * @param value The bytes for countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      countryCode_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.v2ray.core.app.router.CIDR> cidr_ =
      java.util.Collections.emptyList();
    private void ensureCidrIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cidr_ = new java.util.ArrayList<com.v2ray.core.app.router.CIDR>(cidr_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.app.router.CIDR, com.v2ray.core.app.router.CIDR.Builder, com.v2ray.core.app.router.CIDROrBuilder> cidrBuilder_;

    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public java.util.List<com.v2ray.core.app.router.CIDR> getCidrList() {
      if (cidrBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cidr_);
      } else {
        return cidrBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public int getCidrCount() {
      if (cidrBuilder_ == null) {
        return cidr_.size();
      } else {
        return cidrBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public com.v2ray.core.app.router.CIDR getCidr(int index) {
      if (cidrBuilder_ == null) {
        return cidr_.get(index);
      } else {
        return cidrBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder setCidr(
        int index, com.v2ray.core.app.router.CIDR value) {
      if (cidrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCidrIsMutable();
        cidr_.set(index, value);
        onChanged();
      } else {
        cidrBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder setCidr(
        int index, com.v2ray.core.app.router.CIDR.Builder builderForValue) {
      if (cidrBuilder_ == null) {
        ensureCidrIsMutable();
        cidr_.set(index, builderForValue.build());
        onChanged();
      } else {
        cidrBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder addCidr(com.v2ray.core.app.router.CIDR value) {
      if (cidrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCidrIsMutable();
        cidr_.add(value);
        onChanged();
      } else {
        cidrBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder addCidr(
        int index, com.v2ray.core.app.router.CIDR value) {
      if (cidrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCidrIsMutable();
        cidr_.add(index, value);
        onChanged();
      } else {
        cidrBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder addCidr(
        com.v2ray.core.app.router.CIDR.Builder builderForValue) {
      if (cidrBuilder_ == null) {
        ensureCidrIsMutable();
        cidr_.add(builderForValue.build());
        onChanged();
      } else {
        cidrBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder addCidr(
        int index, com.v2ray.core.app.router.CIDR.Builder builderForValue) {
      if (cidrBuilder_ == null) {
        ensureCidrIsMutable();
        cidr_.add(index, builderForValue.build());
        onChanged();
      } else {
        cidrBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder addAllCidr(
        java.lang.Iterable<? extends com.v2ray.core.app.router.CIDR> values) {
      if (cidrBuilder_ == null) {
        ensureCidrIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cidr_);
        onChanged();
      } else {
        cidrBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder clearCidr() {
      if (cidrBuilder_ == null) {
        cidr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cidrBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public Builder removeCidr(int index) {
      if (cidrBuilder_ == null) {
        ensureCidrIsMutable();
        cidr_.remove(index);
        onChanged();
      } else {
        cidrBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public com.v2ray.core.app.router.CIDR.Builder getCidrBuilder(
        int index) {
      return getCidrFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public com.v2ray.core.app.router.CIDROrBuilder getCidrOrBuilder(
        int index) {
      if (cidrBuilder_ == null) {
        return cidr_.get(index);  } else {
        return cidrBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public java.util.List<? extends com.v2ray.core.app.router.CIDROrBuilder> 
         getCidrOrBuilderList() {
      if (cidrBuilder_ != null) {
        return cidrBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cidr_);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public com.v2ray.core.app.router.CIDR.Builder addCidrBuilder() {
      return getCidrFieldBuilder().addBuilder(
          com.v2ray.core.app.router.CIDR.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public com.v2ray.core.app.router.CIDR.Builder addCidrBuilder(
        int index) {
      return getCidrFieldBuilder().addBuilder(
          index, com.v2ray.core.app.router.CIDR.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
     */
    public java.util.List<com.v2ray.core.app.router.CIDR.Builder> 
         getCidrBuilderList() {
      return getCidrFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.app.router.CIDR, com.v2ray.core.app.router.CIDR.Builder, com.v2ray.core.app.router.CIDROrBuilder> 
        getCidrFieldBuilder() {
      if (cidrBuilder_ == null) {
        cidrBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.app.router.CIDR, com.v2ray.core.app.router.CIDR.Builder, com.v2ray.core.app.router.CIDROrBuilder>(
                cidr_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cidr_ = null;
      }
      return cidrBuilder_;
    }

    private boolean reverseMatch_ ;
    /**
     * <code>bool reverse_match = 3;</code>
     * @return The reverseMatch.
     */
    @java.lang.Override
    public boolean getReverseMatch() {
      return reverseMatch_;
    }
    /**
     * <code>bool reverse_match = 3;</code>
     * @param value The reverseMatch to set.
     * @return This builder for chaining.
     */
    public Builder setReverseMatch(boolean value) {
      
      reverseMatch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool reverse_match = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReverseMatch() {
      
      reverseMatch_ = false;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.router.GeoIP)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.router.GeoIP)
  private static final com.v2ray.core.app.router.GeoIP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.router.GeoIP();
  }

  public static com.v2ray.core.app.router.GeoIP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeoIP>
      PARSER = new com.google.protobuf.AbstractParser<GeoIP>() {
    @java.lang.Override
    public GeoIP parsePartialFrom(
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

  public static com.google.protobuf.Parser<GeoIP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeoIP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.app.router.GeoIP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

