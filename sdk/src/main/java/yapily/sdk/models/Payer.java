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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import yapily.sdk.models.AccountIdentification;
import yapily.sdk.models.Address;

/**
* __Conditional__. The &#x60;Payer&#x60; object contains details of the benefactor [person or business]. If you define this in your payment request, you mustdefine this along with all of the nested mandatory properties.&lt;ol&gt;     &lt;li&gt;The &#x60;Payer&#x60; object is mandatory along with its mandatory properties when the account of the benefactor is from an &#x60;Institution&#x60; in Europe.          See [Berlin Group](https://docs.yapily.com/pages/knowledge/open-banking/berlin_group/) for more information.&lt;/li&gt;     &lt;li&gt;The &#x60;Payer&#x60; should be specified if the &#x60;Payer&#x60; account is intended to be locked.&lt;/li&gt;&lt;/ol&gt;
*/
@ApiModel(description = "__Conditional__. The `Payer` object contains details of the benefactor [person or business]. If you define this in your payment request, you mustdefine this along with all of the nested mandatory properties.<ol>     <li>The `Payer` object is mandatory along with its mandatory properties when the account of the benefactor is from an `Institution` in Europe.          See [Berlin Group](https://docs.yapily.com/pages/knowledge/open-banking/berlin_group/) for more information.</li>     <li>The `Payer` should be specified if the `Payer` account is intended to be locked.</li></ol>")
    @JsonPropertyOrder({
        Payer.JSON_PROPERTY_NAME,
        Payer.JSON_PROPERTY_ACCOUNT_IDENTIFICATIONS,
        Payer.JSON_PROPERTY_ADDRESS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:34:20.056Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Payer {
    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_ACCOUNT_IDENTIFICATIONS = "accountIdentifications";
    @JsonProperty("accountIdentifications")
    @lombok.Singular("accountIdentifications") private Set<AccountIdentification> accountIdentifications;

    public static final String JSON_PROPERTY_ADDRESS = "address";
    @JsonProperty("address")
    private Address address;

}
