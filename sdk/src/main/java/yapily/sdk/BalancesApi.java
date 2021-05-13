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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:49:45.788Z")
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
   * @param accountId Account Id (required)
   * @param xYapilyApiVersion Api Version (optional)
   * @param consent Consent Token (optional)
   * @param psuId PSU ID (optional)
   * @param psuCorporateId PSU ID CORPORATE (optional)
   * @param psuIpAddress PSU IP ADDRESS (optional)
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
      .replaceAll("\\{" + "account-id" + "\\}", apiClient.escapeString(accountId.toString()));

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
