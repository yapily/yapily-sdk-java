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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.AddressTypeEnum;

/**
* __Conditional__. The address of the &#x60;Payee&#x60; or &#x60;Payer&#x60;.&lt;ul&gt;&lt;li&gt;&#x60;payee.address&#x60; is mandatory when the &#x60;paymentType&#x60; is an &#x60;INTERNATIONAL&#x60; payment&lt;/li&gt;&lt;li&gt;An &#x60;Institution&#x60; may require you to specify the &#x60;country&#x60; when used in the context ofthe &#x60;Payee&#x60; to be able to make a payment.&lt;/li&gt;&lt;/ul&gt;
*/
@ApiModel(description = "__Conditional__. The address of the `Payee` or `Payer`.<ul><li>`payee.address` is mandatory when the `paymentType` is an `INTERNATIONAL` payment</li><li>An `Institution` may require you to specify the `country` when used in the context ofthe `Payee` to be able to make a payment.</li></ul>")
    @JsonPropertyOrder({
        Address.JSON_PROPERTY_ADDRESS_LINES,
        Address.JSON_PROPERTY_STREET_NAME,
        Address.JSON_PROPERTY_BUILDING_NUMBER,
        Address.JSON_PROPERTY_POST_CODE,
        Address.JSON_PROPERTY_TOWN_NAME,
        Address.JSON_PROPERTY_COUNTY,
        Address.JSON_PROPERTY_COUNTRY,
        Address.JSON_PROPERTY_DEPARTMENT,
        Address.JSON_PROPERTY_SUB_DEPARTMENT,
        Address.JSON_PROPERTY_ADDRESS_TYPE
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Address {
    public static final String JSON_PROPERTY_ADDRESS_LINES = "addressLines";
    @JsonProperty("addressLines")
    @lombok.Singular("addressLines") private List<String> addressLines;

    public static final String JSON_PROPERTY_STREET_NAME = "streetName";
    @JsonProperty("streetName")
    private String streetName;

    public static final String JSON_PROPERTY_BUILDING_NUMBER = "buildingNumber";
    @JsonProperty("buildingNumber")
    private String buildingNumber;

    public static final String JSON_PROPERTY_POST_CODE = "postCode";
    @JsonProperty("postCode")
    private String postCode;

    public static final String JSON_PROPERTY_TOWN_NAME = "townName";
    @JsonProperty("townName")
    private String townName;

    public static final String JSON_PROPERTY_COUNTY = "county";
    @JsonProperty("county")
    @lombok.Singular("county") private List<String> county;

    public static final String JSON_PROPERTY_COUNTRY = "country";
    @JsonProperty("country")
    private String country;

    public static final String JSON_PROPERTY_DEPARTMENT = "department";
    @JsonProperty("department")
    private String department;

    public static final String JSON_PROPERTY_SUB_DEPARTMENT = "subDepartment";
    @JsonProperty("subDepartment")
    private String subDepartment;

    public static final String JSON_PROPERTY_ADDRESS_TYPE = "addressType";
    @JsonProperty("addressType")
    private AddressTypeEnum addressType;

}
