// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/protocol/headers.proto

package com.v2ray.core.common.protocol;

public final class Headers {
  private Headers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_protocol_SecurityConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_protocol_SecurityConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035common/protocol/headers.proto\022\032v2ray.c" +
      "ore.common.protocol\"H\n\016SecurityConfig\0226\n" +
      "\004type\030\001 \001(\0162(.v2ray.core.common.protocol" +
      ".SecurityType*l\n\014SecurityType\022\013\n\007UNKNOWN" +
      "\020\000\022\n\n\006LEGACY\020\001\022\010\n\004AUTO\020\002\022\016\n\nAES128_GCM\020\003" +
      "\022\025\n\021CHACHA20_POLY1305\020\004\022\010\n\004NONE\020\005\022\010\n\004ZER" +
      "O\020\006Bo\n\036com.v2ray.core.common.protocolP\001Z" +
      ".github.com/v2fly/v2ray-core/v4/common/p" +
      "rotocol\252\002\032V2Ray.Core.Common.Protocolb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_v2ray_core_common_protocol_SecurityConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_common_protocol_SecurityConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_protocol_SecurityConfig_descriptor,
        new java.lang.String[] { "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
