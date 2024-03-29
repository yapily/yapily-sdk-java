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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Institution {
  @JsonProperty("countries")
  private List<Country> countries = null;

  /**
   * Gets or Sets credentialsType
   */
  public enum CredentialsTypeEnum {
    OAUTH1("OAUTH1"),
    
    OAUTH2("OAUTH2"),
    
    OAUTH2_NOSECRET("OAUTH2_NOSECRET"),
    
    OAUTH2_SIGNATURE("OAUTH2_SIGNATURE"),
    
    OPEN_BANKING("OPEN_BANKING"),
    
    OPEN_BANKING_UK_MANUAL("OPEN_BANKING_UK_MANUAL"),
    
    OPEN_BANKING_UK_AUTO("OPEN_BANKING_UK_AUTO"),
    
    OPEN_BANKING_IBM("OPEN_BANKING_IBM"),
    
    OPEN_BANKING_AUTO("OPEN_BANKING_AUTO"),
    
    OPEN_BANKING_AUTO_EMAIL("OPEN_BANKING_AUTO_EMAIL"),
    
    OPEN_BANKING_MANUAL("OPEN_BANKING_MANUAL"),
    
    OPEN_BANKING_WITH_TPP_ID_AND_SECRET("OPEN_BANKING_WITH_TPP_ID_AND_SECRET"),
    
    API_KEY("API_KEY"),
    
    OPEN_BANKING_NO_KEY("OPEN_BANKING_NO_KEY"),
    
    OPEN_BANKING_NO_TRANSPORT("OPEN_BANKING_NO_TRANSPORT"),
    
    TOKEN_IO("TOKEN_IO");

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
   * Gets or Sets features
   */
  public enum FeaturesEnum {
    INITIATE_PRE_AUTHORISATION("INITIATE_PRE_AUTHORISATION"),
    
    INITIATE_PRE_AUTHORISATION_ACCOUNTS("INITIATE_PRE_AUTHORISATION_ACCOUNTS"),
    
    INITIATE_PRE_AUTHORISATION_PAYMENTS("INITIATE_PRE_AUTHORISATION_PAYMENTS"),
    
    INITIATE_ACCOUNT_REQUEST("INITIATE_ACCOUNT_REQUEST"),
    
    INITIATE_EMBEDDED_ACCOUNT_REQUEST("INITIATE_EMBEDDED_ACCOUNT_REQUEST"),
    
    ACCOUNT_REQUEST_DETAILS("ACCOUNT_REQUEST_DETAILS"),
    
    ACCOUNTS("ACCOUNTS"),
    
    ACCOUNT("ACCOUNT"),
    
    ACCOUNT_TRANSACTIONS("ACCOUNT_TRANSACTIONS"),
    
    ACCOUNT_STATEMENTS("ACCOUNT_STATEMENTS"),
    
    ACCOUNT_STATEMENT("ACCOUNT_STATEMENT"),
    
    ACCOUNT_STATEMENT_FILE("ACCOUNT_STATEMENT_FILE"),
    
    ACCOUNT_SCHEDULED_PAYMENTS("ACCOUNT_SCHEDULED_PAYMENTS"),
    
    ACCOUNT_DIRECT_DEBITS("ACCOUNT_DIRECT_DEBITS"),
    
    ACCOUNT_PERIODIC_PAYMENTS("ACCOUNT_PERIODIC_PAYMENTS"),
    
    ACCOUNT_TRANSACTIONS_WITH_MERCHANT("ACCOUNT_TRANSACTIONS_WITH_MERCHANT"),
    
    IDENTITY("IDENTITY"),
    
    ACCOUNTS_WITHOUT_BALANCE("ACCOUNTS_WITHOUT_BALANCE"),
    
    ACCOUNT_WITHOUT_BALANCE("ACCOUNT_WITHOUT_BALANCE"),
    
    ACCOUNT_BALANCES("ACCOUNT_BALANCES"),
    
    ACCOUNT_BENEFICIARIES("ACCOUNT_BENEFICIARIES"),
    
    INITIATE_SINGLE_PAYMENT_SORTCODE("INITIATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENT_INITIATION_DETAILS("EXISTING_PAYMENT_INITIATION_DETAILS"),
    
    CREATE_SINGLE_PAYMENT_SORTCODE("CREATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENTS_DETAILS("EXISTING_PAYMENTS_DETAILS"),
    
    INITIATE_DOMESTIC_SINGLE_PAYMENT("INITIATE_DOMESTIC_SINGLE_PAYMENT"),
    
    INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT("INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT"),
    
    INITIATE_EMBEDDED_BULK_PAYMENT("INITIATE_EMBEDDED_BULK_PAYMENT"),
    
    CREATE_DOMESTIC_SINGLE_PAYMENT("CREATE_DOMESTIC_SINGLE_PAYMENT"),
    
    INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT("INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT"),
    
    CREATE_DOMESTIC_SINGLE_INSTANT_PAYMENT("CREATE_DOMESTIC_SINGLE_INSTANT_PAYMENT"),
    
    INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT("INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT"),
    
    CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT("CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT"),
    
    INITIATE_DOMESTIC_SCHEDULED_PAYMENT("INITIATE_DOMESTIC_SCHEDULED_PAYMENT"),
    
    CREATE_DOMESTIC_SCHEDULED_PAYMENT("CREATE_DOMESTIC_SCHEDULED_PAYMENT"),
    
    INITIATE_DOMESTIC_PERIODIC_PAYMENT("INITIATE_DOMESTIC_PERIODIC_PAYMENT"),
    
    CREATE_DOMESTIC_PERIODIC_PAYMENT("CREATE_DOMESTIC_PERIODIC_PAYMENT"),
    
    PERIODIC_PAYMENT_FREQUENCY_EXTENDED("PERIODIC_PAYMENT_FREQUENCY_EXTENDED"),
    
    INITIATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT("INITIATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT"),
    
    CREATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT("CREATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT"),
    
    INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT("INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT"),
    
    CREATE_INTERNATIONAL_SCHEDULED_PAYMENT("CREATE_INTERNATIONAL_SCHEDULED_PAYMENT"),
    
    INITIATE_INTERNATIONAL_PERIODIC_PAYMENT("INITIATE_INTERNATIONAL_PERIODIC_PAYMENT"),
    
    CREATE_INTERNATIONAL_PERIODIC_PAYMENT("CREATE_INTERNATIONAL_PERIODIC_PAYMENT"),
    
    INITIATE_INTERNATIONAL_SINGLE_PAYMENT("INITIATE_INTERNATIONAL_SINGLE_PAYMENT"),
    
    CREATE_INTERNATIONAL_SINGLE_PAYMENT("CREATE_INTERNATIONAL_SINGLE_PAYMENT"),
    
    INITIATE_BULK_PAYMENT("INITIATE_BULK_PAYMENT"),
    
    CREATE_BULK_PAYMENT("CREATE_BULK_PAYMENT"),
    
    TRANSFER("TRANSFER"),
    
    OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS("OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS"),
    
    OPEN_DATA_ATMS("OPEN_DATA_ATMS"),
    
    READ_DOMESTIC_SINGLE_REFUND("READ_DOMESTIC_SINGLE_REFUND"),
    
    READ_DOMESTIC_SCHEDULED_REFUND("READ_DOMESTIC_SCHEDULED_REFUND"),
    
    READ_DOMESTIC_PERIODIC_PAYMENT_REFUND("READ_DOMESTIC_PERIODIC_PAYMENT_REFUND"),
    
    READ_INTERNATIONAL_SINGLE_REFUND("READ_INTERNATIONAL_SINGLE_REFUND"),
    
    READ_INTERNATIONAL_SCHEDULED_REFUND("READ_INTERNATIONAL_SCHEDULED_REFUND");

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

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("media")
  private List<Media> media = null;

  @JsonProperty("monitoring")
  private Map<String, MonitoringFeatureStatus> monitoring = null;

  @JsonProperty("name")
  private String name = null;

}

