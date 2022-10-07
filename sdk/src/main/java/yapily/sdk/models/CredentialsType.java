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
 * The type of credentials required to register the &#x60;Institution&#x60;
 */
public enum CredentialsType {
  
  OAUTH1("OAUTH1"),
  
  OAUTH2("OAUTH2"),
  
  OAUTH2_NOSECRET("OAUTH2_NOSECRET"),
  
  OAUTH2_SIGNATURE("OAUTH2_SIGNATURE"),
  
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

  CredentialsType(String value) {
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
  public static CredentialsType fromValue(String value) {
    for (CredentialsType b : CredentialsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

