/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.346
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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.CoreProduct;
import yapily.sdk.CreditInterest;
import yapily.sdk.Eligibility;
import yapily.sdk.Overdraft;

/**
 * PersonalCurrentAccountPCAMarketingState
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalCurrentAccountPCAMarketingState {
  @JsonProperty("CoreProduct")
  private CoreProduct coreProduct = null;

  @JsonProperty("CreditInterest")
  private CreditInterest creditInterest = null;

  @JsonProperty("Eligibility")
  private Eligibility eligibility = null;

  @JsonProperty("FirstMarketedDate")
  private OffsetDateTime firstMarketedDate = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("LastMarketedDate")
  private OffsetDateTime lastMarketedDate = null;

  @JsonProperty("MarketingState")
  private String marketingState = null;

  @JsonProperty("Notes")
  private List<String> notes = null;

  @JsonProperty("Overdraft")
  private Overdraft overdraft = null;

  @JsonProperty("PredecessorID")
  private String predecessorID = null;

  @JsonProperty("StateTenureLength")
  private Float stateTenureLength = null;

  @JsonProperty("StateTenurePeriod")
  private String stateTenurePeriod = null;

}

