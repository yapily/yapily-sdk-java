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
import java.time.OffsetDateTime;
import yapily.sdk.models.Amount;
import yapily.sdk.models.InternationalPaymentRequest;
import yapily.sdk.models.Payee;
import yapily.sdk.models.Payer;
import yapily.sdk.models.PaymentContextType;
import yapily.sdk.models.PaymentType;
import yapily.sdk.models.PeriodicPaymentRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PaymentRequest
 */
public class PaymentRequestTest {
    private final PaymentRequest model = new PaymentRequest();

    /**
     * Model tests for PaymentRequest
     */
    @Test
    public void testPaymentRequest() {
        // TODO: test PaymentRequest
    }

    /**
     * Test the property 'paymentIdempotencyId'
     */
    @Test
    public void paymentIdempotencyIdTest() {
        // TODO: test paymentIdempotencyId
    }

    /**
     * Test the property 'payer'
     */
    @Test
    public void payerTest() {
        // TODO: test payer
    }

    /**
     * Test the property 'reference'
     */
    @Test
    public void referenceTest() {
        // TODO: test reference
    }

    /**
     * Test the property 'contextType'
     */
    @Test
    public void contextTypeTest() {
        // TODO: test contextType
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'payee'
     */
    @Test
    public void payeeTest() {
        // TODO: test payee
    }

    /**
     * Test the property 'periodicPayment'
     */
    @Test
    public void periodicPaymentTest() {
        // TODO: test periodicPayment
    }

    /**
     * Test the property 'internationalPayment'
     */
    @Test
    public void internationalPaymentTest() {
        // TODO: test internationalPayment
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'paymentDateTime'
     */
    @Test
    public void paymentDateTimeTest() {
        // TODO: test paymentDateTime
    }

    /**
     * Test the property 'readRefundAccount'
     */
    @Test
    public void readRefundAccountTest() {
        // TODO: test readRefundAccount
    }

}