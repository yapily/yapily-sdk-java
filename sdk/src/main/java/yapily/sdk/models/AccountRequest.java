/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.2.0
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import yapily.sdk.models.AccountInfo;
import yapily.sdk.models.FeatureEnum;

/**
* __Conditional__. Used to further specify details of the &#x60;Consent&#x60; to request &lt;br&gt;&lt;br&gt;Conditions:&lt;ol&gt;&lt;li&gt;Mandatory to access balance/transaction data for an &#x60;Institution&#x60; within the [CBI Globe](https://docs.yapily.com/pages/knowledge/open-banking/cbi_globe/)&lt;/li&gt;&lt;li&gt;Mandatory to specify the individual scopes to request from the user at the &#x60;Institution&#x60; for an account authorisation&lt;/li&gt;&lt;li&gt;Mandatory to specify an expiry time on the created &#x60;Consent&#x60; at which time will render it unusable&lt;/li&gt;&lt;li&gt;Mandatory to specify the date range that the created &#x60;Consent&#x60; will be able to access transactions for (given the range is support for the &#x60;Institution&#x60;)&lt;/li&gt;&lt;/ol&gt;
*/
@ApiModel(description = "__Conditional__. Used to further specify details of the `Consent` to request <br><br>Conditions:<ol><li>Mandatory to access balance/transaction data for an `Institution` within the [CBI Globe](https://docs.yapily.com/pages/knowledge/open-banking/cbi_globe/)</li><li>Mandatory to specify the individual scopes to request from the user at the `Institution` for an account authorisation</li><li>Mandatory to specify an expiry time on the created `Consent` at which time will render it unusable</li><li>Mandatory to specify the date range that the created `Consent` will be able to access transactions for (given the range is support for the `Institution`)</li></ol>")
    @JsonPropertyOrder({
        AccountRequest.JSON_PROPERTY_TRANSACTION_FROM,
        AccountRequest.JSON_PROPERTY_TRANSACTION_TO,
        AccountRequest.JSON_PROPERTY_EXPIRES_AT,
        AccountRequest.JSON_PROPERTY_ACCOUNT_IDENTIFIERS,
        AccountRequest.JSON_PROPERTY_ACCOUNT_IDENTIFIERS_FOR_TRANSACTION,
        AccountRequest.JSON_PROPERTY_ACCOUNT_IDENTIFIERS_FOR_BALANCE,
        AccountRequest.JSON_PROPERTY_FEATURE_SCOPE
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-06T10:23:44.837Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class AccountRequest {
    public static final String JSON_PROPERTY_TRANSACTION_FROM = "transactionFrom";
    @JsonProperty("transactionFrom")
    private OffsetDateTime transactionFrom;

    public static final String JSON_PROPERTY_TRANSACTION_TO = "transactionTo";
    @JsonProperty("transactionTo")
    private OffsetDateTime transactionTo;

    public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
    @JsonProperty("expiresAt")
    private OffsetDateTime expiresAt;

    public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIERS = "accountIdentifiers";
    @JsonProperty("accountIdentifiers")
    private AccountInfo accountIdentifiers;

    public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIERS_FOR_TRANSACTION = "accountIdentifiersForTransaction";
    @JsonProperty("accountIdentifiersForTransaction")
    @lombok.Singular("accountIdentifiersForTransaction") private List<AccountInfo> accountIdentifiersForTransaction;

    public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIERS_FOR_BALANCE = "accountIdentifiersForBalance";
    @JsonProperty("accountIdentifiersForBalance")
    @lombok.Singular("accountIdentifiersForBalance") private List<AccountInfo> accountIdentifiersForBalance;

    public static final String JSON_PROPERTY_FEATURE_SCOPE = "featureScope";
    @JsonProperty("featureScope")
    @lombok.Singular("featureScope") private Set<FeatureEnum> featureScope;

}
