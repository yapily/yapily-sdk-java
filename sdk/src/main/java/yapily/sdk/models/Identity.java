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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.IdentityAddress;

/**
* Identity
*/
    @JsonPropertyOrder({
        Identity.JSON_PROPERTY_ID,
        Identity.JSON_PROPERTY_FIRST_NAME,
        Identity.JSON_PROPERTY_LAST_NAME,
        Identity.JSON_PROPERTY_FULL_NAME,
        Identity.JSON_PROPERTY_GENDER,
        Identity.JSON_PROPERTY_BIRTHDATE,
        Identity.JSON_PROPERTY_EMAIL,
        Identity.JSON_PROPERTY_PHONE,
        Identity.JSON_PROPERTY_ADDRESSES
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Identity {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
    @JsonProperty("firstName")
    private String firstName;

    public static final String JSON_PROPERTY_LAST_NAME = "lastName";
    @JsonProperty("lastName")
    private String lastName;

    public static final String JSON_PROPERTY_FULL_NAME = "fullName";
    @JsonProperty("fullName")
    private String fullName;

    public static final String JSON_PROPERTY_GENDER = "gender";
    @JsonProperty("gender")
    private String gender;

    public static final String JSON_PROPERTY_BIRTHDATE = "birthdate";
    @JsonProperty("birthdate")
    private String birthdate;

    public static final String JSON_PROPERTY_EMAIL = "email";
    @JsonProperty("email")
    private String email;

    public static final String JSON_PROPERTY_PHONE = "phone";
    @JsonProperty("phone")
    private String phone;

    public static final String JSON_PROPERTY_ADDRESSES = "addresses";
    @JsonProperty("addresses")
    @lombok.Singular("addresses") private List<IdentityAddress> addresses;

}