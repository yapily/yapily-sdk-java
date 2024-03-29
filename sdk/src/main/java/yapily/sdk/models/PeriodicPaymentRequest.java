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
import yapily.sdk.models.FrequencyRequest;

/**
* __Conditional__. Used to specify properties to define a periodic payment. &lt;br&gt;&lt;br&gt;Must be specified when the payment &#x60;type&#x60; is one of the following:&lt;ul&gt;     &lt;li&gt;&lt;code&gt;DOMESTIC_PERIODIC_PAYMENT&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;INTERNATIONAL_PERIODIC_PAYMENT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
*/
@ApiModel(description = "__Conditional__. Used to specify properties to define a periodic payment. <br><br>Must be specified when the payment `type` is one of the following:<ul>     <li><code>DOMESTIC_PERIODIC_PAYMENT</code></li>     <li><code>INTERNATIONAL_PERIODIC_PAYMENT</code></li></ul>")
    @JsonPropertyOrder({
        PeriodicPaymentRequest.JSON_PROPERTY_FREQUENCY,
        PeriodicPaymentRequest.JSON_PROPERTY_NUMBER_OF_PAYMENTS,
        PeriodicPaymentRequest.JSON_PROPERTY_NEXT_PAYMENT_DATE_TIME,
        PeriodicPaymentRequest.JSON_PROPERTY_NEXT_PAYMENT_AMOUNT,
        PeriodicPaymentRequest.JSON_PROPERTY_FINAL_PAYMENT_DATE_TIME,
        PeriodicPaymentRequest.JSON_PROPERTY_FINAL_PAYMENT_AMOUNT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PeriodicPaymentRequest {
    public static final String JSON_PROPERTY_FREQUENCY = "frequency";
    @JsonProperty("frequency")
    private FrequencyRequest frequency;

    public static final String JSON_PROPERTY_NUMBER_OF_PAYMENTS = "numberOfPayments";
    @JsonProperty("numberOfPayments")
    private Integer numberOfPayments;

    public static final String JSON_PROPERTY_NEXT_PAYMENT_DATE_TIME = "nextPaymentDateTime";
    @JsonProperty("nextPaymentDateTime")
    private OffsetDateTime nextPaymentDateTime;

    public static final String JSON_PROPERTY_NEXT_PAYMENT_AMOUNT = "nextPaymentAmount";
    @JsonProperty("nextPaymentAmount")
    private Amount nextPaymentAmount;

    public static final String JSON_PROPERTY_FINAL_PAYMENT_DATE_TIME = "finalPaymentDateTime";
    @JsonProperty("finalPaymentDateTime")
    private OffsetDateTime finalPaymentDateTime;

    public static final String JSON_PROPERTY_FINAL_PAYMENT_AMOUNT = "finalPaymentAmount";
    @JsonProperty("finalPaymentAmount")
    private Amount finalPaymentAmount;

}
