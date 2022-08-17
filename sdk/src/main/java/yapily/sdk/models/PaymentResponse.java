/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package yapily.sdk.models;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.Amount;
import yapily.sdk.models.ExchangeRateInformationResponse;
import yapily.sdk.models.FrequencyResponse;
import yapily.sdk.models.Payee;
import yapily.sdk.models.Payer;
import yapily.sdk.models.PaymentChargeDetails;
import yapily.sdk.models.PaymentStatus;
import yapily.sdk.models.PaymentStatusDetails;
import yapily.sdk.models.PriorityCodeEnum;
import yapily.sdk.models.RefundAccount;

/**
* PaymentResponse
*/
    @JsonPropertyOrder({
        PaymentResponse.JSON_PROPERTY_ID,
        PaymentResponse.JSON_PROPERTY_INSTITUTION_CONSENT_ID,
        PaymentResponse.JSON_PROPERTY_PAYMENT_IDEMPOTENCY_ID,
        PaymentResponse.JSON_PROPERTY_PAYMENT_LIFECYCLE_ID,
        PaymentResponse.JSON_PROPERTY_STATUS,
        PaymentResponse.JSON_PROPERTY_STATUS_DETAILS,
        PaymentResponse.JSON_PROPERTY_PAYER,
        PaymentResponse.JSON_PROPERTY_PAYEE_DETAILS,
        PaymentResponse.JSON_PROPERTY_REFERENCE,
        PaymentResponse.JSON_PROPERTY_AMOUNT,
        PaymentResponse.JSON_PROPERTY_CURRENCY,
        PaymentResponse.JSON_PROPERTY_AMOUNT_DETAILS,
        PaymentResponse.JSON_PROPERTY_CREATED_AT,
        PaymentResponse.JSON_PROPERTY_FIRST_PAYMENT_AMOUNT,
        PaymentResponse.JSON_PROPERTY_FIRST_PAYMENT_DATE_TIME,
        PaymentResponse.JSON_PROPERTY_NEXT_PAYMENT_AMOUNT,
        PaymentResponse.JSON_PROPERTY_NEXT_PAYMENT_DATE_TIME,
        PaymentResponse.JSON_PROPERTY_FINAL_PAYMENT_AMOUNT,
        PaymentResponse.JSON_PROPERTY_FINAL_PAYMENT_DATE_TIME,
        PaymentResponse.JSON_PROPERTY_NUMBER_OF_PAYMENTS,
        PaymentResponse.JSON_PROPERTY_PREVIOUS_PAYMENT_AMOUNT,
        PaymentResponse.JSON_PROPERTY_PREVIOUS_PAYMENT_DATE_TIME,
        PaymentResponse.JSON_PROPERTY_CHARGE_DETAILS,
        PaymentResponse.JSON_PROPERTY_SCHEDULED_PAYMENT_TYPE,
        PaymentResponse.JSON_PROPERTY_SCHEDULED_PAYMENT_DATE_TIME,
        PaymentResponse.JSON_PROPERTY_FREQUENCY,
        PaymentResponse.JSON_PROPERTY_CURRENCY_OF_TRANSFER,
        PaymentResponse.JSON_PROPERTY_PURPOSE,
        PaymentResponse.JSON_PROPERTY_PRIORITY,
        PaymentResponse.JSON_PROPERTY_EXCHANGE_RATE,
        PaymentResponse.JSON_PROPERTY_REFUND_ACCOUNT,
        PaymentResponse.JSON_PROPERTY_BULK_AMOUNT_SUM
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:34:20.056Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PaymentResponse {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_INSTITUTION_CONSENT_ID = "institutionConsentId";
    @JsonProperty("institutionConsentId")
    private String institutionConsentId;

    public static final String JSON_PROPERTY_PAYMENT_IDEMPOTENCY_ID = "paymentIdempotencyId";
    @JsonProperty("paymentIdempotencyId")
    private String paymentIdempotencyId;

    public static final String JSON_PROPERTY_PAYMENT_LIFECYCLE_ID = "paymentLifecycleId";
    @JsonProperty("paymentLifecycleId")
    private String paymentLifecycleId;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private PaymentStatus status;

    public static final String JSON_PROPERTY_STATUS_DETAILS = "statusDetails";
    @JsonProperty("statusDetails")
    private PaymentStatusDetails statusDetails;

    public static final String JSON_PROPERTY_PAYER = "payer";
    @JsonProperty("payer")
    private Payer payer;

    public static final String JSON_PROPERTY_PAYEE_DETAILS = "payeeDetails";
    @JsonProperty("payeeDetails")
    private Payee payeeDetails;

    public static final String JSON_PROPERTY_REFERENCE = "reference";
    @JsonProperty("reference")
    private String reference;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    @JsonProperty("amount")
    private BigDecimal amount;

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    @JsonProperty("currency")
    private String currency;

    public static final String JSON_PROPERTY_AMOUNT_DETAILS = "amountDetails";
    @JsonProperty("amountDetails")
    private Amount amountDetails;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_FIRST_PAYMENT_AMOUNT = "firstPaymentAmount";
    @JsonProperty("firstPaymentAmount")
    private Amount firstPaymentAmount;

    public static final String JSON_PROPERTY_FIRST_PAYMENT_DATE_TIME = "firstPaymentDateTime";
    @JsonProperty("firstPaymentDateTime")
    private OffsetDateTime firstPaymentDateTime;

    public static final String JSON_PROPERTY_NEXT_PAYMENT_AMOUNT = "nextPaymentAmount";
    @JsonProperty("nextPaymentAmount")
    private Amount nextPaymentAmount;

    public static final String JSON_PROPERTY_NEXT_PAYMENT_DATE_TIME = "nextPaymentDateTime";
    @JsonProperty("nextPaymentDateTime")
    private OffsetDateTime nextPaymentDateTime;

    public static final String JSON_PROPERTY_FINAL_PAYMENT_AMOUNT = "finalPaymentAmount";
    @JsonProperty("finalPaymentAmount")
    private Amount finalPaymentAmount;

    public static final String JSON_PROPERTY_FINAL_PAYMENT_DATE_TIME = "finalPaymentDateTime";
    @JsonProperty("finalPaymentDateTime")
    private OffsetDateTime finalPaymentDateTime;

    public static final String JSON_PROPERTY_NUMBER_OF_PAYMENTS = "numberOfPayments";
    @JsonProperty("numberOfPayments")
    private Integer numberOfPayments;

    public static final String JSON_PROPERTY_PREVIOUS_PAYMENT_AMOUNT = "previousPaymentAmount";
    @JsonProperty("previousPaymentAmount")
    private Amount previousPaymentAmount;

    public static final String JSON_PROPERTY_PREVIOUS_PAYMENT_DATE_TIME = "previousPaymentDateTime";
    @JsonProperty("previousPaymentDateTime")
    private OffsetDateTime previousPaymentDateTime;

    public static final String JSON_PROPERTY_CHARGE_DETAILS = "chargeDetails";
    @JsonProperty("chargeDetails")
    @lombok.Singular("chargeDetails") private List<PaymentChargeDetails> chargeDetails;

    public static final String JSON_PROPERTY_SCHEDULED_PAYMENT_TYPE = "scheduledPaymentType";
    @JsonProperty("scheduledPaymentType")
    private String scheduledPaymentType;

    public static final String JSON_PROPERTY_SCHEDULED_PAYMENT_DATE_TIME = "scheduledPaymentDateTime";
    @JsonProperty("scheduledPaymentDateTime")
    private OffsetDateTime scheduledPaymentDateTime;

    public static final String JSON_PROPERTY_FREQUENCY = "frequency";
    @JsonProperty("frequency")
    private FrequencyResponse frequency;

    public static final String JSON_PROPERTY_CURRENCY_OF_TRANSFER = "currencyOfTransfer";
    @JsonProperty("currencyOfTransfer")
    private String currencyOfTransfer;

    public static final String JSON_PROPERTY_PURPOSE = "purpose";
    @JsonProperty("purpose")
    private String purpose;

    public static final String JSON_PROPERTY_PRIORITY = "priority";
    @JsonProperty("priority")
    private PriorityCodeEnum priority;

    public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchangeRate";
    @JsonProperty("exchangeRate")
    private ExchangeRateInformationResponse exchangeRate;

    public static final String JSON_PROPERTY_REFUND_ACCOUNT = "refundAccount";
    @JsonProperty("refundAccount")
    private RefundAccount refundAccount;

    public static final String JSON_PROPERTY_BULK_AMOUNT_SUM = "bulkAmountSum";
    @JsonProperty("bulkAmountSum")
    private BigDecimal bulkAmountSum;

}
