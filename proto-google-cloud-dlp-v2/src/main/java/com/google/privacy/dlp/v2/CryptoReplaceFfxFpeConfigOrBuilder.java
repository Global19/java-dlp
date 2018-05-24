// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CryptoReplaceFfxFpeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key used by the encryption algorithm. [required]
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   */
  boolean hasCryptoKey();
  /**
   * <pre>
   * The key used by the encryption algorithm. [required]
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   */
  com.google.privacy.dlp.v2.CryptoKey getCryptoKey();
  /**
   * <pre>
   * The key used by the encryption algorithm. [required]
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   */
  com.google.privacy.dlp.v2.CryptoKeyOrBuilder getCryptoKeyOrBuilder();

  /**
   * <pre>
   * The 'tweak', a context may be used for higher security since the same
   * identifier in two different contexts won't be given the same surrogate. If
   * the context is not set, a default tweak will be used.
   * If the context is set but:
   * 1. there is no record present when transforming a given value or
   * 1. the field is not present when transforming a given value,
   * a default tweak will be used.
   * Note that case (1) is expected when an `InfoTypeTransformation` is
   * applied to both structured and non-structured `ContentItem`s.
   * Currently, the referenced field may be of value type integer or string.
   * The tweak is constructed as a sequence of bytes in big endian byte order
   * such that:
   * - a 64 bit integer is encoded followed by a single byte of value 1
   * - a string is encoded in UTF-8 format followed by a single byte of value 2
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 2;</code>
   */
  boolean hasContext();
  /**
   * <pre>
   * The 'tweak', a context may be used for higher security since the same
   * identifier in two different contexts won't be given the same surrogate. If
   * the context is not set, a default tweak will be used.
   * If the context is set but:
   * 1. there is no record present when transforming a given value or
   * 1. the field is not present when transforming a given value,
   * a default tweak will be used.
   * Note that case (1) is expected when an `InfoTypeTransformation` is
   * applied to both structured and non-structured `ContentItem`s.
   * Currently, the referenced field may be of value type integer or string.
   * The tweak is constructed as a sequence of bytes in big endian byte order
   * such that:
   * - a 64 bit integer is encoded followed by a single byte of value 1
   * - a string is encoded in UTF-8 format followed by a single byte of value 2
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 2;</code>
   */
  com.google.privacy.dlp.v2.FieldId getContext();
  /**
   * <pre>
   * The 'tweak', a context may be used for higher security since the same
   * identifier in two different contexts won't be given the same surrogate. If
   * the context is not set, a default tweak will be used.
   * If the context is set but:
   * 1. there is no record present when transforming a given value or
   * 1. the field is not present when transforming a given value,
   * a default tweak will be used.
   * Note that case (1) is expected when an `InfoTypeTransformation` is
   * applied to both structured and non-structured `ContentItem`s.
   * Currently, the referenced field may be of value type integer or string.
   * The tweak is constructed as a sequence of bytes in big endian byte order
   * such that:
   * - a 64 bit integer is encoded followed by a single byte of value 1
   * - a string is encoded in UTF-8 format followed by a single byte of value 2
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 2;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getContextOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig.FfxCommonNativeAlphabet common_alphabet = 4;</code>
   */
  int getCommonAlphabetValue();
  /**
   * <code>.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig.FfxCommonNativeAlphabet common_alphabet = 4;</code>
   */
  com.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig.FfxCommonNativeAlphabet getCommonAlphabet();

  /**
   * <pre>
   * This is supported by mapping these to the alphanumeric characters
   * that the FFX mode natively supports. This happens before/after
   * encryption/decryption.
   * Each character listed must appear only once.
   * Number of characters must be in the range [2, 62].
   * This must be encoded as ASCII.
   * The order of characters does not matter.
   * </pre>
   *
   * <code>string custom_alphabet = 5;</code>
   */
  java.lang.String getCustomAlphabet();
  /**
   * <pre>
   * This is supported by mapping these to the alphanumeric characters
   * that the FFX mode natively supports. This happens before/after
   * encryption/decryption.
   * Each character listed must appear only once.
   * Number of characters must be in the range [2, 62].
   * This must be encoded as ASCII.
   * The order of characters does not matter.
   * </pre>
   *
   * <code>string custom_alphabet = 5;</code>
   */
  com.google.protobuf.ByteString
      getCustomAlphabetBytes();

  /**
   * <pre>
   * The native way to select the alphabet. Must be in the range [2, 62].
   * </pre>
   *
   * <code>int32 radix = 6;</code>
   */
  int getRadix();

  /**
   * <pre>
   * The custom infoType to annotate the surrogate with.
   * This annotation will be applied to the surrogate by prefixing it with
   * the name of the custom infoType followed by the number of
   * characters comprising the surrogate. The following scheme defines the
   * format: info_type_name(surrogate_character_count):surrogate
   * For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and
   * the surrogate is 'abc', the full replacement value
   * will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   * This annotation identifies the surrogate when inspecting content using the
   * custom infoType
   * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype).
   * This facilitates reversal of the surrogate when it occurs in free text.
   * In order for inspection to work properly, the name of this infoType must
   * not occur naturally anywhere in your data; otherwise, inspection may
   * find a surrogate that does not correspond to an actual identifier.
   * Therefore, choose your custom infoType name carefully after considering
   * what your data looks like. One way to select a name that has a high chance
   * of yielding reliable detection is to include one or more unicode characters
   * that are highly improbable to exist in your data.
   * For example, assuming your data is entered from a regular ASCII keyboard,
   * the symbol with the hex code point 29DD might be used like so:
   * ⧝MY_TOKEN_TYPE
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType surrogate_info_type = 8;</code>
   */
  boolean hasSurrogateInfoType();
  /**
   * <pre>
   * The custom infoType to annotate the surrogate with.
   * This annotation will be applied to the surrogate by prefixing it with
   * the name of the custom infoType followed by the number of
   * characters comprising the surrogate. The following scheme defines the
   * format: info_type_name(surrogate_character_count):surrogate
   * For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and
   * the surrogate is 'abc', the full replacement value
   * will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   * This annotation identifies the surrogate when inspecting content using the
   * custom infoType
   * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype).
   * This facilitates reversal of the surrogate when it occurs in free text.
   * In order for inspection to work properly, the name of this infoType must
   * not occur naturally anywhere in your data; otherwise, inspection may
   * find a surrogate that does not correspond to an actual identifier.
   * Therefore, choose your custom infoType name carefully after considering
   * what your data looks like. One way to select a name that has a high chance
   * of yielding reliable detection is to include one or more unicode characters
   * that are highly improbable to exist in your data.
   * For example, assuming your data is entered from a regular ASCII keyboard,
   * the symbol with the hex code point 29DD might be used like so:
   * ⧝MY_TOKEN_TYPE
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType surrogate_info_type = 8;</code>
   */
  com.google.privacy.dlp.v2.InfoType getSurrogateInfoType();
  /**
   * <pre>
   * The custom infoType to annotate the surrogate with.
   * This annotation will be applied to the surrogate by prefixing it with
   * the name of the custom infoType followed by the number of
   * characters comprising the surrogate. The following scheme defines the
   * format: info_type_name(surrogate_character_count):surrogate
   * For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and
   * the surrogate is 'abc', the full replacement value
   * will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   * This annotation identifies the surrogate when inspecting content using the
   * custom infoType
   * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype).
   * This facilitates reversal of the surrogate when it occurs in free text.
   * In order for inspection to work properly, the name of this infoType must
   * not occur naturally anywhere in your data; otherwise, inspection may
   * find a surrogate that does not correspond to an actual identifier.
   * Therefore, choose your custom infoType name carefully after considering
   * what your data looks like. One way to select a name that has a high chance
   * of yielding reliable detection is to include one or more unicode characters
   * that are highly improbable to exist in your data.
   * For example, assuming your data is entered from a regular ASCII keyboard,
   * the symbol with the hex code point 29DD might be used like so:
   * ⧝MY_TOKEN_TYPE
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType surrogate_info_type = 8;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getSurrogateInfoTypeOrBuilder();

  public com.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig.AlphabetCase getAlphabetCase();
}
