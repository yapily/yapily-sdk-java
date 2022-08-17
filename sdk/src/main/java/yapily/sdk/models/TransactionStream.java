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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.EnrichedTransaction;
import yapily.sdk.models.TransactionSchedule;

/**
* Part of a financial profile for a User.
*/
@ApiModel(description = "Part of a financial profile for a User.")
    @JsonPropertyOrder({
        TransactionStream.JSON_PROPERTY_NAME,
        TransactionStream.JSON_PROPERTY_TRANSACTIONS,
        TransactionStream.JSON_PROPERTY_TRANSACTION_SCHEDULE,
        TransactionStream.JSON_PROPERTY_SCHEDULE_CONSISTENCY_SCORE,
        TransactionStream.JSON_PROPERTY_NEXT_EXPECTED_TRANSACTION_DATE,
        TransactionStream.JSON_PROPERTY_EARLIEST_TRANSACTION_DATE,
        TransactionStream.JSON_PROPERTY_MOST_RECENT_TRANSACTION_DATE,
        TransactionStream.JSON_PROPERTY_AMOUNT_CONSISTENCY_SCORE,
        TransactionStream.JSON_PROPERTY_AVERAGE_AMOUNT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class TransactionStream {
    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
    @JsonProperty("transactions")
    @lombok.Singular("transactions") private List<EnrichedTransaction> transactions;

    public static final String JSON_PROPERTY_TRANSACTION_SCHEDULE = "transactionSchedule";
    @JsonProperty("transactionSchedule")
    private TransactionSchedule transactionSchedule;

    public static final String JSON_PROPERTY_SCHEDULE_CONSISTENCY_SCORE = "scheduleConsistencyScore";
    @JsonProperty("scheduleConsistencyScore")
    private BigDecimal scheduleConsistencyScore;

    public static final String JSON_PROPERTY_NEXT_EXPECTED_TRANSACTION_DATE = "nextExpectedTransactionDate";
    @JsonProperty("nextExpectedTransactionDate")
    private LocalDate nextExpectedTransactionDate;

    public static final String JSON_PROPERTY_EARLIEST_TRANSACTION_DATE = "earliestTransactionDate";
    @JsonProperty("earliestTransactionDate")
    private LocalDate earliestTransactionDate;

    public static final String JSON_PROPERTY_MOST_RECENT_TRANSACTION_DATE = "mostRecentTransactionDate";
    @JsonProperty("mostRecentTransactionDate")
    private LocalDate mostRecentTransactionDate;

    public static final String JSON_PROPERTY_AMOUNT_CONSISTENCY_SCORE = "amountConsistencyScore";
    @JsonProperty("amountConsistencyScore")
    private BigDecimal amountConsistencyScore;

    public static final String JSON_PROPERTY_AVERAGE_AMOUNT = "averageAmount";
    @JsonProperty("averageAmount")
    private BigDecimal averageAmount;

}