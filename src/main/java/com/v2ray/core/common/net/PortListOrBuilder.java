// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/port.proto

package com.v2ray.core.common.net;

public interface PortListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.common.net.PortList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .v2ray.core.common.net.PortRange range = 1;</code>
   */
  java.util.List<com.v2ray.core.common.net.PortRange> 
      getRangeList();
  /**
   * <code>repeated .v2ray.core.common.net.PortRange range = 1;</code>
   */
  com.v2ray.core.common.net.PortRange getRange(int index);
  /**
   * <code>repeated .v2ray.core.common.net.PortRange range = 1;</code>
   */
  int getRangeCount();
  /**
   * <code>repeated .v2ray.core.common.net.PortRange range = 1;</code>
   */
  java.util.List<? extends com.v2ray.core.common.net.PortRangeOrBuilder> 
      getRangeOrBuilderList();
  /**
   * <code>repeated .v2ray.core.common.net.PortRange range = 1;</code>
   */
  com.v2ray.core.common.net.PortRangeOrBuilder getRangeOrBuilder(
      int index);
}
