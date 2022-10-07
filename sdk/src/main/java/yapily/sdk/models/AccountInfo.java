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
import yapily.sdk.models.AccountIdentification;

/**
* __Conditional__. Used to create a request for the balance of the account specified. Once the user authorises the request, only the balance can be obtained by executing [GET Account Balances](./#get-account-balances).&lt;br&gt;&lt;br&gt; This can be specified in conjunction with &#x60;accountIdentifiersForTransaction&#x60; to generate a &#x60;Consent&#x60; that can both access the accounts balance and transactions.
*/
@ApiModel(description = "__Conditional__. Used to create a request for the balance of the account specified. Once the user authorises the request, only the balance can be obtained by executing [GET Account Balances](./#get-account-balances).<br><br> This can be specified in conjunction with `accountIdentifiersForTransaction` to generate a `Consent` that can both access the accounts balance and transactions.")
    @JsonPropertyOrder({
        AccountInfo.JSON_PROPERTY_ACCOUNT_ID,
        AccountInfo.JSON_PROPERTY_ACCOUNT_IDENTIFICATION
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class AccountInfo {
    public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
    @JsonProperty("accountId")
    private String accountId;

    public static final String JSON_PROPERTY_ACCOUNT_IDENTIFICATION = "accountIdentification";
    @JsonProperty("accountIdentification")
    private AccountIdentification accountIdentification;

}
