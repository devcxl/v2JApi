// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/command/command.proto

package com.v2ray.core.app.stats.command;

public interface QueryStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.stats.command.QueryStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .v2ray.core.app.stats.command.Stat stat = 1;</code>
   */
  java.util.List<com.v2ray.core.app.stats.command.Stat> 
      getStatList();
  /**
   * <code>repeated .v2ray.core.app.stats.command.Stat stat = 1;</code>
   */
  com.v2ray.core.app.stats.command.Stat getStat(int index);
  /**
   * <code>repeated .v2ray.core.app.stats.command.Stat stat = 1;</code>
   */
  int getStatCount();
  /**
   * <code>repeated .v2ray.core.app.stats.command.Stat stat = 1;</code>
   */
  java.util.List<? extends com.v2ray.core.app.stats.command.StatOrBuilder> 
      getStatOrBuilderList();
  /**
   * <code>repeated .v2ray.core.app.stats.command.Stat stat = 1;</code>
   */
  com.v2ray.core.app.stats.command.StatOrBuilder getStatOrBuilder(
      int index);
}