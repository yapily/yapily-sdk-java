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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.AddressDetails;
import yapily.sdk.models.Amount;
import yapily.sdk.models.CurrencyExchange;
import yapily.sdk.models.Enrichment;
import yapily.sdk.models.IsoBankTransactionCode;
import yapily.sdk.models.Merchant;
import yapily.sdk.models.Payee;
import yapily.sdk.models.Payer;
import yapily.sdk.models.ProprietaryBankTransactionCode;
import yapily.sdk.models.StatementReference;
import yapily.sdk.models.TransactionBalance;
import yapily.sdk.models.TransactionChargeDetails;
import yapily.sdk.models.TransactionStatusEnum;

/**
* Transaction
*/
    @JsonPropertyOrder({
        Transaction.JSON_PROPERTY_ID,
        Transaction.JSON_PROPERTY_DATE,
        Transaction.JSON_PROPERTY_BOOKING_DATE_TIME,
        Transaction.JSON_PROPERTY_VALUE_DATE_TIME,
        Transaction.JSON_PROPERTY_STATUS,
        Transaction.JSON_PROPERTY_AMOUNT,
        Transaction.JSON_PROPERTY_CURRENCY,
        Transaction.JSON_PROPERTY_TRANSACTION_AMOUNT,
        Transaction.JSON_PROPERTY_GROSS_AMOUNT,
        Transaction.JSON_PROPERTY_CURRENCY_EXCHANGE,
        Transaction.JSON_PROPERTY_CHARGE_DETAILS,
        Transaction.JSON_PROPERTY_REFERENCE,
        Transaction.JSON_PROPERTY_STATEMENT_REFERENCES,
        Transaction.JSON_PROPERTY_DESCRIPTION,
        Transaction.JSON_PROPERTY_TRANSACTION_INFORMATION,
        Transaction.JSON_PROPERTY_ADDRESS_DETAILS,
        Transaction.JSON_PROPERTY_ISO_BANK_TRANSACTION_CODE,
        Transaction.JSON_PROPERTY_PROPRIETARY_BANK_TRANSACTION_CODE,
        Transaction.JSON_PROPERTY_BALANCE,
        Transaction.JSON_PROPERTY_PAYEE_DETAILS,
        Transaction.JSON_PROPERTY_PAYER_DETAILS,
        Transaction.JSON_PROPERTY_MERCHANT,
        Transaction.JSON_PROPERTY_ENRICHMENT,
        Transaction.JSON_PROPERTY_SUPPLEMENTARY_DATA,
        Transaction.JSON_PROPERTY_TRANSACTION_MUTABILITY
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Transaction {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_DATE = "date";
    @JsonProperty("date")
    private OffsetDateTime date;

    public static final String JSON_PROPERTY_BOOKING_DATE_TIME = "bookingDateTime";
    @JsonProperty("bookingDateTime")
    private OffsetDateTime bookingDateTime;

    public static final String JSON_PROPERTY_VALUE_DATE_TIME = "valueDateTime";
    @JsonProperty("valueDateTime")
    private OffsetDateTime valueDateTime;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private TransactionStatusEnum status;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    @JsonProperty("amount")
    private BigDecimal amount;

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    @JsonProperty("currency")
    private String currency;

    public static final String JSON_PROPERTY_TRANSACTION_AMOUNT = "transactionAmount";
    @JsonProperty("transactionAmount")
    private Amount transactionAmount;

    public static final String JSON_PROPERTY_GROSS_AMOUNT = "grossAmount";
    @JsonProperty("grossAmount")
    private Amount grossAmount;

    public static final String JSON_PROPERTY_CURRENCY_EXCHANGE = "currencyExchange";
    @JsonProperty("currencyExchange")
    private CurrencyExchange currencyExchange;

    public static final String JSON_PROPERTY_CHARGE_DETAILS = "chargeDetails";
    @JsonProperty("chargeDetails")
    private TransactionChargeDetails chargeDetails;

    public static final String JSON_PROPERTY_REFERENCE = "reference";
    @JsonProperty("reference")
    private String reference;

    public static final String JSON_PROPERTY_STATEMENT_REFERENCES = "statementReferences";
    @JsonProperty("statementReferences")
    @lombok.Singular("statementReferences") private List<StatementReference> statementReferences;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    @JsonProperty("description")
    private String description;

    public static final String JSON_PROPERTY_TRANSACTION_INFORMATION = "transactionInformation";
    @JsonProperty("transactionInformation")
    @lombok.Singular("transactionInformation") private List<String> transactionInformation;

    public static final String JSON_PROPERTY_ADDRESS_DETAILS = "addressDetails";
    @JsonProperty("addressDetails")
    private AddressDetails addressDetails;

    public static final String JSON_PROPERTY_ISO_BANK_TRANSACTION_CODE = "isoBankTransactionCode";
    @JsonProperty("isoBankTransactionCode")
    private IsoBankTransactionCode isoBankTransactionCode;

    public static final String JSON_PROPERTY_PROPRIETARY_BANK_TRANSACTION_CODE = "proprietaryBankTransactionCode";
    @JsonProperty("proprietaryBankTransactionCode")
    private ProprietaryBankTransactionCode proprietaryBankTransactionCode;

    public static final String JSON_PROPERTY_BALANCE = "balance";
    @JsonProperty("balance")
    private TransactionBalance balance;

    public static final String JSON_PROPERTY_PAYEE_DETAILS = "payeeDetails";
    @JsonProperty("payeeDetails")
    private Payee payeeDetails;

    public static final String JSON_PROPERTY_PAYER_DETAILS = "payerDetails";
    @JsonProperty("payerDetails")
    private Payer payerDetails;

    public static final String JSON_PROPERTY_MERCHANT = "merchant";
    @JsonProperty("merchant")
    private Merchant merchant;

    public static final String JSON_PROPERTY_ENRICHMENT = "enrichment";
    @JsonProperty("enrichment")
    private Enrichment enrichment;

    public static final String JSON_PROPERTY_SUPPLEMENTARY_DATA = "supplementaryData";
    @JsonProperty("supplementaryData")
    private Object supplementaryData;

    public static final String JSON_PROPERTY_TRANSACTION_MUTABILITY = "transactionMutability";
    @JsonProperty("transactionMutability")
    private String transactionMutability;

}