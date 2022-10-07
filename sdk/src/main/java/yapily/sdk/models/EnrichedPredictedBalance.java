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
import java.math.BigDecimal;
import java.time.LocalDate;

/**
* A list of Predicted Account Balances for future date range.
*/
@ApiModel(description = "A list of Predicted Account Balances for future date range.")
    @JsonPropertyOrder({
        EnrichedPredictedBalance.JSON_PROPERTY_DATE,
        EnrichedPredictedBalance.JSON_PROPERTY_MEDIAN_BALANCE,
        EnrichedPredictedBalance.JSON_PROPERTY_90PERCENTILE_BALANCE,
        EnrichedPredictedBalance.JSON_PROPERTY_10PERCENTILE_BALANCE
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class EnrichedPredictedBalance {
    public static final String JSON_PROPERTY_DATE = "date";
    @JsonProperty("date")
    private LocalDate date;

    public static final String JSON_PROPERTY_MEDIAN_BALANCE = "medianBalance";
    @JsonProperty("medianBalance")
    private BigDecimal medianBalance;

    public static final String JSON_PROPERTY_90PERCENTILE_BALANCE = "90percentileBalance";
    @JsonProperty("90percentileBalance")
    private BigDecimal _90percentileBalance;

    public static final String JSON_PROPERTY_10PERCENTILE_BALANCE = "10percentileBalance";
    @JsonProperty("10percentileBalance")
    private BigDecimal _10percentileBalance;

}