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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import yapily.sdk.models.AccountIdentification;

/**
* __Mandatory__. The &#x60;PayeeDetails&#x60; object contains details of the beneficiary [person or business]. You must define this in your payment request alongwith all of the nested mandatory properties.
*/
@ApiModel(description = "__Mandatory__. The `PayeeDetails` object contains details of the beneficiary [person or business]. You must define this in your payment request alongwith all of the nested mandatory properties.")
    @JsonPropertyOrder({
        PayeeDetails.JSON_PROPERTY_NAME,
        PayeeDetails.JSON_PROPERTY_ACCOUNT_IDENTIFICATIONS,
        PayeeDetails.JSON_PROPERTY_COUNTRY
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-06T10:23:44.837Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PayeeDetails {
    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_ACCOUNT_IDENTIFICATIONS = "accountIdentifications";
    @JsonProperty("accountIdentifications")
    @lombok.Singular("accountIdentifications") private Set<AccountIdentification> accountIdentifications;

    public static final String JSON_PROPERTY_COUNTRY = "country";
    @JsonProperty("country")
    private String country;

}
