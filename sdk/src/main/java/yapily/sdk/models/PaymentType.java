/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.13.1
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
 * __Mandatory__. Used to specify which of the [payment types](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/intro-to-payment-execution/#payment-types) to execute.&lt;br&gt;&lt;br&gt;See [European Payments](https://docs.yapily.com/pages/knowledge/open-banking/european_payments/) to verify whether the &#x60;type&#x60; should be &#x60;DOMESTIC&#x60; or &#x60;INTERNATIONAL&#x60;.
 */
public enum PaymentType {
  
  DOMESTIC_PAYMENT("DOMESTIC_PAYMENT"),
  
  DOMESTIC_INSTANT_PAYMENT("DOMESTIC_INSTANT_PAYMENT"),
  
  DOMESTIC_VARIABLE_RECURRING_PAYMENT("DOMESTIC_VARIABLE_RECURRING_PAYMENT"),
  
  DOMESTIC_SCHEDULED_PAYMENT("DOMESTIC_SCHEDULED_PAYMENT"),
  
  DOMESTIC_PERIODIC_PAYMENT("DOMESTIC_PERIODIC_PAYMENT"),
  
  INTERNATIONAL_PAYMENT("INTERNATIONAL_PAYMENT"),
  
  INTERNATIONAL_SCHEDULED_PAYMENT("INTERNATIONAL_SCHEDULED_PAYMENT"),
  
  INTERNATIONAL_PERIODIC_PAYMENT("INTERNATIONAL_PERIODIC_PAYMENT"),
  
  BULK_PAYMENT("BULK_PAYMENT");

  private String value;

  PaymentType(String value) {
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
  public static PaymentType fromValue(String value) {
    for (PaymentType b : PaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

