/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.262
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
import yapily.sdk.Amount;
import yapily.sdk.ChargeDetails;
import yapily.sdk.ExchangeRateInformationResponse;
import yapily.sdk.FrequencyResponse;
import yapily.sdk.Payee;
import yapily.sdk.Payer;
import yapily.sdk.PaymentStatusDetails;
import yapily.sdk.RefundAccount;

/**
 * PaymentResponse
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("institutionConsentId")
  private String institutionConsentId = null;

  @JsonProperty("paymentIdempotencyId")
  private String paymentIdempotencyId = null;

  @JsonProperty("paymentLifecycleId")
  private String paymentLifecycleId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    FAILED("FAILED"),
    
    DECLINED("DECLINED"),
    
    COMPLETED("COMPLETED"),
    
    COMPLETED_SETTLEMENT_IN_PROCESS("COMPLETED_SETTLEMENT_IN_PROCESS"),
    
    EXPIRED("EXPIRED"),
    
    UNKNOWN("UNKNOWN"),
    
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("statusDetails")
  private PaymentStatusDetails statusDetails = null;

  @JsonProperty("payer")
  private Payer payer = null;

  @JsonProperty("payeeDetails")
  private Payee payeeDetails = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("amountDetails")
  private Amount amountDetails = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("firstPaymentAmount")
  private Amount firstPaymentAmount = null;

  @JsonProperty("firstPaymentDateTime")
  private OffsetDateTime firstPaymentDateTime = null;

  @JsonProperty("nextPaymentAmount")
  private Amount nextPaymentAmount = null;

  @JsonProperty("nextPaymentDateTime")
  private OffsetDateTime nextPaymentDateTime = null;

  @JsonProperty("finalPaymentAmount")
  private Amount finalPaymentAmount = null;

  @JsonProperty("finalPaymentDateTime")
  private OffsetDateTime finalPaymentDateTime = null;

  @JsonProperty("numberOfPayments")
  private Integer numberOfPayments = null;

  @JsonProperty("previousPaymentAmount")
  private Amount previousPaymentAmount = null;

  @JsonProperty("previousPaymentDateTime")
  private OffsetDateTime previousPaymentDateTime = null;

  @JsonProperty("chargeDetails")
  private List<ChargeDetails> chargeDetails = null;

  @JsonProperty("scheduledPaymentType")
  private String scheduledPaymentType = null;

  @JsonProperty("scheduledPaymentDateTime")
  private OffsetDateTime scheduledPaymentDateTime = null;

  @JsonProperty("frequency")
  private FrequencyResponse frequency = null;

  @JsonProperty("currencyOfTransfer")
  private String currencyOfTransfer = null;

  @JsonProperty("purpose")
  private String purpose = null;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    NORMAL("NORMAL"),
    
    URGENT("URGENT");

    private String value;

    PriorityEnum(String value) {
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
    public static PriorityEnum fromValue(String text) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("priority")
  private PriorityEnum priority = null;

  @JsonProperty("exchangeRate")
  private ExchangeRateInformationResponse exchangeRate = null;

  @JsonProperty("refundAccount")
  private RefundAccount refundAccount = null;

}

