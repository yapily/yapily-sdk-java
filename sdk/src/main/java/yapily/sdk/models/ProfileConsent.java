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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
* Object returned when creating a User Profile.
*/
@ApiModel(description = "Object returned when creating a User Profile.")
    @JsonPropertyOrder({
        ProfileConsent.JSON_PROPERTY_ID,
        ProfileConsent.JSON_PROPERTY_STATUS,
        ProfileConsent.JSON_PROPERTY_USER_ID,
        ProfileConsent.JSON_PROPERTY_REFERENCE_CONSENT_ID,
        ProfileConsent.JSON_PROPERTY_INSTITUTION_ID,
        ProfileConsent.JSON_PROPERTY_CREATED_AT,
        ProfileConsent.JSON_PROPERTY_EXPIRES_AT,
        ProfileConsent.JSON_PROPERTY_DATA_INSERTED_AT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class ProfileConsent {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private UUID id;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private String status;

    public static final String JSON_PROPERTY_USER_ID = "userId";
    @JsonProperty("userId")
    private UUID userId;

    public static final String JSON_PROPERTY_REFERENCE_CONSENT_ID = "referenceConsentId";
    @JsonProperty("referenceConsentId")
    private UUID referenceConsentId;

    public static final String JSON_PROPERTY_INSTITUTION_ID = "institutionId";
    @JsonProperty("institutionId")
    private String institutionId;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
    @JsonProperty("expiresAt")
    private OffsetDateTime expiresAt;

    public static final String JSON_PROPERTY_DATA_INSERTED_AT = "dataInsertedAt";
    @JsonProperty("dataInsertedAt")
    private OffsetDateTime dataInsertedAt;

}
