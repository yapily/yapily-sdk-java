/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.365
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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.ScaMethod;

/**
 * AuthorisationEmbeddedRequestResponse
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorisationEmbeddedRequestResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("userUuid")
  private String userUuid = null;

  @JsonProperty("applicationUserId")
  private String applicationUserId = null;

  @JsonProperty("referenceId")
  private String referenceId = null;

  @JsonProperty("institutionId")
  private String institutionId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AWAITING_AUTHORIZATION("AWAITING_AUTHORIZATION"),
    
    AWAITING_FURTHER_AUTHORIZATION("AWAITING_FURTHER_AUTHORIZATION"),
    
    AWAITING_RE_AUTHORIZATION("AWAITING_RE_AUTHORIZATION"),
    
    AUTHORIZED("AUTHORIZED"),
    
    CONSUMED("CONSUMED"),
    
    REJECTED("REJECTED"),
    
    REVOKED("REVOKED"),
    
    FAILED("FAILED"),
    
    EXPIRED("EXPIRED"),
    
    UNKNOWN("UNKNOWN"),
    
    INVALID("INVALID"),
    
    AWAITING_PRE_AUTHORIZATION("AWAITING_PRE_AUTHORIZATION"),
    
    PRE_AUTHORIZED("PRE_AUTHORIZED"),
    
    AWAITING_DECOUPLED_AUTHORIZATION("AWAITING_DECOUPLED_AUTHORIZATION"),
    
    AWAITING_SCA_METHOD("AWAITING_SCA_METHOD"),
    
    AWAITING_SCA_CODE("AWAITING_SCA_CODE");

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

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("transactionFrom")
  private OffsetDateTime transactionFrom = null;

  @JsonProperty("transactionTo")
  private OffsetDateTime transactionTo = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("timeToExpireInMillis")
  private Long timeToExpireInMillis = null;

  @JsonProperty("timeToExpire")
  private String timeToExpire = null;

  /**
   * Gets or Sets featureScope
   */
  public enum FeatureScopeEnum {
    INITIATE_PRE_AUTHORISATION("INITIATE_PRE_AUTHORISATION"),
    
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
    
    INITIATE_SINGLE_PAYMENT_SORTCODE("INITIATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENT_INITIATION_DETAILS("EXISTING_PAYMENT_INITIATION_DETAILS"),
    
    CREATE_SINGLE_PAYMENT_SORTCODE("CREATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENTS_DETAILS("EXISTING_PAYMENTS_DETAILS"),
    
    INITIATE_DOMESTIC_SINGLE_PAYMENT("INITIATE_DOMESTIC_SINGLE_PAYMENT"),
    
    INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT("INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT"),
    
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
    
    READ_INTERNATIONAL_SCHEDULED_REFUND("READ_INTERNATIONAL_SCHEDULED_REFUND"),
    
    ACCOUNT_BENEFICIARIES("ACCOUNT_BENEFICIARIES");

    private String value;

    FeatureScopeEnum(String value) {
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
    public static FeatureScopeEnum fromValue(String text) {
      for (FeatureScopeEnum b : FeatureScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("featureScope")
  private List<FeatureScopeEnum> featureScope = null;

  @JsonProperty("authorisationUrl")
  private String authorisationUrl = null;

  @JsonProperty("consentToken")
  private String consentToken = null;

  @JsonProperty("qrCodeUrl")
  private String qrCodeUrl = null;

  @JsonProperty("scaMethods")
  private List<ScaMethod> scaMethods = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("selectedScaMethod")
  private ScaMethod selectedScaMethod = null;

  @JsonProperty("authorizedAt")
  private OffsetDateTime authorizedAt = null;

  @JsonProperty("institutionConsentId")
  private String institutionConsentId = null;

}

