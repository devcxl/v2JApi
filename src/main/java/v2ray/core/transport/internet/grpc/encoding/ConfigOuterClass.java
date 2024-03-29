// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/grpc/config.proto

package v2ray.core.transport.internet.grpc.encoding;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:v2ray.core.transport.internet.grpc.encoding.Config)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string host = 1;</code>
     * @return The host.
     */
    java.lang.String getHost();
    /**
     * <code>string host = 1;</code>
     * @return The bytes for host.
     */
    com.google.protobuf.ByteString
        getHostBytes();

    /**
     * <code>string service_name = 2;</code>
     * @return The serviceName.
     */
    java.lang.String getServiceName();
    /**
     * <code>string service_name = 2;</code>
     * @return The bytes for serviceName.
     */
    com.google.protobuf.ByteString
        getServiceNameBytes();
  }
  /**
   * Protobuf type {@code v2ray.core.transport.internet.grpc.encoding.Config}
   */
  public static final class Config extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.grpc.encoding.Config)
      ConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Config.newBuilder() to construct.
    private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Config() {
      host_ = "";
      serviceName_ = "";
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
      return v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.internal_static_v2ray_core_transport_internet_grpc_encoding_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.internal_static_v2ray_core_transport_internet_grpc_encoding_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.class, v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.Builder.class);
    }

    public static final int HOST_FIELD_NUMBER = 1;
    private volatile java.lang.Object host_;
    /**
     * <code>string host = 1;</code>
     * @return The host.
     */
    @java.lang.Override
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>string host = 1;</code>
     * @return The bytes for host.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVICE_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object serviceName_;
    /**
     * <code>string service_name = 2;</code>
     * @return The serviceName.
     */
    @java.lang.Override
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      }
    }
    /**
     * <code>string service_name = 2;</code>
     * @return The bytes for serviceName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceName_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceName_);
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
      if (!(obj instanceof v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config)) {
        return super.equals(obj);
      }
      v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config other = (v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config) obj;

      if (!getHost()
          .equals(other.getHost())) return false;
      if (!getServiceName()
          .equals(other.getServiceName())) return false;
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
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getServiceName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config parseFrom(
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
    public static Builder newBuilder(v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config prototype) {
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
     * Protobuf type {@code v2ray.core.transport.internet.grpc.encoding.Config}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.grpc.encoding.Config)
        v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.ConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.internal_static_v2ray_core_transport_internet_grpc_encoding_Config_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.internal_static_v2ray_core_transport_internet_grpc_encoding_Config_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.class, v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.Builder.class);
      }

      // Construct using v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        host_ = "";

        serviceName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.internal_static_v2ray_core_transport_internet_grpc_encoding_Config_descriptor;
      }

      @java.lang.Override
      public v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config getDefaultInstanceForType() {
        return v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.getDefaultInstance();
      }

      @java.lang.Override
      public v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config build() {
        v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config buildPartial() {
        v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config result = new v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config(this);
        result.host_ = host_;
        result.serviceName_ = serviceName_;
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
        if (other instanceof v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config) {
          return mergeFrom((v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config other) {
        if (other == v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config.getDefaultInstance()) return this;
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          onChanged();
        }
        if (!other.getServiceName().isEmpty()) {
          serviceName_ = other.serviceName_;
          onChanged();
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
                host_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 18: {
                serviceName_ = input.readStringRequireUtf8();

                break;
              } // case 18
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

      private java.lang.Object host_ = "";
      /**
       * <code>string host = 1;</code>
       * @return The host.
       */
      public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string host = 1;</code>
       * @return The bytes for host.
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string host = 1;</code>
       * @param value The host to set.
       * @return This builder for chaining.
       */
      public Builder setHost(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        host_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string host = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHost() {
        
        host_ = getDefaultInstance().getHost();
        onChanged();
        return this;
      }
      /**
       * <code>string host = 1;</code>
       * @param value The bytes for host to set.
       * @return This builder for chaining.
       */
      public Builder setHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        host_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serviceName_ = "";
      /**
       * <code>string service_name = 2;</code>
       * @return The serviceName.
       */
      public java.lang.String getServiceName() {
        java.lang.Object ref = serviceName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serviceName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string service_name = 2;</code>
       * @return The bytes for serviceName.
       */
      public com.google.protobuf.ByteString
          getServiceNameBytes() {
        java.lang.Object ref = serviceName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serviceName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string service_name = 2;</code>
       * @param value The serviceName to set.
       * @return This builder for chaining.
       */
      public Builder setServiceName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        serviceName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string service_name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearServiceName() {
        
        serviceName_ = getDefaultInstance().getServiceName();
        onChanged();
        return this;
      }
      /**
       * <code>string service_name = 2;</code>
       * @param value The bytes for serviceName to set.
       * @return This builder for chaining.
       */
      public Builder setServiceNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        serviceName_ = value;
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


      // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.grpc.encoding.Config)
    }

    // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.grpc.encoding.Config)
    private static final v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config();
    }

    public static v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config getDefaultInstance() {
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
    public v2ray.core.transport.internet.grpc.encoding.ConfigOuterClass.Config getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_grpc_encoding_Config_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_grpc_encoding_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$transport/internet/grpc/config.proto\022+" +
      "v2ray.core.transport.internet.grpc.encod" +
      "ing\",\n\006Config\022\014\n\004host\030\001 \001(\t\022\024\n\014service_n" +
      "ame\030\002 \001(\tB8Z6github.com/v2fly/v2ray-core" +
      "/v4/transport/internet/grpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_v2ray_core_transport_internet_grpc_encoding_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_grpc_encoding_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_grpc_encoding_Config_descriptor,
        new java.lang.String[] { "Host", "ServiceName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
