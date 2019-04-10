/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.101
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yapily.sdk.Country;
import yapily.sdk.Media;
import yapily.sdk.MonitoringFeatureStatus;

/**
 * Institution
 */
@Data
public class Institution {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("countries")
  private List<Country> countries = null;

  /**
   * Gets or Sets environmentType
   */
  public enum EnvironmentTypeEnum {
    SANDBOX("SANDBOX"),
    
    MOCK("MOCK"),
    
    LIVE("LIVE");

    private String value;

    EnvironmentTypeEnum(String value) {
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
    public static EnvironmentTypeEnum fromValue(String text) {
      for (EnvironmentTypeEnum b : EnvironmentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("environmentType")
  private EnvironmentTypeEnum environmentType = null;

  /**
   * Gets or Sets credentialsType
   */
  public enum CredentialsTypeEnum {
    OAUTH1("OAUTH1"),
    
    OAUTH2("OAUTH2"),
    
    OAUTH2_NOSECRET("OAUTH2_NOSECRET"),
    
    OPEN_BANKING("OPEN_BANKING"),
    
    OPEN_BANKING_SANDBOX("OPEN_BANKING_SANDBOX"),
    
    OPEN_BANKING_IBM("OPEN_BANKING_IBM"),
    
    OPEN_BANKING_KEY_SECRET_SANDBOX("OPEN_BANKING_KEY_SECRET_SANDBOX"),
    
    API_KEY("API_KEY");

    private String value;

    CredentialsTypeEnum(String value) {
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
    public static CredentialsTypeEnum fromValue(String text) {
      for (CredentialsTypeEnum b : CredentialsTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("credentialsType")
  private CredentialsTypeEnum credentialsType = null;

  @JsonProperty("media")
  private List<Media> media = null;

  /**
   * Gets or Sets features
   */
  public enum FeaturesEnum {
    INITIATE_ACCOUNT_REQUEST("INITIATE_ACCOUNT_REQUEST"),
    
    ACCOUNT_REQUEST_DETAILS("ACCOUNT_REQUEST_DETAILS"),
    
    ACCOUNTS("ACCOUNTS"),
    
    ACCOUNT("ACCOUNT"),
    
    ACCOUNT_TRANSACTIONS("ACCOUNT_TRANSACTIONS"),
    
    ACCOUNT_TRANSACTIONS_WITH_MERCHANT("ACCOUNT_TRANSACTIONS_WITH_MERCHANT"),
    
    IDENTITY("IDENTITY"),
    
    INITIATE_SINGLE_PAYMENT_SORTCODE("INITIATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENT_INITIATION_DETAILS("EXISTING_PAYMENT_INITIATION_DETAILS"),
    
    CREATE_SINGLE_PAYMENT_SORTCODE("CREATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENTS_DETAILS("EXISTING_PAYMENTS_DETAILS"),
    
    TRANSFER("TRANSFER"),
    
    OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS("OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS"),
    
    OPEN_DATA_ATMS("OPEN_DATA_ATMS");

    private String value;

    FeaturesEnum(String value) {
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
    public static FeaturesEnum fromValue(String text) {
      for (FeaturesEnum b : FeaturesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("features")
  private List<FeaturesEnum> features = null;

  @JsonProperty("monitoring")
  private Map<String, MonitoringFeatureStatus> monitoring = null;

}

