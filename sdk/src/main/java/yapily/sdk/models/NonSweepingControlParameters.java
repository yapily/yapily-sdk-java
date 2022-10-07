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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import yapily.sdk.models.Amount;
import yapily.sdk.models.NonSweepingPeriodicLimits;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

/**
* Define the restrictions and limits for payment orders as part of Non-Sweeping VRP consent
*/
@ApiModel(description = "Define the restrictions and limits for payment orders as part of Non-Sweeping VRP consent")
    @JsonPropertyOrder({
        NonSweepingControlParameters.JSON_PROPERTY_PSU_AUTHENTICATION_METHODS,
        NonSweepingControlParameters.JSON_PROPERTY_PERIODIC_LIMITS,
        NonSweepingControlParameters.JSON_PROPERTY_MAX_AMOUNT_PER_PAYMENT,
        NonSweepingControlParameters.JSON_PROPERTY_MAX_CUMULATIVE_AMOUNT,
        NonSweepingControlParameters.JSON_PROPERTY_MAX_CUMULATIVE_NUMBER_OF_PAYMENTS,
        NonSweepingControlParameters.JSON_PROPERTY_VALID_FROM,
        NonSweepingControlParameters.JSON_PROPERTY_VALID_TO
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class NonSweepingControlParameters {
    public static final String JSON_PROPERTY_PSU_AUTHENTICATION_METHODS = "psuAuthenticationMethods";
    @JsonProperty("psuAuthenticationMethods")
    @lombok.Singular("psuAuthenticationMethods") private List<String> psuAuthenticationMethods;

    public static final String JSON_PROPERTY_PERIODIC_LIMITS = "periodicLimits";
    @JsonProperty("periodicLimits")
    @lombok.Singular("periodicLimits") private List<NonSweepingPeriodicLimits> periodicLimits;

    public static final String JSON_PROPERTY_MAX_AMOUNT_PER_PAYMENT = "maxAmountPerPayment";
    @JsonProperty("maxAmountPerPayment")
    private Amount maxAmountPerPayment;

    public static final String JSON_PROPERTY_MAX_CUMULATIVE_AMOUNT = "maxCumulativeAmount";
    @JsonProperty("maxCumulativeAmount")
    private Amount maxCumulativeAmount;

    public static final String JSON_PROPERTY_MAX_CUMULATIVE_NUMBER_OF_PAYMENTS = "maxCumulativeNumberOfPayments";
    @JsonProperty("maxCumulativeNumberOfPayments")
    private Integer maxCumulativeNumberOfPayments;

    public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
    @JsonProperty("validFrom")
    private OffsetDateTime validFrom;

    public static final String JSON_PROPERTY_VALID_TO = "validTo";
    @JsonProperty("validTo")
    private OffsetDateTime validTo;

}
