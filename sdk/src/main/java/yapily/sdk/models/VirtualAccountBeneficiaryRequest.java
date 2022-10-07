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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.models.VirtualAccountBeneficiaryAccount;
import yapily.sdk.models.VirtualAccountBeneficiaryAddress;

/**
* VirtualAccountBeneficiaryRequest
*/
    @JsonPropertyOrder({
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_NICKNAME,
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_TYPE,
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_NAME,
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_BIRTH_DATE,
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_PAYMENT_SCHEMES,
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_ADDRESS,
        VirtualAccountBeneficiaryRequest.JSON_PROPERTY_ACCOUNT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class VirtualAccountBeneficiaryRequest {
    public static final String JSON_PROPERTY_NICKNAME = "nickname";
    @JsonProperty("nickname")
    private String nickname;

    public static final String JSON_PROPERTY_TYPE = "type";
    @JsonProperty("type")
    private String type;

    public static final String JSON_PROPERTY_NAME = "name";
    @JsonProperty("name")
    private String name;

    public static final String JSON_PROPERTY_BIRTH_DATE = "birthDate";
    @JsonProperty("birthDate")
    private LocalDate birthDate;

    public static final String JSON_PROPERTY_PAYMENT_SCHEMES = "paymentSchemes";
    @JsonProperty("paymentSchemes")
    @lombok.Singular("paymentSchemes") private List<String> paymentSchemes;

    public static final String JSON_PROPERTY_ADDRESS = "address";
    @JsonProperty("address")
    private VirtualAccountBeneficiaryAddress address;

    public static final String JSON_PROPERTY_ACCOUNT = "account";
    @JsonProperty("account")
    private VirtualAccountBeneficiaryAccount account;

}
