// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/config.proto

package com.v2ray.core.app.stats;

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
    internal_static_v2ray_core_app_stats_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_stats_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_stats_ChannelConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_stats_ChannelConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026app/stats/config.proto\022\024v2ray.core.app" +
      ".stats\"\010\n\006Config\"N\n\rChannelConfig\022\020\n\010Blo" +
      "cking\030\001 \001(\010\022\027\n\017SubscriberLimit\030\002 \001(\005\022\022\n\n" +
      "BufferSize\030\003 \001(\005B]\n\030com.v2ray.core.app.s" +
      "tatsP\001Z(github.com/v2fly/v2ray-core/v4/a" +
      "pp/stats\252\002\024V2Ray.Core.App.Statsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_v2ray_core_app_stats_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_app_stats_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_stats_Config_descriptor,
        new java.lang.String[] { });
    internal_static_v2ray_core_app_stats_ChannelConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_app_stats_ChannelConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_stats_ChannelConfig_descriptor,
        new java.lang.String[] { "Blocking", "SubscriberLimit", "BufferSize", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
