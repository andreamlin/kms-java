// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface UpdateCryptoKeyPrimaryVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to update.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to update.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The id of the child [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
   * </pre>
   *
   * <code>string crypto_key_version_id = 2;</code>
   */
  java.lang.String getCryptoKeyVersionId();
  /**
   * <pre>
   * The id of the child [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
   * </pre>
   *
   * <code>string crypto_key_version_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getCryptoKeyVersionIdBytes();
}
