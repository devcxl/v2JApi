// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vless/encoding/addons.proto

package com.v2ray.core.proxy.vless.encoding;

public final class AddonsOuterClass {
  private AddonsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_vless_encoding_Addons_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_vless_encoding_Addons_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!proxy/vless/encoding/addons.proto\022\037v2r" +
      "ay.core.proxy.vless.encoding\"$\n\006Addons\022\014" +
      "\n\004Flow\030\001 \001(\t\022\014\n\004Seed\030\002 \001(\014B~\n#com.v2ray." +
      "core.proxy.vless.encodingP\001Z3github.com/" +
      "v2fly/v2ray-core/v4/proxy/vless/encoding" +
      "\252\002\037V2Ray.Core.Proxy.Vless.Encodingb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_v2ray_core_proxy_vless_encoding_Addons_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_proxy_vless_encoding_Addons_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_vless_encoding_Addons_descriptor,
        new java.lang.String[] { "Flow", "Seed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}