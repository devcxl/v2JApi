// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: config.proto

package com.v2ray.core;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .v2ray.core.InboundHandlerConfig inbound = 1;</code>
   */
  java.util.List<com.v2ray.core.InboundHandlerConfig> 
      getInboundList();
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .v2ray.core.InboundHandlerConfig inbound = 1;</code>
   */
  com.v2ray.core.InboundHandlerConfig getInbound(int index);
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .v2ray.core.InboundHandlerConfig inbound = 1;</code>
   */
  int getInboundCount();
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .v2ray.core.InboundHandlerConfig inbound = 1;</code>
   */
  java.util.List<? extends com.v2ray.core.InboundHandlerConfigOrBuilder> 
      getInboundOrBuilderList();
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .v2ray.core.InboundHandlerConfig inbound = 1;</code>
   */
  com.v2ray.core.InboundHandlerConfigOrBuilder getInboundOrBuilder(
      int index);

  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .v2ray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  java.util.List<com.v2ray.core.OutboundHandlerConfig> 
      getOutboundList();
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .v2ray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  com.v2ray.core.OutboundHandlerConfig getOutbound(int index);
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .v2ray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  int getOutboundCount();
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .v2ray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  java.util.List<? extends com.v2ray.core.OutboundHandlerConfigOrBuilder> 
      getOutboundOrBuilderList();
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .v2ray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  com.v2ray.core.OutboundHandlerConfigOrBuilder getOutboundOrBuilder(
      int index);

  /**
   * <pre>
   * App is for configurations of all features in V2Ray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage app = 4;</code>
   */
  java.util.List<com.v2ray.core.common.serial.TypedMessage> 
      getAppList();
  /**
   * <pre>
   * App is for configurations of all features in V2Ray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage app = 4;</code>
   */
  com.v2ray.core.common.serial.TypedMessage getApp(int index);
  /**
   * <pre>
   * App is for configurations of all features in V2Ray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage app = 4;</code>
   */
  int getAppCount();
  /**
   * <pre>
   * App is for configurations of all features in V2Ray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage app = 4;</code>
   */
  java.util.List<? extends com.v2ray.core.common.serial.TypedMessageOrBuilder> 
      getAppOrBuilderList();
  /**
   * <pre>
   * App is for configurations of all features in V2Ray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage app = 4;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getAppOrBuilder(
      int index);

  /**
   * <pre>
   * Transport settings.
   * Deprecated. Each inbound and outbound should choose their own transport
   * config. Date to remove: 2020-01-13
   * </pre>
   *
   * <code>.v2ray.core.transport.Config transport = 5 [deprecated = true];</code>
   * @deprecated v2ray.core.Config.transport is deprecated.
   *     See config.proto;l=31
   * @return Whether the transport field is set.
   */
  @java.lang.Deprecated boolean hasTransport();
  /**
   * <pre>
   * Transport settings.
   * Deprecated. Each inbound and outbound should choose their own transport
   * config. Date to remove: 2020-01-13
   * </pre>
   *
   * <code>.v2ray.core.transport.Config transport = 5 [deprecated = true];</code>
   * @deprecated v2ray.core.Config.transport is deprecated.
   *     See config.proto;l=31
   * @return The transport.
   */
  @java.lang.Deprecated com.v2ray.core.transport.Config getTransport();
  /**
   * <pre>
   * Transport settings.
   * Deprecated. Each inbound and outbound should choose their own transport
   * config. Date to remove: 2020-01-13
   * </pre>
   *
   * <code>.v2ray.core.transport.Config transport = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.v2ray.core.transport.ConfigOrBuilder getTransportOrBuilder();

  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into V2Ray. V2Ray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage extension = 6;</code>
   */
  java.util.List<com.v2ray.core.common.serial.TypedMessage> 
      getExtensionList();
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into V2Ray. V2Ray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage extension = 6;</code>
   */
  com.v2ray.core.common.serial.TypedMessage getExtension(int index);
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into V2Ray. V2Ray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage extension = 6;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into V2Ray. V2Ray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage extension = 6;</code>
   */
  java.util.List<? extends com.v2ray.core.common.serial.TypedMessageOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into V2Ray. V2Ray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage extension = 6;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getExtensionOrBuilder(
      int index);
}
