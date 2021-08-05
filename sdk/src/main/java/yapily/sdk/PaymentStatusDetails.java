/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.396
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
import yapily.sdk.MultiAuthorisation;
import yapily.sdk.PaymentIsoStatus;

/**
 * PaymentStatusDetails
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentStatusDetails {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    FAILED("FAILED"),
    
    DECLINED("DECLINED"),
    
    COMPLETED("COMPLETED"),
    
    COMPLETED_SETTLEMENT_IN_PROCESS("COMPLETED_SETTLEMENT_IN_PROCESS"),
    
    EXPIRED("EXPIRED"),
    
    UNKNOWN("UNKNOWN"),
    
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("statusReason")
  private String statusReason = null;

  @JsonProperty("statusReasonDescription")
  private String statusReasonDescription = null;

  @JsonProperty("statusUpdateDate")
  private OffsetDateTime statusUpdateDate = null;

  @JsonProperty("multiAuthorisationStatus")
  private MultiAuthorisation multiAuthorisationStatus = null;

  @JsonProperty("isoStatus")
  private PaymentIsoStatus isoStatus = null;

}

