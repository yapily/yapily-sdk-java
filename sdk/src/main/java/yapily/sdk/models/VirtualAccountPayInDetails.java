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
import org.openapitools.jackson.nullable.JsonNullable;
import yapily.sdk.models.Amount;
import yapily.sdk.models.VirtualAccountPaymentSource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

/**
* VirtualAccountPayInDetails
*/
    @JsonPropertyOrder({
        VirtualAccountPayInDetails.JSON_PROPERTY_ID,
        VirtualAccountPayInDetails.JSON_PROPERTY_PAYMENT_SCHEME,
        VirtualAccountPayInDetails.JSON_PROPERTY_AMOUNT,
        VirtualAccountPayInDetails.JSON_PROPERTY_REFERENCE,
        VirtualAccountPayInDetails.JSON_PROPERTY_SOURCE,
        VirtualAccountPayInDetails.JSON_PROPERTY_NAME,
        VirtualAccountPayInDetails.JSON_PROPERTY_ADDRESS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class VirtualAccountPayInDetails {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_PAYMENT_SCHEME = "paymentScheme";
    @JsonProperty("paymentScheme")
    private String paymentScheme;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    @JsonProperty("amount")
    private Amount amount;

    public static final String JSON_PROPERTY_REFERENCE = "reference";
    @JsonProperty("reference")
    private String reference;

    public static final String JSON_PROPERTY_SOURCE = "source";
    @JsonProperty("source")
    private VirtualAccountPaymentSource source;

    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_ADDRESS = "address";
    @JsonProperty("address")
    private String address;

}
