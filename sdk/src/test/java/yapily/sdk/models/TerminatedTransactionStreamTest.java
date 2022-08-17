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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TerminatedTransactionStream
 */
public class TerminatedTransactionStreamTest {
    private final TerminatedTransactionStream model = new TerminatedTransactionStream();

    /**
     * Model tests for TerminatedTransactionStream
     */
    @Test
    public void testTerminatedTransactionStream() {
        // TODO: test TerminatedTransactionStream
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'transactions'
     */
    @Test
    public void transactionsTest() {
        // TODO: test transactions
    }

    /**
     * Test the property 'transactionSchedule'
     */
    @Test
    public void transactionScheduleTest() {
        // TODO: test transactionSchedule
    }

    /**
     * Test the property 'scheduleConsistencyScore'
     */
    @Test
    public void scheduleConsistencyScoreTest() {
        // TODO: test scheduleConsistencyScore
    }

    /**
     * Test the property 'nextExpectedTransactionDate'
     */
    @Test
    public void nextExpectedTransactionDateTest() {
        // TODO: test nextExpectedTransactionDate
    }

    /**
     * Test the property 'earliestTransactionDate'
     */
    @Test
    public void earliestTransactionDateTest() {
        // TODO: test earliestTransactionDate
    }

    /**
     * Test the property 'mostRecentTransactionDate'
     */
    @Test
    public void mostRecentTransactionDateTest() {
        // TODO: test mostRecentTransactionDate
    }

    /**
     * Test the property 'amountConsistencyScore'
     */
    @Test
    public void amountConsistencyScoreTest() {
        // TODO: test amountConsistencyScore
    }

    /**
     * Test the property 'averageAmount'
     */
    @Test
    public void averageAmountTest() {
        // TODO: test averageAmount
    }

    /**
     * Test the property 'missedTransactions'
     */
    @Test
    public void missedTransactionsTest() {
        // TODO: test missedTransactions
    }

}