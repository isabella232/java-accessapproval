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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

public interface AccessLocationsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.AccessLocations)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The "home office" location of the principal. A two-letter country code
   * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
   * limited situations Google systems may refer refer to a region code instead
   * of a country code.
   * Possible Region Codes:
   * &lt;ol&gt;
   *   &lt;li&gt;ASI: Asia&lt;/li&gt;
   *   &lt;li&gt;EUR: Europe&lt;/li&gt;
   *   &lt;li&gt;OCE: Oceania&lt;/li&gt;
   *   &lt;li&gt;AFR: Africa&lt;/li&gt;
   *   &lt;li&gt;NAM: North America&lt;/li&gt;
   *   &lt;li&gt;SAM: South America&lt;/li&gt;
   *   &lt;li&gt;ANT: Antarctica&lt;/li&gt;
   *   &lt;li&gt;ANY: Any location&lt;/li&gt;
   * &lt;/ol&gt;
   * </pre>
   *
   * <code>string principal_office_country = 1;</code>
   *
   * @return The principalOfficeCountry.
   */
  java.lang.String getPrincipalOfficeCountry();
  /**
   *
   *
   * <pre>
   * The "home office" location of the principal. A two-letter country code
   * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
   * limited situations Google systems may refer refer to a region code instead
   * of a country code.
   * Possible Region Codes:
   * &lt;ol&gt;
   *   &lt;li&gt;ASI: Asia&lt;/li&gt;
   *   &lt;li&gt;EUR: Europe&lt;/li&gt;
   *   &lt;li&gt;OCE: Oceania&lt;/li&gt;
   *   &lt;li&gt;AFR: Africa&lt;/li&gt;
   *   &lt;li&gt;NAM: North America&lt;/li&gt;
   *   &lt;li&gt;SAM: South America&lt;/li&gt;
   *   &lt;li&gt;ANT: Antarctica&lt;/li&gt;
   *   &lt;li&gt;ANY: Any location&lt;/li&gt;
   * &lt;/ol&gt;
   * </pre>
   *
   * <code>string principal_office_country = 1;</code>
   *
   * @return The bytes for principalOfficeCountry.
   */
  com.google.protobuf.ByteString getPrincipalOfficeCountryBytes();

  /**
   *
   *
   * <pre>
   * Physical location of the principal at the time of the access. A
   * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
   * a region code. In some limited situations Google systems may refer refer to
   * a region code instead of a country code.
   * Possible Region Codes:
   * &lt;ol&gt;
   *   &lt;li&gt;ASI: Asia&lt;/li&gt;
   *   &lt;li&gt;EUR: Europe&lt;/li&gt;
   *   &lt;li&gt;OCE: Oceania&lt;/li&gt;
   *   &lt;li&gt;AFR: Africa&lt;/li&gt;
   *   &lt;li&gt;NAM: North America&lt;/li&gt;
   *   &lt;li&gt;SAM: South America&lt;/li&gt;
   *   &lt;li&gt;ANT: Antarctica&lt;/li&gt;
   *   &lt;li&gt;ANY: Any location&lt;/li&gt;
   * &lt;/ol&gt;
   * </pre>
   *
   * <code>string principal_physical_location_country = 2;</code>
   *
   * @return The principalPhysicalLocationCountry.
   */
  java.lang.String getPrincipalPhysicalLocationCountry();
  /**
   *
   *
   * <pre>
   * Physical location of the principal at the time of the access. A
   * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
   * a region code. In some limited situations Google systems may refer refer to
   * a region code instead of a country code.
   * Possible Region Codes:
   * &lt;ol&gt;
   *   &lt;li&gt;ASI: Asia&lt;/li&gt;
   *   &lt;li&gt;EUR: Europe&lt;/li&gt;
   *   &lt;li&gt;OCE: Oceania&lt;/li&gt;
   *   &lt;li&gt;AFR: Africa&lt;/li&gt;
   *   &lt;li&gt;NAM: North America&lt;/li&gt;
   *   &lt;li&gt;SAM: South America&lt;/li&gt;
   *   &lt;li&gt;ANT: Antarctica&lt;/li&gt;
   *   &lt;li&gt;ANY: Any location&lt;/li&gt;
   * &lt;/ol&gt;
   * </pre>
   *
   * <code>string principal_physical_location_country = 2;</code>
   *
   * @return The bytes for principalPhysicalLocationCountry.
   */
  com.google.protobuf.ByteString getPrincipalPhysicalLocationCountryBytes();
}
