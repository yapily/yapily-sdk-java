/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.373
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
import yapily.sdk.Payee;

/**
 * Beneficiary
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Beneficiary {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("trusted")
  private Boolean trusted = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("payee")
  private Payee payee = null;

}

