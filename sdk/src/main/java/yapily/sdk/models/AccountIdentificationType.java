/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.2.0
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
 * __Mandatory__. Used to describe the format of the account.&lt;br&gt;&lt;br&gt; See [Account Identification Combinations](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/intro-to-payment-execution/#account-identifications-combinations) for more information on when to specify each type.
 */
public enum AccountIdentificationType {
  
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

  AccountIdentificationType(String value) {
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
  public static AccountIdentificationType fromValue(String value) {
    for (AccountIdentificationType b : AccountIdentificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

