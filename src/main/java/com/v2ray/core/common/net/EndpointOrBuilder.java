// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/destination.proto

package com.v2ray.core.common.net;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.common.net.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.v2ray.core.common.net.Network network = 1;</code>
   * @return The enum numeric value on the wire for network.
   */
  int getNetworkValue();
  /**
   * <code>.v2ray.core.common.net.Network network = 1;</code>
   * @return The network.
   */
  com.v2ray.core.common.net.Network getNetwork();

  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 2;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 2;</code>
   * @return The address.
   */
  com.v2ray.core.common.net.IPOrDomain getAddress();
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder();

  /**
   * <code>uint32 port = 3;</code>
   * @return The port.
   */
  int getPort();
}