/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.6.0
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
import yapily.sdk.models.MultiAuthorisation;
import yapily.sdk.models.PaymentIsoStatus;
import yapily.sdk.models.PaymentStatus;

/**
* PaymentStatusDetails
*/
    @JsonPropertyOrder({
        PaymentStatusDetails.JSON_PROPERTY_STATUS,
        PaymentStatusDetails.JSON_PROPERTY_STATUS_REASON,
        PaymentStatusDetails.JSON_PROPERTY_STATUS_REASON_DESCRIPTION,
        PaymentStatusDetails.JSON_PROPERTY_STATUS_UPDATE_DATE,
        PaymentStatusDetails.JSON_PROPERTY_MULTI_AUTHORISATION_STATUS,
        PaymentStatusDetails.JSON_PROPERTY_ISO_STATUS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PaymentStatusDetails {
    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private PaymentStatus status;

    public static final String JSON_PROPERTY_STATUS_REASON = "statusReason";
    @JsonProperty("statusReason")
    private String statusReason;

    public static final String JSON_PROPERTY_STATUS_REASON_DESCRIPTION = "statusReasonDescription";
    @JsonProperty("statusReasonDescription")
    private String statusReasonDescription;

    public static final String JSON_PROPERTY_STATUS_UPDATE_DATE = "statusUpdateDate";
    @JsonProperty("statusUpdateDate")
    private OffsetDateTime statusUpdateDate;

    public static final String JSON_PROPERTY_MULTI_AUTHORISATION_STATUS = "multiAuthorisationStatus";
    @JsonProperty("multiAuthorisationStatus")
    private MultiAuthorisation multiAuthorisationStatus;

    public static final String JSON_PROPERTY_ISO_STATUS = "isoStatus";
    @JsonProperty("isoStatus")
    private PaymentIsoStatus isoStatus;

}