/*
 * Betaface API 2.0
 * Betaface face recognition API.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Media;
import io.swagger.client.model.Recognize;
import java.io.IOException;

/**
 * MediaUploadResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-02T11:12:16.872Z")
public class MediaUploadResponse {
  @SerializedName("media")
  private Media media = null;

  @SerializedName("recognize")
  private Recognize recognize = null;

  public MediaUploadResponse media(Media media) {
    this.media = media;
    return this;
  }

   /**
   * media information.
   * @return media
  **/
  @ApiModelProperty(value = "media information.")
  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }

  public MediaUploadResponse recognize(Recognize recognize) {
    this.recognize = recognize;
    return this;
  }

   /**
   * recognition results.
   * @return recognize
  **/
  @ApiModelProperty(value = "recognition results.")
  public Recognize getRecognize() {
    return recognize;
  }

  public void setRecognize(Recognize recognize) {
    this.recognize = recognize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadResponse mediaUploadResponse = (MediaUploadResponse) o;
    return Objects.equals(this.media, mediaUploadResponse.media) &&
        Objects.equals(this.recognize, mediaUploadResponse.recognize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, recognize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadResponse {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    recognize: ").append(toIndentedString(recognize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
