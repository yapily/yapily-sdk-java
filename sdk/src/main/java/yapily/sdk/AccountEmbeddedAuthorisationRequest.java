/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.365
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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.AccountRequest;
import yapily.sdk.RedirectRequest;
import yapily.sdk.ScaMethod;
import yapily.sdk.UserCredentials;

/**
 * AccountEmbeddedAuthorisationRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountEmbeddedAuthorisationRequest {
  @JsonProperty("userUuid")
  private String userUuid = null;

  @JsonProperty("applicationUserId")
  private String applicationUserId = null;

  @JsonProperty("forwardParameters")
  private List<String> forwardParameters = null;

  @JsonProperty("institutionId")
  private String institutionId = null;

  @JsonProperty("callback")
  private String callback = null;

  @JsonProperty("redirect")
  private RedirectRequest redirect = null;

  @JsonProperty("accountRequest")
  private AccountRequest accountRequest = null;

  @JsonProperty("oneTimeToken")
  private Boolean oneTimeToken = null;

  @JsonProperty("userCredentials")
  private UserCredentials userCredentials = null;

  @JsonProperty("selectedScaMethod")
  private ScaMethod selectedScaMethod = null;

  @JsonProperty("scaCode")
  private String scaCode = null;

}
