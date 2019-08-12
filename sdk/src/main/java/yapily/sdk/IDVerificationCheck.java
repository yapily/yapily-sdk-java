/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.132
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
import java.util.List;

/**
 * Identity verification criteria that the account holder will need to meet to take out the PCA product
 */
@ApiModel(description = "Identity verification criteria that the account holder will need to meet to take out the PCA product")
@Data
public class IDVerificationCheck {
  @JsonProperty("Notes")
  private List<String> notes = null;

  @JsonProperty("URL")
  private String URL = null;

}

