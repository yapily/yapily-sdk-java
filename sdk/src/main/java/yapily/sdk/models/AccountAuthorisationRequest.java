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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import yapily.sdk.models.AccountRequest;
import yapily.sdk.models.RedirectRequest;

/**
* AccountAuthorisationRequest
*/
    @JsonPropertyOrder({
        AccountAuthorisationRequest.JSON_PROPERTY_USER_UUID,
        AccountAuthorisationRequest.JSON_PROPERTY_APPLICATION_USER_ID,
        AccountAuthorisationRequest.JSON_PROPERTY_FORWARD_PARAMETERS,
        AccountAuthorisationRequest.JSON_PROPERTY_INSTITUTION_ID,
        AccountAuthorisationRequest.JSON_PROPERTY_CALLBACK,
        AccountAuthorisationRequest.JSON_PROPERTY_REDIRECT,
        AccountAuthorisationRequest.JSON_PROPERTY_ONE_TIME_TOKEN,
        AccountAuthorisationRequest.JSON_PROPERTY_ACCOUNT_REQUEST
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class AccountAuthorisationRequest {
    public static final String JSON_PROPERTY_USER_UUID = "userUuid";
    @JsonProperty("userUuid")
    private UUID userUuid;

    public static final String JSON_PROPERTY_APPLICATION_USER_ID = "applicationUserId";
    @JsonProperty("applicationUserId")
    private String applicationUserId;

    public static final String JSON_PROPERTY_FORWARD_PARAMETERS = "forwardParameters";
    @JsonProperty("forwardParameters")
    @lombok.Singular("forwardParameters") private List<String> forwardParameters;

    public static final String JSON_PROPERTY_INSTITUTION_ID = "institutionId";
    @JsonProperty("institutionId")
    private String institutionId;

    public static final String JSON_PROPERTY_CALLBACK = "callback";
    @JsonProperty("callback")
    private String callback;

    public static final String JSON_PROPERTY_REDIRECT = "redirect";
    @JsonProperty("redirect")
    private RedirectRequest redirect;

    public static final String JSON_PROPERTY_ONE_TIME_TOKEN = "oneTimeToken";
    @JsonProperty("oneTimeToken")
    private Boolean oneTimeToken;

    public static final String JSON_PROPERTY_ACCOUNT_REQUEST = "accountRequest";
    @JsonProperty("accountRequest")
    private AccountRequest accountRequest;

}
