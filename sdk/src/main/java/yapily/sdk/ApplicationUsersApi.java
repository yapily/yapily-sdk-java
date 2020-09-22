package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiListResponseOfBulkUserDelete;
import yapily.sdk.ApiResponseOfBulkUserDeleteDetails;
import yapily.sdk.ApiResponseOfUserDeleteResponse;
import yapily.sdk.ApplicationUser;
import yapily.sdk.NewApplicationUser;
import yapily.sdk.UserDeleteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T15:12:53.448Z")
public class ApplicationUsersApi {
  private ApiClient apiClient;

  public ApplicationUsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationUsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add an application user
   * 
   * @param newApplicationUser newApplicationUser (required)
   * @return ApplicationUser
   * @throws ApiException if fails to make API call
   */
  public ApplicationUser addUserUsingPOST(NewApplicationUser newApplicationUser) throws ApiException {
    Object localVarPostBody = newApplicationUser;
    
    // verify the required parameter 'newApplicationUser' is set
    if (newApplicationUser == null) {
      throw new ApiException(400, "Missing the required parameter 'newApplicationUser' when calling addUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApplicationUser> localVarReturnType = new GenericType<ApplicationUser>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an application user and sub-resources (including consent resources on institution APIs if they exist)
   * 
   * @param userUuid userUuid (required)
   * @return ApiResponseOfUserDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfUserDeleteResponse deleteUserUsingDELETE(String userUuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling deleteUserUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfUserDeleteResponse> localVarReturnType = new GenericType<ApiResponseOfUserDeleteResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get details of a user deletion job
   * 
   * @param jobId job-id (required)
   * @return ApiResponseOfBulkUserDeleteDetails
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfBulkUserDeleteDetails getDeleteUsersJobUsingGET(String jobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getDeleteUsersJobUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/delete-users/{job-id}"
      .replaceAll("\\{" + "job-id" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfBulkUserDeleteDetails> localVarReturnType = new GenericType<ApiResponseOfBulkUserDeleteDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get details of all user deletion jobs
   * 
   * @return ApiListResponseOfBulkUserDelete
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfBulkUserDelete getDeleteUsersJobsUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/delete-users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfBulkUserDelete> localVarReturnType = new GenericType<ApiListResponseOfBulkUserDelete>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an application user
   * 
   * @param userUuid userUuid (required)
   * @return ApplicationUser
   * @throws ApiException if fails to make API call
   */
  public ApplicationUser getUserUsingGET(String userUuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling getUserUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApplicationUser> localVarReturnType = new GenericType<ApplicationUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get application users
   * 
   * @param filterApplicationUserId Filter users by the provided application user Id (applicationUserId) when the user was created. (optional)
   * @return List&lt;ApplicationUser&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ApplicationUser> getUsersUsingGET(List<String> filterApplicationUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[applicationUserId]", filterApplicationUserId));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<List<ApplicationUser>> localVarReturnType = new GenericType<List<ApplicationUser>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Start a job to delete application users by specifying their identifiers
   * 
   * @param userDeleteRequest userDeleteRequest (required)
   * @return ApiResponseOfBulkUserDeleteDetails
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfBulkUserDeleteDetails startDeleteUsersJobUsingPOST(UserDeleteRequest userDeleteRequest) throws ApiException {
    Object localVarPostBody = userDeleteRequest;
    
    // verify the required parameter 'userDeleteRequest' is set
    if (userDeleteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userDeleteRequest' when calling startDeleteUsersJobUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/delete-users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfBulkUserDeleteDetails> localVarReturnType = new GenericType<ApiResponseOfBulkUserDeleteDetails>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
