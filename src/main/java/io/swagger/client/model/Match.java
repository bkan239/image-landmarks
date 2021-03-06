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
import java.io.IOException;
import java.util.UUID;

/**
 * represents a single match.
 */
@ApiModel(description = "represents a single match.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-02T11:12:16.872Z")
public class Match {
  @SerializedName("face_uuid")
  private UUID faceUuid = null;

  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("is_match")
  private Boolean isMatch = null;

  @SerializedName("person_id")
  private String personId = null;

  public Match faceUuid(UUID faceUuid) {
    this.faceUuid = faceUuid;
    return this;
  }

   /**
   * matching face unique identifier.
   * @return faceUuid
  **/
  @ApiModelProperty(value = "matching face unique identifier.")
  public UUID getFaceUuid() {
    return faceUuid;
  }

  public void setFaceUuid(UUID faceUuid) {
    this.faceUuid = faceUuid;
  }

  public Match confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * match confidence (recognition score).
   * @return confidence
  **/
  @ApiModelProperty(value = "match confidence (recognition score).")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public Match isMatch(Boolean isMatch) {
    this.isMatch = isMatch;
    return this;
  }

   /**
   * decision is it same person or not based on match confidence with threshold measured on small and medium sized test collections.
   * @return isMatch
  **/
  @ApiModelProperty(value = "decision is it same person or not based on match confidence with threshold measured on small and medium sized test collections.")
  public Boolean isIsMatch() {
    return isMatch;
  }

  public void setIsMatch(Boolean isMatch) {
    this.isMatch = isMatch;
  }

  public Match personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * person id assigned to matching face, if any.
   * @return personId
  **/
  @ApiModelProperty(value = "person id assigned to matching face, if any.")
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.faceUuid, match.faceUuid) &&
        Objects.equals(this.confidence, match.confidence) &&
        Objects.equals(this.isMatch, match.isMatch) &&
        Objects.equals(this.personId, match.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceUuid, confidence, isMatch, personId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("    faceUuid: ").append(toIndentedString(faceUuid)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    isMatch: ").append(toIndentedString(isMatch)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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

