package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiListResponseOfEventSubscriptionResponse;
import yapily.sdk.models.ApiResponseOfEventSubscriptionDeleteResponse;
import yapily.sdk.models.ApiResponseOfEventSubscriptionResponse;
import yapily.sdk.models.EventSubscriptionRequest;
import yapily.sdk.models.EventTypesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-06T10:23:44.837Z[Etc/UTC]")
public class NotificationsApi {
  private ApiClient apiClient;

  public NotificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * post event subscription
   * create a event subscription
   * @param eventSubscriptionRequest  (required)
   * @return ApiResponseOfEventSubscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Event subscription created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request for missing required properties </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Event subscription already exist for the application </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfEventSubscriptionResponse createEventSubscription(EventSubscriptionRequest eventSubscriptionRequest) throws ApiException {
    return createEventSubscriptionWithHttpInfo(eventSubscriptionRequest).getData();
  }

  /**
   * post event subscription
   * create a event subscription
   * @param eventSubscriptionRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfEventSubscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Event subscription created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request for missing required properties </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Event subscription already exist for the application </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfEventSubscriptionResponse> createEventSubscriptionWithHttpInfo(EventSubscriptionRequest eventSubscriptionRequest) throws ApiException {
    Object localVarPostBody = eventSubscriptionRequest;
    
    // verify the required parameter 'eventSubscriptionRequest' is set
    if (eventSubscriptionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'eventSubscriptionRequest' when calling createEventSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/notifications/event-subscriptions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfEventSubscriptionResponse> localVarReturnType = new GenericType<ApiResponseOfEventSubscriptionResponse>() {};

    return apiClient.invokeAPI("NotificationsApi.createEventSubscription", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * delete event subscription by event type id
   * delete a event subscription within the data matching the id in the path
   * @param eventTypeId Event type Id (required)
   * @return ApiResponseOfEventSubscriptionDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event subscription deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Event subscription not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfEventSubscriptionDeleteResponse deleteEventSubscriptionById(String eventTypeId) throws ApiException {
    return deleteEventSubscriptionByIdWithHttpInfo(eventTypeId).getData();
  }

  /**
   * delete event subscription by event type id
   * delete a event subscription within the data matching the id in the path
   * @param eventTypeId Event type Id (required)
   * @return ApiResponse&lt;ApiResponseOfEventSubscriptionDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event subscription deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Event subscription not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfEventSubscriptionDeleteResponse> deleteEventSubscriptionByIdWithHttpInfo(String eventTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventTypeId' is set
    if (eventTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventTypeId' when calling deleteEventSubscriptionById");
    }
    
    // create path and map variables
    String localVarPath = "/notifications/event-subscriptions/{eventTypeId}"
      .replaceAll("\\{" + "eventTypeId" + "\\}", apiClient.escapeString(eventTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfEventSubscriptionDeleteResponse> localVarReturnType = new GenericType<ApiResponseOfEventSubscriptionDeleteResponse>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteEventSubscriptionById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * get event subscription by event type id
   * find an event subscription within the data matching the id in the path
   * @param eventTypeId Event type Id (required)
   * @return ApiResponseOfEventSubscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event subscription data found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Event subscription not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfEventSubscriptionResponse getEventSubscriptionById(String eventTypeId) throws ApiException {
    return getEventSubscriptionByIdWithHttpInfo(eventTypeId).getData();
  }

  /**
   * get event subscription by event type id
   * find an event subscription within the data matching the id in the path
   * @param eventTypeId Event type Id (required)
   * @return ApiResponse&lt;ApiResponseOfEventSubscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event subscription data found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Event subscription not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfEventSubscriptionResponse> getEventSubscriptionByIdWithHttpInfo(String eventTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventTypeId' is set
    if (eventTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventTypeId' when calling getEventSubscriptionById");
    }
    
    // create path and map variables
    String localVarPath = "/notifications/event-subscriptions/{eventTypeId}"
      .replaceAll("\\{" + "eventTypeId" + "\\}", apiClient.escapeString(eventTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfEventSubscriptionResponse> localVarReturnType = new GenericType<ApiResponseOfEventSubscriptionResponse>() {};

    return apiClient.invokeAPI("NotificationsApi.getEventSubscriptionById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * get event subscriptions
   * get all event subscriptions that your application is subscribed to
   * @return ApiListResponseOfEventSubscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event subscriptions for the application </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfEventSubscriptionResponse getEventSubscriptions() throws ApiException {
    return getEventSubscriptionsWithHttpInfo().getData();
  }

  /**
   * get event subscriptions
   * get all event subscriptions that your application is subscribed to
   * @return ApiResponse&lt;ApiListResponseOfEventSubscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event subscriptions for the application </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfEventSubscriptionResponse> getEventSubscriptionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notifications/event-subscriptions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfEventSubscriptionResponse> localVarReturnType = new GenericType<ApiListResponseOfEventSubscriptionResponse>() {};

    return apiClient.invokeAPI("NotificationsApi.getEventSubscriptions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * get event types
   * get all event types that Yapily support
   * @return List&lt;EventTypesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event types found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request for missing required properties </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public List<EventTypesResponse> getEventTypes() throws ApiException {
    return getEventTypesWithHttpInfo().getData();
  }

  /**
   * get event types
   * get all event types that Yapily support
   * @return ApiResponse&lt;List&lt;EventTypesResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event types found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request for missing required properties </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<EventTypesResponse>> getEventTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notifications/event-types";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<EventTypesResponse>> localVarReturnType = new GenericType<List<EventTypesResponse>>() {};

    return apiClient.invokeAPI("NotificationsApi.getEventTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
