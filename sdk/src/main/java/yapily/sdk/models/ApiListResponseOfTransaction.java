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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yapily.sdk.models.FilteredClientPayloadListTransaction;
import yapily.sdk.models.RawResponse;
import yapily.sdk.models.ResponseForwardedData;
import yapily.sdk.models.ResponseListMeta;
import yapily.sdk.models.Transaction;

/**
* ApiListResponseOfTransaction
*/
    @JsonPropertyOrder({
        ApiListResponseOfTransaction.JSON_PROPERTY_META,
        ApiListResponseOfTransaction.JSON_PROPERTY_DATA,
        ApiListResponseOfTransaction.JSON_PROPERTY_LINKS,
        ApiListResponseOfTransaction.JSON_PROPERTY_FORWARDED_DATA,
        ApiListResponseOfTransaction.JSON_PROPERTY_RAW,
        ApiListResponseOfTransaction.JSON_PROPERTY_PAGING,
        ApiListResponseOfTransaction.JSON_PROPERTY_TRACING_ID
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class ApiListResponseOfTransaction {
    public static final String JSON_PROPERTY_META = "meta";
    @JsonProperty("meta")
    private ResponseListMeta meta;

    public static final String JSON_PROPERTY_DATA = "data";
    @JsonProperty("data")
    @lombok.Singular("data") private List<Transaction> data;

    public static final String JSON_PROPERTY_LINKS = "links";
    @JsonProperty("links")
    @lombok.Singular("links") private Map<String, String> links;

    public static final String JSON_PROPERTY_FORWARDED_DATA = "forwardedData";
    @JsonProperty("forwardedData")
    @lombok.Singular("forwardedData") private List<ResponseForwardedData> forwardedData;

    public static final String JSON_PROPERTY_RAW = "raw";
    @JsonProperty("raw")
    @lombok.Singular("raw") private List<RawResponse> raw;

    public static final String JSON_PROPERTY_PAGING = "paging";
    @JsonProperty("paging")
    private FilteredClientPayloadListTransaction paging;

    public static final String JSON_PROPERTY_TRACING_ID = "tracingId";
    @JsonProperty("tracingId")
    private String tracingId;

}
