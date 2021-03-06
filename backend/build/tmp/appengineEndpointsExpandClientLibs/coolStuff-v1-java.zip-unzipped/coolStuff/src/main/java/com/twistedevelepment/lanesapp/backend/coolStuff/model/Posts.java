/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2016-01-05 at 04:03:00 UTC 
 * Modify at your own risk.
 */

package com.twistedevelepment.lanesapp.backend.coolStuff.model;

/**
 * Model definition for Posts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the coolStuff. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Posts extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String post;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String poster;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * @param comment comment or {@code null} for none
   */
  public Posts setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPost() {
    return post;
  }

  /**
   * @param post post or {@code null} for none
   */
  public Posts setPost(java.lang.String post) {
    this.post = post;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPoster() {
    return poster;
  }

  /**
   * @param poster poster or {@code null} for none
   */
  public Posts setPoster(java.lang.String poster) {
    this.poster = poster;
    return this;
  }

  @Override
  public Posts set(String fieldName, Object value) {
    return (Posts) super.set(fieldName, value);
  }

  @Override
  public Posts clone() {
    return (Posts) super.clone();
  }

}
