// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/mtproto/config.proto

package com.v2ray.core.proxy.mtproto;

public final class Config {
  private Config() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_mtproto_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_mtproto_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_mtproto_ServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_mtproto_ServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_mtproto_ClientConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_mtproto_ClientConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032proxy/mtproto/config.proto\022\030v2ray.core" +
      ".proxy.mtproto\032\032common/protocol/user.pro" +
      "to\"\031\n\007Account\022\016\n\006secret\030\001 \001(\014\">\n\014ServerC" +
      "onfig\022.\n\004user\030\001 \003(\0132 .v2ray.core.common." +
      "protocol.User\"\016\n\014ClientConfigBi\n\034com.v2r" +
      "ay.core.proxy.mtprotoP\001Z,github.com/v2fl" +
      "y/v2ray-core/v4/proxy/mtproto\252\002\030V2Ray.Co" +
      "re.Proxy.Mtprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.protocol.UserOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_proxy_mtproto_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_proxy_mtproto_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_mtproto_Account_descriptor,
        new java.lang.String[] { "Secret", });
    internal_static_v2ray_core_proxy_mtproto_ServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_proxy_mtproto_ServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_mtproto_ServerConfig_descriptor,
        new java.lang.String[] { "User", });
    internal_static_v2ray_core_proxy_mtproto_ClientConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_proxy_mtproto_ClientConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_mtproto_ClientConfig_descriptor,
        new java.lang.String[] { });
    com.v2ray.core.common.protocol.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
