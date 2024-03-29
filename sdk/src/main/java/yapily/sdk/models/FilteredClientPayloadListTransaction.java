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
import yapily.sdk.models.FilterAndSort;
import yapily.sdk.models.Transaction;

/**
* FilteredClientPayloadListTransaction
*/
    @JsonPropertyOrder({
        FilteredClientPayloadListTransaction.JSON_PROPERTY_API_CALL,
        FilteredClientPayloadListTransaction.JSON_PROPERTY_DATA,
        FilteredClientPayloadListTransaction.JSON_PROPERTY_NEXT_CURSOR_HASH,
        FilteredClientPayloadListTransaction.JSON_PROPERTY_NEXT_LINK,
        FilteredClientPayloadListTransaction.JSON_PROPERTY_PAGING_MAP,
        FilteredClientPayloadListTransaction.JSON_PROPERTY_TOTAL_COUNT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
@lombok.Builder(toBuilder=true) 
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class FilteredClientPayloadListTransaction {
    public static final String JSON_PROPERTY_API_CALL = "apiCall";
    @JsonProperty("apiCall")
    private Object apiCall;

    public static final String JSON_PROPERTY_DATA = "data";
    @JsonProperty("data")
    @lombok.Singular("data") private List<Transaction> data;

    public static final String JSON_PROPERTY_NEXT_CURSOR_HASH = "nextCursorHash";
    @JsonProperty("nextCursorHash")
    private String nextCursorHash;

    public static final String JSON_PROPERTY_NEXT_LINK = "nextLink";
    @JsonProperty("nextLink")
    private String nextLink;

    public static final String JSON_PROPERTY_PAGING_MAP = "pagingMap";
    @JsonProperty("pagingMap")
    @lombok.Singular("pagingMap") private Map<String, FilterAndSort> pagingMap;

    public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
    @JsonProperty("totalCount")
    private Long totalCount;

}
