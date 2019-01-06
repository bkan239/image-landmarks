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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * represents a person information.
 */
@ApiModel(description = "represents a person information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-02T11:12:16.872Z")
public class Person {
  @SerializedName("person_id")
  private String personId = null;

  @SerializedName("faces_uuids")
  private List<UUID> facesUuids = null;

  public Person personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * person identifier
   * @return personId
  **/
  @ApiModelProperty(value = "person identifier")
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public Person facesUuids(List<UUID> facesUuids) {
    this.facesUuids = facesUuids;
    return this;
  }

  public Person addFacesUuidsItem(UUID facesUuidsItem) {
    if (this.facesUuids == null) {
      this.facesUuids = new ArrayList<UUID>();
    }
    this.facesUuids.add(facesUuidsItem);
    return this;
  }

   /**
   * list of face uuids with this person assigned
   * @return facesUuids
  **/
  @ApiModelProperty(value = "list of face uuids with this person assigned")
  public List<UUID> getFacesUuids() {
    return facesUuids;
  }

  public void setFacesUuids(List<UUID> facesUuids) {
    this.facesUuids = facesUuids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.personId, person.personId) &&
        Objects.equals(this.facesUuids, person.facesUuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, facesUuids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    facesUuids: ").append(toIndentedString(facesUuids)).append("\n");
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
