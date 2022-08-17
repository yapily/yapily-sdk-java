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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yapily.sdk.models.RawRequest;

/**
* RawResponse
*/
    @JsonPropertyOrder({
        RawResponse.JSON_PROPERTY_REQUEST,
        RawResponse.JSON_PROPERTY_DURATION,
        RawResponse.JSON_PROPERTY_HEADERS,
        RawResponse.JSON_PROPERTY_RESULT_CODE,
        RawResponse.JSON_PROPERTY_RESULT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class RawResponse {
    public static final String JSON_PROPERTY_REQUEST = "request";
    @JsonProperty("request")
    private RawRequest request;

    public static final String JSON_PROPERTY_DURATION = "duration";
    @JsonProperty("duration")
    private String duration;

    public static final String JSON_PROPERTY_HEADERS = "headers";
    @JsonProperty("headers")
    @lombok.Singular("headers") private Map<String, String> headers;

    public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
    @JsonProperty("resultCode")
    private Integer resultCode;

    public static final String JSON_PROPERTY_RESULT = "result";
    @JsonProperty("result")
    private Object result;

}
