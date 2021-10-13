/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.124.0
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
 * Contains links to the logo and the icons for the &#x60;Institution&#x60;
 */
@ApiModel(description = "Contains links to the logo and the icons for the `Institution`")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Media {
  @JsonProperty("source")
  private String source = null;

  @JsonProperty("type")
  private String type = null;

}

