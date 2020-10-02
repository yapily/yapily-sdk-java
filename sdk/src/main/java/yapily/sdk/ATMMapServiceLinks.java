/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.249
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Links on popular map services pointing the ATM Location on the earth.
 */
@ApiModel(description = "Links on popular map services pointing the ATM Location on the earth.")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ATMMapServiceLinks {
  @JsonProperty("bingMapsUrl")
  private String bingMapsUrl = null;

  @JsonProperty("googleMapsUrl")
  private String googleMapsUrl = null;

  @JsonProperty("hereMapsUrl")
  private String hereMapsUrl = null;

}

