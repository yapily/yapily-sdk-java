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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.ApiError;
import yapily.sdk.models.MonitoringEndpointStatus;
import yapily.sdk.models.RawResponse;

/**
* Used to return errors from the bank from each request&lt;ul&gt;&lt;li&gt;&#x60;400&#x60; - Returned by any &#x60;POST&#x60; endpoint when the body does not conform to the contract&lt;/li&gt;&lt;li&gt;&#x60;401&#x60; - Returned by any endpoint when an invalid &#x60;authToken&#x60; is used for authentication&lt;/li&gt;&lt;li&gt;&#x60;403&#x60; - Returned by any [Financial Data](https://docs.yapily.com/api/reference/#tag/Financial-Data) and any [Payments](https://docs.yapily.com/api/reference/#tag/Payments) endpoint when the &#x60;Consent&#x60; is no longer authorised to access financial data or to make a payment&lt;/li&gt;&lt;li&gt;&#x60;404&#x60; - Returned by any endpoint where there are path parameters and the path parameters supplied are unable to find the desired resource&lt;/li&gt;&lt;li&gt;&#x60;409&#x60; - Returned by any &#x60;POST&#x60; endpoint when creating a resource that conflicts with any other existing resource e.g. [Create User](https://docs.yapily.com/api/reference/#operation/addUser)&lt;/li&gt;&lt;li&gt;&#x60;424&#x60; - Returned by any [Financial Data](https://docs.yapily.com/api/reference/#tag/Financial-Data) and any [Payments](https://docs.yapily.com/api/reference/#tag/Payments) endpoint when the feature to be accessed is not supported by the &#x60;Institution&#x60;.&lt;/li&gt;&lt;li&gt;&#x60;500&#x60; - Returned by any endpoint when Yapily is down. If you encounter any false positives, please &lt;a href&#x3D;\&quot;mailto:support@yapily.com\&quot;&gt;notify us&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;
*/
@ApiModel(description = "Used to return errors from the bank from each request<ul><li>`400` - Returned by any `POST` endpoint when the body does not conform to the contract</li><li>`401` - Returned by any endpoint when an invalid `authToken` is used for authentication</li><li>`403` - Returned by any [Financial Data](https://docs.yapily.com/api/reference/#tag/Financial-Data) and any [Payments](https://docs.yapily.com/api/reference/#tag/Payments) endpoint when the `Consent` is no longer authorised to access financial data or to make a payment</li><li>`404` - Returned by any endpoint where there are path parameters and the path parameters supplied are unable to find the desired resource</li><li>`409` - Returned by any `POST` endpoint when creating a resource that conflicts with any other existing resource e.g. [Create User](https://docs.yapily.com/api/reference/#operation/addUser)</li><li>`424` - Returned by any [Financial Data](https://docs.yapily.com/api/reference/#tag/Financial-Data) and any [Payments](https://docs.yapily.com/api/reference/#tag/Payments) endpoint when the feature to be accessed is not supported by the `Institution`.</li><li>`500` - Returned by any endpoint when Yapily is down. If you encounter any false positives, please <a href=\"mailto:support@yapily.com\">notify us</a></li></ul>")
    @JsonPropertyOrder({
        ApiResponseError.JSON_PROPERTY_ERROR,
        ApiResponseError.JSON_PROPERTY_MONITORING,
        ApiResponseError.JSON_PROPERTY_RAW
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:34:20.056Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class ApiResponseError {
    public static final String JSON_PROPERTY_ERROR = "error";
    @JsonProperty("error")
    private ApiError error;

    public static final String JSON_PROPERTY_MONITORING = "monitoring";
    @JsonProperty("monitoring")
    @lombok.Singular("monitoring") private List<MonitoringEndpointStatus> monitoring;

    public static final String JSON_PROPERTY_RAW = "raw";
    @JsonProperty("raw")
    @lombok.Singular("raw") private List<RawResponse> raw;

}
