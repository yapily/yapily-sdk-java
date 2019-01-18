/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.63
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Location on the earth specified by two numbers representing vertical and horizontal position.
 */
@ApiModel(description = "Location on the earth specified by two numbers representing vertical and horizontal position.")
@Data
public class ATMGeographicCoordinates {
  @JsonProperty("Latitude")
  private String latitude = null;

  @JsonProperty("Longitude")
  private String longitude = null;

}

