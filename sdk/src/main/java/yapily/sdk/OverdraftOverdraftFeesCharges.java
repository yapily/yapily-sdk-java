/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.159.0
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
import yapily.sdk.OverdraftOverdraftFeeChargeCap;
import yapily.sdk.OverdraftOverdraftFeeChargeDetail;

/**
 * Overdraft fees and charges
 */
@ApiModel(description = "Overdraft fees and charges")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OverdraftOverdraftFeesCharges {
  @JsonProperty("OverdraftFeeChargeCap")
  private List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  private List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = null;

}

