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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import yapily.sdk.models.Institution;
import yapily.sdk.models.Media;

/**
* Information about the application.
*/
@ApiModel(description = "Information about the application.")
    @JsonPropertyOrder({
        Application.JSON_PROPERTY_UUID,
        Application.JSON_PROPERTY_NAME,
        Application.JSON_PROPERTY_ACTIVE,
        Application.JSON_PROPERTY_AUTH_CALLBACKS,
        Application.JSON_PROPERTY_INSTITUTIONS,
        Application.JSON_PROPERTY_MEDIA,
        Application.JSON_PROPERTY_CREATED,
        Application.JSON_PROPERTY_UPDATED
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Application {
    public static final String JSON_PROPERTY_UUID = "uuid";
    @JsonProperty("uuid")
    private UUID uuid;

    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_ACTIVE = "active";
    @JsonProperty("active")
    private Boolean active;

    public static final String JSON_PROPERTY_AUTH_CALLBACKS = "authCallbacks";
    @JsonProperty("authCallbacks")
    @lombok.Singular("authCallbacks") private List<String> authCallbacks;

    public static final String JSON_PROPERTY_INSTITUTIONS = "institutions";
    @JsonProperty("institutions")
    @lombok.Singular("institutions") private Set<Institution> institutions;

    public static final String JSON_PROPERTY_MEDIA = "media";
    @JsonProperty("media")
    @lombok.Singular("media") private Set<Media> media;

    public static final String JSON_PROPERTY_CREATED = "created";
    @JsonProperty("created")
    private OffsetDateTime created;

    public static final String JSON_PROPERTY_UPDATED = "updated";
    @JsonProperty("updated")
    private OffsetDateTime updated;

}