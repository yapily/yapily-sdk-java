/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.50
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
import yapily.sdk.ATMGeoLocation;

/**
 * Information that locates and identifies a specific address, as defined by postal services or in free format text.
 */
@ApiModel(description = "Information that locates and identifies a specific address, as defined by postal services or in free format text.")
@Data
public class ATMPostalAddress {
  @JsonProperty("AddressLine")
  private List<String> addressLine = null;

  @JsonProperty("BuildingNumber")
  private String buildingNumber = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("CountrySubDivision")
  private List<String> countrySubDivision = null;

  @JsonProperty("GeoLocation")
  private ATMGeoLocation geoLocation = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("StreetName")
  private String streetName = null;

  @JsonProperty("TownName")
  private String townName = null;

}

