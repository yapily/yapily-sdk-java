/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.314
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

/**
 * Core feature of the PCA product which can be associated to a particular Marketing State
 */
@ApiModel(description = "Core feature of the PCA product which can be associated to a particular Marketing State")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoreProduct {
  @JsonProperty("MonthlyMaximumCharge")
  private String monthlyMaximumCharge = null;

  @JsonProperty("ProductDescription")
  private String productDescription = null;

  @JsonProperty("ProductURL")
  private String productURL = null;

  /**
   * Gets or Sets salesAccessChannels
   */
  public enum SalesAccessChannelsEnum {
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    ONLINE("Online"),
    
    RELATIONSHIPMANAGER("RelationshipManager");

    private String value;

    SalesAccessChannelsEnum(String value) {
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
    public static SalesAccessChannelsEnum fromValue(String text) {
      for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("SalesAccessChannels")
  private List<SalesAccessChannelsEnum> salesAccessChannels = null;

  /**
   * Gets or Sets servicingAccessChannels
   */
  public enum ServicingAccessChannelsEnum {
    ATM("ATM"),
    
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    MOBILEBANKINGAPP("MobileBankingApp"),
    
    ONLINE("Online"),
    
    POSTOFFICE("PostOffice"),
    
    RELATIONSHIPMANAGER("RelationshipManager"),
    
    TEXT("Text");

    private String value;

    ServicingAccessChannelsEnum(String value) {
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
    public static ServicingAccessChannelsEnum fromValue(String text) {
      for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ServicingAccessChannels")
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = null;

  @JsonProperty("TcsAndCsURL")
  private String tcsAndCsURL = null;

}

