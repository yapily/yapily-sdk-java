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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import yapily.sdk.models.AuthorisationStatus;
import yapily.sdk.models.ExchangeRateInformationResponse;
import yapily.sdk.models.FeatureEnum;
import yapily.sdk.models.PaymentChargeDetails;

/**
* PaymentAuthorisationRequestResponse
*/
    @JsonPropertyOrder({
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_ID,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_USER_UUID,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_APPLICATION_USER_ID,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_REFERENCE_ID,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_INSTITUTION_ID,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_STATUS,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_CREATED_AT,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_TRANSACTION_FROM,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_TRANSACTION_TO,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_EXPIRES_AT,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_TIME_TO_EXPIRE_IN_MILLIS,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_TIME_TO_EXPIRE,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_FEATURE_SCOPE,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_CONSENT_TOKEN,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_STATE,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_AUTHORIZED_AT,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_INSTITUTION_CONSENT_ID,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_CHARGES,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_EXCHANGE_RATE_INFORMATION,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_AUTHORISATION_URL,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_QR_CODE_URL,
        PaymentAuthorisationRequestResponse.JSON_PROPERTY_EXPLANATION
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-06T10:23:44.837Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PaymentAuthorisationRequestResponse {
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

    public static final String JSON_PROPERTY_CHARGES = "charges";
    @JsonProperty("charges")
    @lombok.Singular("charges") private List<PaymentChargeDetails> charges;

    public static final String JSON_PROPERTY_EXCHANGE_RATE_INFORMATION = "exchangeRateInformation";
    @JsonProperty("exchangeRateInformation")
    private ExchangeRateInformationResponse exchangeRateInformation;

    public static final String JSON_PROPERTY_AUTHORISATION_URL = "authorisationUrl";
    @JsonProperty("authorisationUrl")
    private String authorisationUrl;

    public static final String JSON_PROPERTY_QR_CODE_URL = "qrCodeUrl";
    @JsonProperty("qrCodeUrl")
    private String qrCodeUrl;

    public static final String JSON_PROPERTY_EXPLANATION = "explanation";
    @JsonProperty("explanation")
    private String explanation;

}
