// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/http/config.proto

package com.v2ray.core.proxy.http;

public interface ClientConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.proxy.http.ClientConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sever is a list of HTTP server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  java.util.List<com.v2ray.core.common.protocol.ServerEndpoint> 
      getServerList();
  /**
   * <pre>
   * Sever is a list of HTTP server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  com.v2ray.core.common.protocol.ServerEndpoint getServer(int index);
  /**
   * <pre>
   * Sever is a list of HTTP server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  int getServerCount();
  /**
   * <pre>
   * Sever is a list of HTTP server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  java.util.List<? extends com.v2ray.core.common.protocol.ServerEndpointOrBuilder> 
      getServerOrBuilderList();
  /**
   * <pre>
   * Sever is a list of HTTP server addresses.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.protocol.ServerEndpoint server = 1;</code>
   */
  com.v2ray.core.common.protocol.ServerEndpointOrBuilder getServerOrBuilder(
      int index);
}