/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.102
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
import yapily.sdk.AuthorisationRequestResponse;
import yapily.sdk.ResponseMeta;

/**
 * ApiResponseOfAuthorisationRequestResponse
 */
@Data
public class ApiResponseOfAuthorisationRequestResponse {
  @JsonProperty("meta")
  private ResponseMeta meta = null;

  @JsonProperty("data")
  private AuthorisationRequestResponse data = null;

}

