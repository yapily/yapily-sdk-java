/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.13.1
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
import java.time.OffsetDateTime;
import yapily.sdk.models.Amount;
import yapily.sdk.models.InternationalPaymentRequest;
import yapily.sdk.models.Payee;
import yapily.sdk.models.Payer;
import yapily.sdk.models.PaymentContextType;
import yapily.sdk.models.PaymentType;
import yapily.sdk.models.PeriodicPaymentRequest;

/**
* __Mandatory__. The payment request object defining the details of the payment.
*/
@ApiModel(description = "__Mandatory__. The payment request object defining the details of the payment.")
    @JsonPropertyOrder({
        PaymentRequest.JSON_PROPERTY_PAYMENT_IDEMPOTENCY_ID,
        PaymentRequest.JSON_PROPERTY_PAYER,
        PaymentRequest.JSON_PROPERTY_REFERENCE,
        PaymentRequest.JSON_PROPERTY_CONTEXT_TYPE,
        PaymentRequest.JSON_PROPERTY_TYPE,
        PaymentRequest.JSON_PROPERTY_PAYEE,
        PaymentRequest.JSON_PROPERTY_PERIODIC_PAYMENT,
        PaymentRequest.JSON_PROPERTY_INTERNATIONAL_PAYMENT,
        PaymentRequest.JSON_PROPERTY_AMOUNT,
        PaymentRequest.JSON_PROPERTY_PAYMENT_DATE_TIME,
        PaymentRequest.JSON_PROPERTY_READ_REFUND_ACCOUNT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PaymentRequest {
    public static final String JSON_PROPERTY_PAYMENT_IDEMPOTENCY_ID = "paymentIdempotencyId";
    @JsonProperty("paymentIdempotencyId")
    private String paymentIdempotencyId;

    public static final String JSON_PROPERTY_PAYER = "payer";
    @JsonProperty("payer")
    private Payer payer;

    public static final String JSON_PROPERTY_REFERENCE = "reference";
    @JsonProperty("reference")
    private String reference;

    public static final String JSON_PROPERTY_CONTEXT_TYPE = "contextType";
    @JsonProperty("contextType")
    private PaymentContextType contextType = PaymentContextType.OTHER;

    public static final String JSON_PROPERTY_TYPE = "type";
    @JsonProperty("type")
    private PaymentType type;

    public static final String JSON_PROPERTY_PAYEE = "payee";
    @JsonProperty("payee")
    private Payee payee;

    public static final String JSON_PROPERTY_PERIODIC_PAYMENT = "periodicPayment";
    @JsonProperty("periodicPayment")
    private PeriodicPaymentRequest periodicPayment;

    public static final String JSON_PROPERTY_INTERNATIONAL_PAYMENT = "internationalPayment";
    @JsonProperty("internationalPayment")
    private InternationalPaymentRequest internationalPayment;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    @JsonProperty("amount")
    private Amount amount;

    public static final String JSON_PROPERTY_PAYMENT_DATE_TIME = "paymentDateTime";
    @JsonProperty("paymentDateTime")
    private OffsetDateTime paymentDateTime;

    public static final String JSON_PROPERTY_READ_REFUND_ACCOUNT = "readRefundAccount";
    @JsonProperty("readRefundAccount")
    private Boolean readRefundAccount;

}
