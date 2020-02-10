/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.167
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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.AgeEligibility;
import yapily.sdk.CreditCheck;
import yapily.sdk.EligibilityOtherEligibility;
import yapily.sdk.IDVerificationCheck;
import yapily.sdk.ResidencyEligibility;

/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.
 */
@ApiModel(description = "Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Eligibility {
  @JsonProperty("AgeEligibility")
  private AgeEligibility ageEligibility = null;

  @JsonProperty("CreditCheck")
  private CreditCheck creditCheck = null;

  @JsonProperty("IDVerificationCheck")
  private IDVerificationCheck idVerificationCheck = null;

  @JsonProperty("OtherEligibility")
  private List<EligibilityOtherEligibility> otherEligibility = null;

  @JsonProperty("ResidencyEligibility")
  private ResidencyEligibility residencyEligibility = null;

}

