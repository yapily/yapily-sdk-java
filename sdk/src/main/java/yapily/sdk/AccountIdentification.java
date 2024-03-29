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

/**
 * AccountIdentification
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountIdentification {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SORT_CODE("SORT_CODE"),
    
    ACCOUNT_NUMBER("ACCOUNT_NUMBER"),
    
    IBAN("IBAN"),
    
    BBAN("BBAN"),
    
    BIC("BIC"),
    
    PAN("PAN"),
    
    MASKED_PAN("MASKED_PAN"),
    
    MSISDN("MSISDN"),
    
    BSB("BSB"),
    
    NCC("NCC"),
    
    ABA("ABA"),
    
    ABA_WIRE("ABA_WIRE"),
    
    ABA_ACH("ABA_ACH"),
    
    EMAIL("EMAIL"),
    
    ROLL_NUMBER("ROLL_NUMBER");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("identification")
  private String identification = null;

}

