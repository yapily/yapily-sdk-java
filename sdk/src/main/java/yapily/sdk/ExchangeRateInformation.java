/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.142.0
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
import java.math.BigDecimal;

/**
 * ExchangeRateInformation
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRateInformation {
  @JsonProperty("foreignExchangeContractReference")
  private String foreignExchangeContractReference = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  /**
   * Gets or Sets rateType
   */
  public enum RateTypeEnum {
    ACTUAL("ACTUAL"),
    
    AGREED("AGREED"),
    
    INDICATIVE("INDICATIVE");

    private String value;

    RateTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RateTypeEnum fromValue(String text) {
      for (RateTypeEnum b : RateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rateType")
  private RateTypeEnum rateType = null;

  @JsonProperty("unitCurrency")
  private String unitCurrency = null;

}

