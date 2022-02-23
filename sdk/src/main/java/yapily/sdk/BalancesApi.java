package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfBalances;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-22T17:09:01.714Z")
public class BalancesApi {
  private ApiClient apiClient;

  public BalancesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BalancesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get account balances
   * 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfBalances
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfBalances getAccountBalancesUsingGET(String accountId, String xYapilyApiVersion, String consent, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountBalancesUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/balances"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfBalances> localVarReturnType = new GenericType<ApiResponseOfBalances>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
