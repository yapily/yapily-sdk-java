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

/**
 * RegistrationResult
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationResult {
  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("institutionId")
  private String institutionId = null;

  @JsonProperty("tppId")
  private String tppId = null;

  @JsonProperty("softwareId")
  private String softwareId = null;

  @JsonProperty("clientName")
  private String clientName = null;

  @JsonProperty("signingKeyId")
  private String signingKeyId = null;

  @JsonProperty("signingCertificateId")
  private String signingCertificateId = null;

  @JsonProperty("transportKeyId")
  private String transportKeyId = null;

  @JsonProperty("transportCertificateId")
  private String transportCertificateId = null;

  @JsonProperty("clientUri")
  private String clientUri = null;

  @JsonProperty("termsOfServiceUri")
  private String termsOfServiceUri = null;

  @JsonProperty("ssaJwt")
  private String ssaJwt = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("signingKeyStore")
  private String signingKeyStore = null;

  @JsonProperty("transportKeyStore")
  private String transportKeyStore = null;

  @JsonProperty("registrationResponse")
  private String registrationResponse = null;

}

