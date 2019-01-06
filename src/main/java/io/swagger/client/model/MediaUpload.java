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
import io.swagger.client.model.NewFace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * represents a media file upload message json body parameters.
 */
@ApiModel(description = "represents a media file upload message json body parameters.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-02T11:12:16.872Z")
public class MediaUpload {
  @SerializedName("api_key")
  private UUID apiKey = null;

  @SerializedName("file_uri")
  private String fileUri = null;

  @SerializedName("file_base64")
  private String fileBase64 = null;

  @SerializedName("detection_flags")
  private String detectionFlags = null;

  @SerializedName("detection_min_score")
  private Double detectionMinScore = null;

  @SerializedName("detection_new_faces")
  private List<NewFace> detectionNewFaces = null;

  @SerializedName("set_person_id")
  private String setPersonId = null;

  @SerializedName("recognize_targets")
  private List<String> recognizeTargets = null;

  @SerializedName("recognize_parameters")
  private String recognizeParameters = null;

  @SerializedName("original_filename")
  private String originalFilename = null;

  public MediaUpload apiKey(UUID apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * your API key or d45fd466-51e2-4701-8da8-04351c872236
   * @return apiKey
  **/
  @ApiModelProperty(required = true, value = "your API key or d45fd466-51e2-4701-8da8-04351c872236")
  public UUID getApiKey() {
    return apiKey;
  }

  public void setApiKey(UUID apiKey) {
    this.apiKey = apiKey;
  }

  public MediaUpload fileUri(String fileUri) {
    this.fileUri = fileUri;
    return this;
  }

   /**
   * publicly accessible media file uri.
   * @return fileUri
  **/
  @ApiModelProperty(value = "publicly accessible media file uri.")
  public String getFileUri() {
    return fileUri;
  }

  public void setFileUri(String fileUri) {
    this.fileUri = fileUri;
  }

  public MediaUpload fileBase64(String fileBase64) {
    this.fileBase64 = fileBase64;
    return this;
  }

   /**
   * base64 encoded media file content. file_uri parameter will be ignored if file_base64 parameter is specified and not empty.
   * @return fileBase64
  **/
  @ApiModelProperty(value = "base64 encoded media file content. file_uri parameter will be ignored if file_base64 parameter is specified and not empty.")
  public String getFileBase64() {
    return fileBase64;
  }

  public void setFileBase64(String fileBase64) {
    this.fileBase64 = fileBase64;
  }

  public MediaUpload detectionFlags(String detectionFlags) {
    this.detectionFlags = detectionFlags;
    return this;
  }

   /**
   * (optional) comma separated list of detection flags: bestface - return only face with highest detection score, centerface - same as bestface but gives preference to face closest to image center, basicpoints - 22 basic points detection, propoints - 101 pro points detection, classifiers - face classification and attributes, extended - extended color and geometric measurements, content - image content detection.  for example: \&quot;basicpoints,propoints,classifiers,content\&quot;
   * @return detectionFlags
  **/
  @ApiModelProperty(value = "(optional) comma separated list of detection flags: bestface - return only face with highest detection score, centerface - same as bestface but gives preference to face closest to image center, basicpoints - 22 basic points detection, propoints - 101 pro points detection, classifiers - face classification and attributes, extended - extended color and geometric measurements, content - image content detection.  for example: \"basicpoints,propoints,classifiers,content\"")
  public String getDetectionFlags() {
    return detectionFlags;
  }

  public void setDetectionFlags(String detectionFlags) {
    this.detectionFlags = detectionFlags;
  }

  public MediaUpload detectionMinScore(Double detectionMinScore) {
    this.detectionMinScore = detectionMinScore;
    return this;
  }

   /**
   * (optional) filter faces with detection score lower than min_score.
   * @return detectionMinScore
  **/
  @ApiModelProperty(value = "(optional) filter faces with detection score lower than min_score.")
  public Double getDetectionMinScore() {
    return detectionMinScore;
  }

  public void setDetectionMinScore(Double detectionMinScore) {
    this.detectionMinScore = detectionMinScore;
  }

  public MediaUpload detectionNewFaces(List<NewFace> detectionNewFaces) {
    this.detectionNewFaces = detectionNewFaces;
    return this;
  }

  public MediaUpload addDetectionNewFacesItem(NewFace detectionNewFacesItem) {
    if (this.detectionNewFaces == null) {
      this.detectionNewFaces = new ArrayList<NewFace>();
    }
    this.detectionNewFaces.add(detectionNewFacesItem);
    return this;
  }

   /**
   * (optional) override automatic faces detection and manually specify faces locations, face points and person ids to assign.  provide an array of new faces
   * @return detectionNewFaces
  **/
  @ApiModelProperty(value = "(optional) override automatic faces detection and manually specify faces locations, face points and person ids to assign.  provide an array of new faces")
  public List<NewFace> getDetectionNewFaces() {
    return detectionNewFaces;
  }

  public void setDetectionNewFaces(List<NewFace> detectionNewFaces) {
    this.detectionNewFaces = detectionNewFaces;
  }

  public MediaUpload setPersonId(String setPersonId) {
    this.setPersonId = setPersonId;
    return this;
  }

   /**
   * (optional) set person id in format name@namespace to each detected face. recommended to use with detection_flags bestface, centerface and/or min_score minimum detection score parameter.
   * @return setPersonId
  **/
  @ApiModelProperty(value = "(optional) set person id in format name@namespace to each detected face. recommended to use with detection_flags bestface, centerface and/or min_score minimum detection score parameter.")
  public String getSetPersonId() {
    return setPersonId;
  }

  public void setSetPersonId(String setPersonId) {
    this.setPersonId = setPersonId;
  }

  public MediaUpload recognizeTargets(List<String> recognizeTargets) {
    this.recognizeTargets = recognizeTargets;
    return this;
  }

  public MediaUpload addRecognizeTargetsItem(String recognizeTargetsItem) {
    if (this.recognizeTargets == null) {
      this.recognizeTargets = new ArrayList<String>();
    }
    this.recognizeTargets.add(recognizeTargetsItem);
    return this;
  }

   /**
   * (optional) for each detected face run recognize against specified targets (face ids, person ids or namespaces).
   * @return recognizeTargets
  **/
  @ApiModelProperty(value = "(optional) for each detected face run recognize against specified targets (face ids, person ids or namespaces).")
  public List<String> getRecognizeTargets() {
    return recognizeTargets;
  }

  public void setRecognizeTargets(List<String> recognizeTargets) {
    this.recognizeTargets = recognizeTargets;
  }

  public MediaUpload recognizeParameters(String recognizeParameters) {
    this.recognizeParameters = recognizeParameters;
    return this;
  }

   /**
   * (optional) comma separated list of recognition parameters, currently supported min_match_score (minimum recognition score), min_score (minimum detection score), gender and race filter.  for example: \&quot;min_match_score:0.4,min_score:0.2,gender:male,race:white\&quot;
   * @return recognizeParameters
  **/
  @ApiModelProperty(value = "(optional) comma separated list of recognition parameters, currently supported min_match_score (minimum recognition score), min_score (minimum detection score), gender and race filter.  for example: \"min_match_score:0.4,min_score:0.2,gender:male,race:white\"")
  public String getRecognizeParameters() {
    return recognizeParameters;
  }

  public void setRecognizeParameters(String recognizeParameters) {
    this.recognizeParameters = recognizeParameters;
  }

  public MediaUpload originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * (optional) original media filename, path, uri or your application specific id that you want to be stored in media metadata for reference.
   * @return originalFilename
  **/
  @ApiModelProperty(value = "(optional) original media filename, path, uri or your application specific id that you want to be stored in media metadata for reference.")
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUpload mediaUpload = (MediaUpload) o;
    return Objects.equals(this.apiKey, mediaUpload.apiKey) &&
        Objects.equals(this.fileUri, mediaUpload.fileUri) &&
        Objects.equals(this.fileBase64, mediaUpload.fileBase64) &&
        Objects.equals(this.detectionFlags, mediaUpload.detectionFlags) &&
        Objects.equals(this.detectionMinScore, mediaUpload.detectionMinScore) &&
        Objects.equals(this.detectionNewFaces, mediaUpload.detectionNewFaces) &&
        Objects.equals(this.setPersonId, mediaUpload.setPersonId) &&
        Objects.equals(this.recognizeTargets, mediaUpload.recognizeTargets) &&
        Objects.equals(this.recognizeParameters, mediaUpload.recognizeParameters) &&
        Objects.equals(this.originalFilename, mediaUpload.originalFilename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, fileUri, fileBase64, detectionFlags, detectionMinScore, detectionNewFaces, setPersonId, recognizeTargets, recognizeParameters, originalFilename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUpload {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    fileUri: ").append(toIndentedString(fileUri)).append("\n");
    sb.append("    fileBase64: ").append(toIndentedString(fileBase64)).append("\n");
    sb.append("    detectionFlags: ").append(toIndentedString(detectionFlags)).append("\n");
    sb.append("    detectionMinScore: ").append(toIndentedString(detectionMinScore)).append("\n");
    sb.append("    detectionNewFaces: ").append(toIndentedString(detectionNewFaces)).append("\n");
    sb.append("    setPersonId: ").append(toIndentedString(setPersonId)).append("\n");
    sb.append("    recognizeTargets: ").append(toIndentedString(recognizeTargets)).append("\n");
    sb.append("    recognizeParameters: ").append(toIndentedString(recognizeParameters)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
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

