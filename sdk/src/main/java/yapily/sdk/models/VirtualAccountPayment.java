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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import yapily.sdk.models.Amount;
import yapily.sdk.models.VirtualAccountPaymentDestination;
import yapily.sdk.models.VirtualAccountPaymentSource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

/**
* VirtualAccountPayment
*/
    @JsonPropertyOrder({
        VirtualAccountPayment.JSON_PROPERTY_ID,
        VirtualAccountPayment.JSON_PROPERTY_CREATED_DATE_TIME,
        VirtualAccountPayment.JSON_PROPERTY_PAYMENT_DATE,
        VirtualAccountPayment.JSON_PROPERTY_TYPE,
        VirtualAccountPayment.JSON_PROPERTY_PAYMENT_SCHEME,
        VirtualAccountPayment.JSON_PROPERTY_AMOUNT,
        VirtualAccountPayment.JSON_PROPERTY_REFERENCE,
        VirtualAccountPayment.JSON_PROPERTY_STATUS,
        VirtualAccountPayment.JSON_PROPERTY_SOURCE,
        VirtualAccountPayment.JSON_PROPERTY_DESTINATION,
        VirtualAccountPayment.JSON_PROPERTY_ORIGINAL_PAYMENT_ID
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class VirtualAccountPayment {
    public static final String JSON_PROPERTY_ID = "id";
    @JsonProperty("id")
    private String id;

    public static final String JSON_PROPERTY_CREATED_DATE_TIME = "createdDateTime";
    @JsonProperty("createdDateTime")
    private OffsetDateTime createdDateTime;

    public static final String JSON_PROPERTY_PAYMENT_DATE = "paymentDate";
    @JsonProperty("paymentDate")
    private LocalDate paymentDate;

    public static final String JSON_PROPERTY_TYPE = "type";
    @JsonProperty("type")
    private String type;

    public static final String JSON_PROPERTY_PAYMENT_SCHEME = "paymentScheme";
    @JsonProperty("paymentScheme")
    private String paymentScheme;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    @JsonProperty("amount")
    private Amount amount;

    public static final String JSON_PROPERTY_REFERENCE = "reference";
    @JsonProperty("reference")
    private String reference;

    public static final String JSON_PROPERTY_STATUS = "status";
    @JsonProperty("status")
    private String status;

    public static final String JSON_PROPERTY_SOURCE = "source";
    @JsonProperty("source")
    private VirtualAccountPaymentSource source;

    public static final String JSON_PROPERTY_DESTINATION = "destination";
    @JsonProperty("destination")
    private VirtualAccountPaymentDestination destination;

    public static final String JSON_PROPERTY_ORIGINAL_PAYMENT_ID = "originalPaymentId";
    @JsonProperty("originalPaymentId")
    private String originalPaymentId;

}
