// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/tcp/config.proto

package com.v2ray.core.transport.internet.tcp;

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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_tcp_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_tcp_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#transport/internet/tcp/config.proto\022!v" +
      "2ray.core.transport.internet.tcp\032!common" +
      "/serial/typed_message.proto\"n\n\006Config\022?\n" +
      "\017header_settings\030\002 \001(\0132&.v2ray.core.comm" +
      "on.serial.TypedMessage\022\035\n\025accept_proxy_p" +
      "rotocol\030\003 \001(\010J\004\010\001\020\002B\204\001\n%com.v2ray.core.t" +
      "ransport.internet.tcpP\001Z5github.com/v2fl" +
      "y/v2ray-core/v4/transport/internet/tcp\252\002" +
      "!V2Ray.Core.Transport.Internet.Tcpb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_transport_internet_tcp_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_tcp_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_tcp_Config_descriptor,
        new java.lang.String[] { "HeaderSettings", "AcceptProxyProtocol", });
    com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
