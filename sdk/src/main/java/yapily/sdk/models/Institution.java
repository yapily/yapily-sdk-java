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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yapily.sdk.models.Country;
import yapily.sdk.models.CredentialsType;
import yapily.sdk.models.EnvironmentType;
import yapily.sdk.models.FeatureEnum;
import yapily.sdk.models.Media;
import yapily.sdk.models.MonitoringFeatureStatus;

/**
* Institution
*/
    @JsonPropertyOrder({
        Institution.JSON_PROPERTY_ID,
        Institution.JSON_PROPERTY_NAME,
        Institution.JSON_PROPERTY_FULL_NAME,
        Institution.JSON_PROPERTY_COUNTRIES,
        Institution.JSON_PROPERTY_ENVIRONMENT_TYPE,
        Institution.JSON_PROPERTY_CREDENTIALS_TYPE,
        Institution.JSON_PROPERTY_MEDIA,
        Institution.JSON_PROPERTY_FEATURES,
        Institution.JSON_PROPERTY_MONITORING
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:34:20.056Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Institution {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_FULL_NAME = "fullName";
    @JsonProperty("fullName")
    private String fullName;

    public static final String JSON_PROPERTY_COUNTRIES = "countries";
    @JsonProperty("countries")
    @lombok.Singular("countries") private Set<Country> countries;

    public static final String JSON_PROPERTY_ENVIRONMENT_TYPE = "environmentType";
    @JsonProperty("environmentType")
    private EnvironmentType environmentType;

    public static final String JSON_PROPERTY_CREDENTIALS_TYPE = "credentialsType";
    @JsonProperty("credentialsType")
    private CredentialsType credentialsType;

    public static final String JSON_PROPERTY_MEDIA = "media";
    @JsonProperty("media")
    @lombok.Singular("media") private Set<Media> media;

    public static final String JSON_PROPERTY_FEATURES = "features";
    @JsonProperty("features")
    @lombok.Singular("features") private Set<FeatureEnum> features;

    public static final String JSON_PROPERTY_MONITORING = "monitoring";
    @JsonProperty("monitoring")
    @lombok.Singular("monitoring") private Map<String, MonitoringFeatureStatus> monitoring;

}
