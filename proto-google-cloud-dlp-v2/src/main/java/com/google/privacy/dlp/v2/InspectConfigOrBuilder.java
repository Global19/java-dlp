// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface InspectConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InfoType> 
      getInfoTypesList();
  /**
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoType getInfoTypes(int index);
  /**
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  int getInfoTypesCount();
  /**
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InfoTypeOrBuilder> 
      getInfoTypesOrBuilderList();
  /**
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypesOrBuilder(
      int index);

  /**
   * <pre>
   * Only returns findings equal or above this threshold. The default is
   * POSSIBLE.
   * See https://cloud.google.com/dlp/docs/likelihood to learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood min_likelihood = 2;</code>
   */
  int getMinLikelihoodValue();
  /**
   * <pre>
   * Only returns findings equal or above this threshold. The default is
   * POSSIBLE.
   * See https://cloud.google.com/dlp/docs/likelihood to learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood min_likelihood = 2;</code>
   */
  com.google.privacy.dlp.v2.Likelihood getMinLikelihood();

  /**
   * <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code>
   */
  boolean hasLimits();
  /**
   * <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code>
   */
  com.google.privacy.dlp.v2.InspectConfig.FindingLimits getLimits();
  /**
   * <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code>
   */
  com.google.privacy.dlp.v2.InspectConfig.FindingLimitsOrBuilder getLimitsOrBuilder();

  /**
   * <pre>
   * When true, a contextual quote from the data that triggered a finding is
   * included in the response; see Finding.quote.
   * </pre>
   *
   * <code>bool include_quote = 4;</code>
   */
  boolean getIncludeQuote();

  /**
   * <pre>
   * When true, excludes type information of the findings.
   * </pre>
   *
   * <code>bool exclude_info_types = 5;</code>
   */
  boolean getExcludeInfoTypes();

  /**
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.CustomInfoType> 
      getCustomInfoTypesList();
  /**
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType getCustomInfoTypes(int index);
  /**
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  int getCustomInfoTypesCount();
  /**
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.CustomInfoTypeOrBuilder> 
      getCustomInfoTypesOrBuilderList();
  /**
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoTypeOrBuilder getCustomInfoTypesOrBuilder(
      int index);

  /**
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.ContentOption> getContentOptionsList();
  /**
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  int getContentOptionsCount();
  /**
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  com.google.privacy.dlp.v2.ContentOption getContentOptions(int index);
  /**
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  java.util.List<java.lang.Integer>
  getContentOptionsValueList();
  /**
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  int getContentOptionsValue(int index);
}
