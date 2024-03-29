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
import yapily.sdk.models.VirtualAccountBusinessClient;
import yapily.sdk.models.VirtualAccountClientStatus;
import yapily.sdk.models.VirtualAccountClientType;
import yapily.sdk.models.VirtualAccountIndividualClient;
import yapily.sdk.models.VirtualAccountKycStatus;

/**
* VirtualAccountClient
*/
    @JsonPropertyOrder({
        VirtualAccountClient.JSON_PROPERTY_ID,
        VirtualAccountClient.JSON_PROPERTY_TYPE,
        VirtualAccountClient.JSON_PROPERTY_KYC_STATUS,
        VirtualAccountClient.JSON_PROPERTY_STATUS,
        VirtualAccountClient.JSON_PROPERTY_CREATED_DATE_TIME,
        VirtualAccountClient.JSON_PROPERTY_INDIVIDUAL,
        VirtualAccountClient.JSON_PROPERTY_BUSINESS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class VirtualAccountClient {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    @JsonProperty("type")
    private VirtualAccountClientType type;

    public static final String JSON_PROPERTY_KYC_STATUS = "kycStatus";
    @JsonProperty("kycStatus")
    private VirtualAccountKycStatus kycStatus;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private VirtualAccountClientStatus status;

    public static final String JSON_PROPERTY_CREATED_DATE_TIME = "createdDateTime";
    @JsonProperty("createdDateTime")
    private OffsetDateTime createdDateTime;

    public static final String JSON_PROPERTY_INDIVIDUAL = "individual";
    @JsonProperty("individual")
    private VirtualAccountIndividualClient individual;

    public static final String JSON_PROPERTY_BUSINESS = "business";
    @JsonProperty("business")
    private VirtualAccountBusinessClient business;

}
