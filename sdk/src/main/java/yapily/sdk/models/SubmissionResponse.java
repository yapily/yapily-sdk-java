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
import yapily.sdk.models.InitiationDetails;
import yapily.sdk.models.Payer;
import yapily.sdk.models.PaymentStatus;
import yapily.sdk.models.PaymentStatusDetails;
import yapily.sdk.models.RefundAccount;
import yapily.sdk.models.SubmissionDetails;

/**
* SubmissionResponse
*/
    @JsonPropertyOrder({
        SubmissionResponse.JSON_PROPERTY_ID,
        SubmissionResponse.JSON_PROPERTY_PAYMENT_IDEMPOTENCY_ID,
        SubmissionResponse.JSON_PROPERTY_INSTITUTION_CONSENT_ID,
        SubmissionResponse.JSON_PROPERTY_STATUS,
        SubmissionResponse.JSON_PROPERTY_STATUS_DETAILS,
        SubmissionResponse.JSON_PROPERTY_INITIATION_DETAILS,
        SubmissionResponse.JSON_PROPERTY_SUBMISSION_DETAILS,
        SubmissionResponse.JSON_PROPERTY_PAYER,
        SubmissionResponse.JSON_PROPERTY_REFUND_ACCOUNT,
        SubmissionResponse.JSON_PROPERTY_EXPECTED_EXECUTION_TIME,
        SubmissionResponse.JSON_PROPERTY_EXPECTED_SETTLEMENT_TIME
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class SubmissionResponse {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_PAYMENT_IDEMPOTENCY_ID = "paymentIdempotencyId";
    @JsonProperty("paymentIdempotencyId")
    private String paymentIdempotencyId;

    public static final String JSON_PROPERTY_INSTITUTION_CONSENT_ID = "institutionConsentId";
    @JsonProperty("institutionConsentId")
    private String institutionConsentId;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private PaymentStatus status;

    public static final String JSON_PROPERTY_STATUS_DETAILS = "statusDetails";
    @JsonProperty("statusDetails")
    private PaymentStatusDetails statusDetails;

    public static final String JSON_PROPERTY_INITIATION_DETAILS = "initiationDetails";
    @JsonProperty("initiationDetails")
    private InitiationDetails initiationDetails;

    public static final String JSON_PROPERTY_SUBMISSION_DETAILS = "submissionDetails";
    @JsonProperty("submissionDetails")
    private SubmissionDetails submissionDetails;

    public static final String JSON_PROPERTY_PAYER = "payer";
    @JsonProperty("payer")
    private Payer payer;

    public static final String JSON_PROPERTY_REFUND_ACCOUNT = "refundAccount";
    @JsonProperty("refundAccount")
    private RefundAccount refundAccount;

    public static final String JSON_PROPERTY_EXPECTED_EXECUTION_TIME = "expectedExecutionTime";
    @JsonProperty("expectedExecutionTime")
    private OffsetDateTime expectedExecutionTime;

    public static final String JSON_PROPERTY_EXPECTED_SETTLEMENT_TIME = "expectedSettlementTime";
    @JsonProperty("expectedSettlementTime")
    private OffsetDateTime expectedSettlementTime;

}
