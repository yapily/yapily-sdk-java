/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.92
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.OverdraftOverdraftTierBandSet;

/**
 * Borrowing details
 */
@ApiModel(description = "Borrowing details")
@Data
public class Overdraft {
  @JsonProperty("Notes")
  private String notes = null;

  @JsonProperty("OverdraftTierBandSet")
  private List<OverdraftOverdraftTierBandSet> overdraftTierBandSet = null;

  @JsonProperty("TcsAndCsURL")
  private String tcsAndCsURL = null;

}

