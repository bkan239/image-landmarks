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
import io.swagger.client.model.UsageDaily;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * represents an api usage information by day for the past year.
 */
@ApiModel(description = "represents an api usage information by day for the past year.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-02T11:12:16.872Z")
public class Usage {
  @SerializedName("usage_daily")
  private List<UsageDaily> usageDaily = null;

  public Usage usageDaily(List<UsageDaily> usageDaily) {
    this.usageDaily = usageDaily;
    return this;
  }

  public Usage addUsageDailyItem(UsageDaily usageDailyItem) {
    if (this.usageDaily == null) {
      this.usageDaily = new ArrayList<UsageDaily>();
    }
    this.usageDaily.add(usageDailyItem);
    return this;
  }

   /**
   * list of usage statistics by day
   * @return usageDaily
  **/
  @ApiModelProperty(value = "list of usage statistics by day")
  public List<UsageDaily> getUsageDaily() {
    return usageDaily;
  }

  public void setUsageDaily(List<UsageDaily> usageDaily) {
    this.usageDaily = usageDaily;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usage usage = (Usage) o;
    return Objects.equals(this.usageDaily, usage.usageDaily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageDaily);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usage {\n");
    
    sb.append("    usageDaily: ").append(toIndentedString(usageDaily)).append("\n");
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
