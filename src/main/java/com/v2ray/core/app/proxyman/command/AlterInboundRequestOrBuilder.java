// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/command/command.proto

package com.v2ray.core.app.proxyman.command;

public interface AlterInboundRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.proxyman.command.AlterInboundRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>.v2ray.core.common.serial.TypedMessage operation = 2;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <code>.v2ray.core.common.serial.TypedMessage operation = 2;</code>
   * @return The operation.
   */
  com.v2ray.core.common.serial.TypedMessage getOperation();
  /**
   * <code>.v2ray.core.common.serial.TypedMessage operation = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getOperationOrBuilder();
}