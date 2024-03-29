/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.157.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import yapily.sdk.Categorisation;
import yapily.sdk.EnrichmentMerchant;
import yapily.sdk.TransactionHash;

/**
 * Enrichment
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Enrichment {
  @JsonProperty("categorisation")
  private Categorisation categorisation = null;

  @JsonProperty("transactionHash")
  private TransactionHash transactionHash = null;

  @JsonProperty("cleansedDescription")
  private String cleansedDescription = null;

  @JsonProperty("merchant")
  private EnrichmentMerchant merchant = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("paymentProcessor")
  private String paymentProcessor = null;

  @JsonProperty("correctedDate")
  private OffsetDateTime correctedDate = null;

}

