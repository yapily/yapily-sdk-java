package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiListResponseOfCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-24T19:41:22.601Z")
public class CategoriesApi {
  private ApiClient apiClient;

  public CategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CategoriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieves a list of categories returned by the Yapily Categorisation engine for a given locale
   * 
   * @param country __Mandatory__. The 2 letter country code e.g. &#39;GB&#39;. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return ApiListResponseOfCategory
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfCategory getCategoriesUsingGET(String country, String xYapilyApiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'country' is set
    if (country == null) {
      throw new ApiException(400, "Missing the required parameter 'country' when calling getCategoriesUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/categories/{country}"
      .replaceAll("\\{" + "country" + "\\}", apiClient.escapeString(country.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfCategory> localVarReturnType = new GenericType<ApiListResponseOfCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
