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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import yapily.sdk.models.MonitoringStatusEnum;

/**
* MonitoringEndpointStatus
*/
    @JsonPropertyOrder({
        MonitoringEndpointStatus.JSON_PROPERTY_LAST_TESTED,
        MonitoringEndpointStatus.JSON_PROPERTY_RESOURCE_ENDPOINT,
        MonitoringEndpointStatus.JSON_PROPERTY_SPAN,
        MonitoringEndpointStatus.JSON_PROPERTY_STATUS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:40:46.583Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class MonitoringEndpointStatus {
    public static final String JSON_PROPERTY_LAST_TESTED = "lastTested";
    @JsonProperty("lastTested")
    private OffsetDateTime lastTested;

    public static final String JSON_PROPERTY_RESOURCE_ENDPOINT = "resourceEndpoint";
    @JsonProperty("resourceEndpoint")
    private String resourceEndpoint;

    public static final String JSON_PROPERTY_SPAN = "span";
    @JsonProperty("span")
    private String span;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private MonitoringStatusEnum status;

}
