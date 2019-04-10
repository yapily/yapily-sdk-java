/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.101
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
import yapily.sdk.SortCodePaymentRequest;

/**
 * SortCodePaymentAuthRequest
 */
@Data
public class SortCodePaymentAuthRequest {
  @JsonProperty("referencedBased")
  private Boolean referencedBased = null;

  @JsonProperty("userUuid")
  private String userUuid = null;

  @JsonProperty("referenceId")
  private String referenceId = null;

  @JsonProperty("forwardParameters")
  private List<String> forwardParameters = null;

  @JsonProperty("institutionId")
  private String institutionId = null;

  @JsonProperty("paymentRequest")
  private SortCodePaymentRequest paymentRequest = null;

  @JsonProperty("callback")
  private String callback = null;

  @JsonProperty("oneTimeToken")
  private Boolean oneTimeToken = null;

}

