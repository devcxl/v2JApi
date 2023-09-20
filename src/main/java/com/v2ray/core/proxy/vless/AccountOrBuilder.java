// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vless/account.proto

package com.v2ray.core.proxy.vless;

public interface AccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.proxy.vless.Account)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Flow settings.
   * </pre>
   *
   * <code>string flow = 2;</code>
   * @return The flow.
   */
  java.lang.String getFlow();
  /**
   * <pre>
   * Flow settings.
   * </pre>
   *
   * <code>string flow = 2;</code>
   * @return The bytes for flow.
   */
  com.google.protobuf.ByteString
      getFlowBytes();

  /**
   * <pre>
   * Encryption settings. Only applies to client side, and only accepts "none" for now.
   * </pre>
   *
   * <code>string encryption = 3;</code>
   * @return The encryption.
   */
  java.lang.String getEncryption();
  /**
   * <pre>
   * Encryption settings. Only applies to client side, and only accepts "none" for now.
   * </pre>
   *
   * <code>string encryption = 3;</code>
   * @return The bytes for encryption.
   */
  com.google.protobuf.ByteString
      getEncryptionBytes();
}
