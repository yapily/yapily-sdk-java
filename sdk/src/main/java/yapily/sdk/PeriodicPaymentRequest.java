/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.334
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
import java.time.OffsetDateTime;
import yapily.sdk.Amount;
import yapily.sdk.FrequencyRequest;

/**
 * PeriodicPaymentRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeriodicPaymentRequest {
  @JsonProperty("frequency")
  private FrequencyRequest frequency = null;

  @JsonProperty("numberOfPayments")
  private Integer numberOfPayments = null;

  @JsonProperty("nextPaymentDateTime")
  private OffsetDateTime nextPaymentDateTime = null;

  @JsonProperty("nextPaymentAmount")
  private Amount nextPaymentAmount = null;

  @JsonProperty("finalPaymentDateTime")
  private OffsetDateTime finalPaymentDateTime = null;

  @JsonProperty("finalPaymentAmount")
  private Amount finalPaymentAmount = null;

}

