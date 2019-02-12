/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.79
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
import java.util.ArrayList;
import java.util.List;

/**
 * Address
 */
@Data
public class Address {
  @JsonProperty("addressLines")
  private List<String> addressLines = new ArrayList<>();

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("buildingNumber")
  private String buildingNumber = null;

  @JsonProperty("postCode")
  private String postCode = null;

  @JsonProperty("townName")
  private String townName = null;

  @JsonProperty("county")
  private List<String> county = new ArrayList<>();

  @JsonProperty("country")
  private String country = null;

}

