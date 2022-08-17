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
import yapily.sdk.models.Amount;

/**
* SweepingPeriodicLimits
*/
    @JsonPropertyOrder({
        SweepingPeriodicLimits.JSON_PROPERTY_TOTAL_MAX_AMOUNT,
        SweepingPeriodicLimits.JSON_PROPERTY_FREQUENCY,
        SweepingPeriodicLimits.JSON_PROPERTY_ALIGNMENT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:34:20.056Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class SweepingPeriodicLimits {
    public static final String JSON_PROPERTY_TOTAL_MAX_AMOUNT = "totalMaxAmount";
    @JsonProperty("totalMaxAmount")
    private Amount totalMaxAmount;

    public static final String JSON_PROPERTY_FREQUENCY = "frequency";
    @JsonProperty("frequency")
    private String frequency;

    public static final String JSON_PROPERTY_ALIGNMENT = "alignment";
    @JsonProperty("alignment")
    private String alignment;

}
