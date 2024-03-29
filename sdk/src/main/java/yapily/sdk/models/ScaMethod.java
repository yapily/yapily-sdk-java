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
import yapily.sdk.models.Type;

/**
* __Conditional__. Used to update the authorisation with the sca method of the user&#39;s choice for the &#x60;Institution&#x60; that uses the embedded authorisation flow. If the user has multiple sca methods configured, the &#x60;Institution&#x60; will allow the user to select from each of these options. &lt;br&gt;&lt;br&gt;When the user has multiple sca methods for the &#x60;Institution&#x60;, this is the second step required in the embedded authorisation flow to authorise the &#x60;Consent&#x60;.
*/
@ApiModel(description = "__Conditional__. Used to update the authorisation with the sca method of the user's choice for the `Institution` that uses the embedded authorisation flow. If the user has multiple sca methods configured, the `Institution` will allow the user to select from each of these options. <br><br>When the user has multiple sca methods for the `Institution`, this is the second step required in the embedded authorisation flow to authorise the `Consent`.")
    @JsonPropertyOrder({
        ScaMethod.JSON_PROPERTY_ID,
        ScaMethod.JSON_PROPERTY_TYPE,
        ScaMethod.JSON_PROPERTY_DESCRIPTION
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class ScaMethod {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    @JsonProperty("type")
    private Type type;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    @JsonProperty("description")
    private String description;

}
