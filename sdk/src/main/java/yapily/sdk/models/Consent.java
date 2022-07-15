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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import yapily.sdk.models.AuthorisationStatus;
import yapily.sdk.models.FeatureEnum;

/**
* Consent
*/
    @JsonPropertyOrder({
        Consent.JSON_PROPERTY_ID,
        Consent.JSON_PROPERTY_USER_UUID,
        Consent.JSON_PROPERTY_APPLICATION_USER_ID,
        Consent.JSON_PROPERTY_REFERENCE_ID,
        Consent.JSON_PROPERTY_INSTITUTION_ID,
        Consent.JSON_PROPERTY_STATUS,
        Consent.JSON_PROPERTY_CREATED_AT,
        Consent.JSON_PROPERTY_TRANSACTION_FROM,
        Consent.JSON_PROPERTY_TRANSACTION_TO,
        Consent.JSON_PROPERTY_EXPIRES_AT,
        Consent.JSON_PROPERTY_TIME_TO_EXPIRE_IN_MILLIS,
        Consent.JSON_PROPERTY_TIME_TO_EXPIRE,
        Consent.JSON_PROPERTY_FEATURE_SCOPE,
        Consent.JSON_PROPERTY_CONSENT_TOKEN,
        Consent.JSON_PROPERTY_STATE,
        Consent.JSON_PROPERTY_AUTHORIZED_AT,
        Consent.JSON_PROPERTY_INSTITUTION_CONSENT_ID
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:40:46.583Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Consent {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private UUID id;

    public static final String JSON_PROPERTY_USER_UUID = "userUuid";
    @JsonProperty("userUuid")
    private UUID userUuid;

    public static final String JSON_PROPERTY_APPLICATION_USER_ID = "applicationUserId";
    @JsonProperty("applicationUserId")
    private String applicationUserId;

    public static final String JSON_PROPERTY_REFERENCE_ID = "referenceId";
    @JsonProperty("referenceId")
    private String referenceId;

    public static final String JSON_PROPERTY_INSTITUTION_ID = "institutionId";
    @JsonProperty("institutionId")
    private String institutionId;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private AuthorisationStatus status;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_TRANSACTION_FROM = "transactionFrom";
    @JsonProperty("transactionFrom")
    private OffsetDateTime transactionFrom;

    public static final String JSON_PROPERTY_TRANSACTION_TO = "transactionTo";
    @JsonProperty("transactionTo")
    private OffsetDateTime transactionTo;

    public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
    @JsonProperty("expiresAt")
    private OffsetDateTime expiresAt;

    public static final String JSON_PROPERTY_TIME_TO_EXPIRE_IN_MILLIS = "timeToExpireInMillis";
    @JsonProperty("timeToExpireInMillis")
    private Long timeToExpireInMillis;

    public static final String JSON_PROPERTY_TIME_TO_EXPIRE = "timeToExpire";
    @JsonProperty("timeToExpire")
    private String timeToExpire;

    public static final String JSON_PROPERTY_FEATURE_SCOPE = "featureScope";
    @JsonProperty("featureScope")
    @lombok.Singular("featureScope") private Set<FeatureEnum> featureScope;

    public static final String JSON_PROPERTY_CONSENT_TOKEN = "consentToken";
    @JsonProperty("consentToken")
    private String consentToken;

    public static final String JSON_PROPERTY_STATE = "state";
    @JsonProperty("state")
    private String state;

    public static final String JSON_PROPERTY_AUTHORIZED_AT = "authorizedAt";
    @JsonProperty("authorizedAt")
    private OffsetDateTime authorizedAt;

    public static final String JSON_PROPERTY_INSTITUTION_CONSENT_ID = "institutionConsentId";
    @JsonProperty("institutionConsentId")
    private String institutionConsentId;

}
