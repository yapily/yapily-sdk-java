/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package yapily.sdk.models;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of account e.g. (Credit Card, Savings).
 */
public enum AccountType {
  
  CASH_TRADING("CASH_TRADING"),
  
  CASH_INCOME("CASH_INCOME"),
  
  CASH_PAYMENT("CASH_PAYMENT"),
  
  CHARGE_CARD("CHARGE_CARD"),
  
  CHARGES("CHARGES"),
  
  COMMISSION("COMMISSION"),
  
  CREDIT_CARD("CREDIT_CARD"),
  
  CURRENT("CURRENT"),
  
  E_MONEY("E_MONEY"),
  
  LIMITED_LIQUIDITY_SAVINGS_ACCOUNT("LIMITED_LIQUIDITY_SAVINGS_ACCOUNT"),
  
  LOAN("LOAN"),
  
  MARGINAL_LENDING("MARGINAL_LENDING"),
  
  MONEY_MARKET("MONEY_MARKET"),
  
  MORTGAGE("MORTGAGE"),
  
  NON_RESIDENT_EXTERNAL("NON_RESIDENT_EXTERNAL"),
  
  OTHER("OTHER"),
  
  OVERDRAFT("OVERDRAFT"),
  
  OVERNIGHT_DEPOSIT("OVERNIGHT_DEPOSIT"),
  
  PREPAID_CARD("PREPAID_CARD"),
  
  SALARY("SALARY"),
  
  SAVINGS("SAVINGS"),
  
  SETTLEMENT("SETTLEMENT"),
  
  TAX("TAX"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountType(String value) {
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
  public static AccountType fromValue(String value) {
    for (AccountType b : AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

