/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.76
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
import yapily.sdk.TemporalUnit;

/**
 * Duration
 */
@Data
public class Duration {
  @JsonProperty("nano")
  private Integer nano = null;

  @JsonProperty("negative")
  private Boolean negative = null;

  @JsonProperty("seconds")
  private Long seconds = null;

  @JsonProperty("units")
  private List<TemporalUnit> units = null;

  @JsonProperty("zero")
  private Boolean zero = null;

}

