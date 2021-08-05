/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.396
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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.PaymentRequest;
import yapily.sdk.RedirectRequest;

/**
 * PaymentAuthorisationRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAuthorisationRequest {
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

  @JsonProperty("oneTimeToken")
  private Boolean oneTimeToken = null;

  @JsonProperty("totalMaxAmount")
  private BigDecimal totalMaxAmount = null;

  /**
   * Gets or Sets totalMaxAmountFrequency
   */
  public enum TotalMaxAmountFrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    YEARLY("YEARLY");

    private String value;

    TotalMaxAmountFrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TotalMaxAmountFrequencyEnum fromValue(String text) {
      for (TotalMaxAmountFrequencyEnum b : TotalMaxAmountFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("totalMaxAmountFrequency")
  private TotalMaxAmountFrequencyEnum totalMaxAmountFrequency = null;

  @JsonProperty("maxAmountPerRequest")
  private BigDecimal maxAmountPerRequest = null;

  @JsonProperty("startsAt")
  private OffsetDateTime startsAt = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("allowOverdraft")
  private Boolean allowOverdraft = null;

  @JsonProperty("paymentRequest")
  private PaymentRequest paymentRequest = null;

}

