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
import yapily.sdk.models.InstitutionError;

/**
* Provides details of the error that has occured.
*/
@ApiModel(description = "Provides details of the error that has occured.")
    @JsonPropertyOrder({
        ApiError.JSON_PROPERTY_CODE,
        ApiError.JSON_PROPERTY_INSTITUTION_ERROR,
        ApiError.JSON_PROPERTY_MESSAGE,
        ApiError.JSON_PROPERTY_SOURCE,
        ApiError.JSON_PROPERTY_STATUS,
        ApiError.JSON_PROPERTY_TRACING_ID
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class ApiError {
    public static final String JSON_PROPERTY_CODE = "code";
    @JsonProperty("code")
    private Integer code;

    public static final String JSON_PROPERTY_INSTITUTION_ERROR = "institutionError";
    @JsonProperty("institutionError")
    private InstitutionError institutionError;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    @JsonProperty("message")
    private String message;

    public static final String JSON_PROPERTY_SOURCE = "source";
    @JsonProperty("source")
    private String source;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private String status;

    public static final String JSON_PROPERTY_TRACING_ID = "tracingId";
    @JsonProperty("tracingId")
    private String tracingId;

}
