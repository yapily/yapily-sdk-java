/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.150
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
 * YapilyAccessToken
 */
@Data
public class YapilyAccessToken {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private Integer expiresIn = null;

  @JsonProperty("jti")
  private String jti = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("token_type")
  private String tokenType = null;

}

