/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.97
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
import java.math.BigDecimal;

/**
 * Account
 */
@Data
public class Account {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("currency")
  private String currency = null;

}

