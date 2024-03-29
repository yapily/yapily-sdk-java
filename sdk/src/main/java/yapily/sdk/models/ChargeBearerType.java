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
 * __Optional__. Specifies which party/parties will bear the charges associated with the processing of the payment transaction. Valid values are:&lt;ul&gt;&lt;li&gt;&#x60;DEBT&#x60; - All transaction charges are to be borne by the debtor.&lt;/li&gt;&lt;li&gt;&#x60;CRED&#x60; - All transaction charges are to be borne by the creditor.&lt;/li&gt;&lt;li&gt;&#x60;SHAR&#x60; - In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor&lt;/li&gt;&lt;li&gt;&#x60;SLEV&#x60; - Charges are to be applied following the rules agreed in the service level and/or scheme.&lt;/li&gt;&lt;/ul&gt;
 */
public enum ChargeBearerType {
  
  DEBT("DEBT"),
  
  CRED("CRED"),
  
  SHAR("SHAR"),
  
  SLEV("SLEV");

  private String value;

  ChargeBearerType(String value) {
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
  public static ChargeBearerType fromValue(String value) {
    for (ChargeBearerType b : ChargeBearerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

