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
import yapily.sdk.models.VirtualAccountAddress;
import yapily.sdk.models.VirtualAccountClientBusinessType;

/**
* VirtualAccountBusinessClient
*/
    @JsonPropertyOrder({
        VirtualAccountBusinessClient.JSON_PROPERTY_NAME,
        VirtualAccountBusinessClient.JSON_PROPERTY_TYPE,
        VirtualAccountBusinessClient.JSON_PROPERTY_REGISTRATION_NUMBER,
        VirtualAccountBusinessClient.JSON_PROPERTY_REGISTERED_ADDRESS,
        VirtualAccountBusinessClient.JSON_PROPERTY_TRADING_ADDRESS,
        VirtualAccountBusinessClient.JSON_PROPERTY_CONTACT_NAME,
        VirtualAccountBusinessClient.JSON_PROPERTY_EMAIL,
        VirtualAccountBusinessClient.JSON_PROPERTY_PHONE
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class VirtualAccountBusinessClient {
    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_TYPE = "type";
    @JsonProperty("type")
    private VirtualAccountClientBusinessType type;

    public static final String JSON_PROPERTY_REGISTRATION_NUMBER = "registrationNumber";
    @JsonProperty("registrationNumber")
    private String registrationNumber;

    public static final String JSON_PROPERTY_REGISTERED_ADDRESS = "registeredAddress";
    @JsonProperty("registeredAddress")
    private VirtualAccountAddress registeredAddress;

    public static final String JSON_PROPERTY_TRADING_ADDRESS = "tradingAddress";
    @JsonProperty("tradingAddress")
    private VirtualAccountAddress tradingAddress;

    public static final String JSON_PROPERTY_CONTACT_NAME = "contactName";
    @JsonProperty("contactName")
    private String contactName;

    public static final String JSON_PROPERTY_EMAIL = "email";
    @JsonProperty("email")
    private String email;

    public static final String JSON_PROPERTY_PHONE = "phone";
    @JsonProperty("phone")
    private String phone;

}
