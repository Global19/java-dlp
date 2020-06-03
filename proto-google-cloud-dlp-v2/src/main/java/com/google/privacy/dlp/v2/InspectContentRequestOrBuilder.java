/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface InspectContentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectContentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id
   * or projects/my-project-id/locations/{location_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id
   * or projects/my-project-id/locations/{location_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Configuration for the inspector. What specified here will override
   * the template referenced by the inspect_template_name argument.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return Whether the inspectConfig field is set.
   */
  boolean hasInspectConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the inspector. What specified here will override
   * the template referenced by the inspect_template_name argument.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return The inspectConfig.
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the inspector. What specified here will override
   * the template referenced by the inspect_template_name argument.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 3;</code>
   *
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 3;</code>
   *
   * @return The item.
   */
  com.google.privacy.dlp.v2.ContentItem getItem();
  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 3;</code>
   */
  com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder();

  /**
   *
   *
   * <pre>
   * Template to use. Any configuration directly specified in
   * inspect_config will override those set in the template. Singular fields
   * that are set in this request will replace their corresponding fields in the
   * template. Repeated fields are appended. Singular sub-messages and groups
   * are recursively merged.
   * </pre>
   *
   * <code>string inspect_template_name = 4;</code>
   *
   * @return The inspectTemplateName.
   */
  java.lang.String getInspectTemplateName();
  /**
   *
   *
   * <pre>
   * Template to use. Any configuration directly specified in
   * inspect_config will override those set in the template. Singular fields
   * that are set in this request will replace their corresponding fields in the
   * template. Repeated fields are appended. Singular sub-messages and groups
   * are recursively merged.
   * </pre>
   *
   * <code>string inspect_template_name = 4;</code>
   *
   * @return The bytes for inspectTemplateName.
   */
  com.google.protobuf.ByteString getInspectTemplateNameBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 5;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 5;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
