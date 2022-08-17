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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import yapily.sdk.models.AuthorisationStatus;
import yapily.sdk.models.FeatureEnum;
import yapily.sdk.models.InitiationDetails;
import yapily.sdk.models.Payer;
import yapily.sdk.models.SweepingControlParameters;

/**
* SweepingAuthorisationResponse
*/
    @JsonPropertyOrder({
        SweepingAuthorisationResponse.JSON_PROPERTY_ID,
        SweepingAuthorisationResponse.JSON_PROPERTY_USER_ID,
        SweepingAuthorisationResponse.JSON_PROPERTY_APPLICATION_USER_ID,
        SweepingAuthorisationResponse.JSON_PROPERTY_INSTITUTION_ID,
        SweepingAuthorisationResponse.JSON_PROPERTY_STATUS,
        SweepingAuthorisationResponse.JSON_PROPERTY_CREATED_AT,
        SweepingAuthorisationResponse.JSON_PROPERTY_FEATURE_SCOPE,
        SweepingAuthorisationResponse.JSON_PROPERTY_CONSENT_TOKEN,
        SweepingAuthorisationResponse.JSON_PROPERTY_STATE,
        SweepingAuthorisationResponse.JSON_PROPERTY_AUTHORIZED_AT,
        SweepingAuthorisationResponse.JSON_PROPERTY_INSTITUTION_CONSENT_ID,
        SweepingAuthorisationResponse.JSON_PROPERTY_AUTHORISATION_URL,
        SweepingAuthorisationResponse.JSON_PROPERTY_QR_CODE_URL,
        SweepingAuthorisationResponse.JSON_PROPERTY_CONTROL_PARAMETERS,
        SweepingAuthorisationResponse.JSON_PROPERTY_PAYER,
        SweepingAuthorisationResponse.JSON_PROPERTY_INITIATION_DETAILS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class SweepingAuthorisationResponse {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private UUID id;

    public static final String JSON_PROPERTY_USER_ID = "userId";
    @JsonProperty("userId")
    private UUID userId;

    public static final String JSON_PROPERTY_APPLICATION_USER_ID = "applicationUserId";
    @JsonProperty("applicationUserId")
    private String applicationUserId;

    public static final String JSON_PROPERTY_INSTITUTION_ID = "institutionId";
    @JsonProperty("institutionId")
    private String institutionId;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private AuthorisationStatus status;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

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

    public static final String JSON_PROPERTY_AUTHORISATION_URL = "authorisationUrl";
    @JsonProperty("authorisationUrl")
    private String authorisationUrl;

    public static final String JSON_PROPERTY_QR_CODE_URL = "qrCodeUrl";
    @JsonProperty("qrCodeUrl")
    private String qrCodeUrl;

    public static final String JSON_PROPERTY_CONTROL_PARAMETERS = "controlParameters";
    @JsonProperty("controlParameters")
    private SweepingControlParameters controlParameters;

    public static final String JSON_PROPERTY_PAYER = "payer";
    @JsonProperty("payer")
    private Payer payer;

    public static final String JSON_PROPERTY_INITIATION_DETAILS = "initiationDetails";
    @JsonProperty("initiationDetails")
    private InitiationDetails initiationDetails;

}
