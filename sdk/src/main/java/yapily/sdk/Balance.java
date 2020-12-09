/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.288
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
import yapily.sdk.Amount;

/**
 * Balance
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CLOSING_AVAILABLE("CLOSING_AVAILABLE"),
    
    CLOSING_BOOKED("CLOSING_BOOKED"),
    
    CLOSING_CLEARED("CLOSING_CLEARED"),
    
    EXPECTED("EXPECTED"),
    
    FORWARD_AVAILABLE("FORWARD_AVAILABLE"),
    
    INFORMATION("INFORMATION"),
    
    INTERIM_AVAILABLE("INTERIM_AVAILABLE"),
    
    INTERIM_BOOKED("INTERIM_BOOKED"),
    
    INTERIM_CLEARED("INTERIM_CLEARED"),
    
    OPENING_AVAILABLE("OPENING_AVAILABLE"),
    
    OPENING_BOOKED("OPENING_BOOKED"),
    
    OPENING_CLEARED("OPENING_CLEARED"),
    
    PREVIOUSLY_CLOSED_BOOKED("PREVIOUSLY_CLOSED_BOOKED"),
    
    AUTHORISED("AUTHORISED"),
    
    OTHER("OTHER"),
    
    UNKNOWN("UNKNOWN");

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

  @JsonProperty("balanceAmount")
  private Amount balanceAmount = null;

}

