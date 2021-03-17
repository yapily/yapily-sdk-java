/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.319
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiListResponseOfBulkUserDelete;
import yapily.sdk.ApiResponseOfBulkUserDeleteDetails;
import yapily.sdk.ApiResponseOfUserDeleteResponse;
import yapily.sdk.ApplicationUser;
import yapily.sdk.NewApplicationUser;
import yapily.sdk.UserDeleteRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationUsersApi
 */
@Ignore
public class ApplicationUsersApiTest {

    private final ApplicationUsersApi api = new ApplicationUsersApi();

    
    /**
     * Add an application user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserUsingPOSTTest() throws ApiException {
        NewApplicationUser newApplicationUser = null;
        ApplicationUser response = api.addUserUsingPOST(newApplicationUser);

        // TODO: test validations
    }
    
    /**
     * Delete an application user and sub-resources (including consent resources on institution APIs if they exist)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserUsingDELETETest() throws ApiException {
        String userUuid = null;
        ApiResponseOfUserDeleteResponse response = api.deleteUserUsingDELETE(userUuid);

        // TODO: test validations
    }
    
    /**
     * Get details of a user deletion job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeleteUsersJobUsingGETTest() throws ApiException {
        String jobId = null;
        ApiResponseOfBulkUserDeleteDetails response = api.getDeleteUsersJobUsingGET(jobId);

        // TODO: test validations
    }
    
    /**
     * Get details of all user deletion jobs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeleteUsersJobsUsingGETTest() throws ApiException {
        ApiListResponseOfBulkUserDelete response = api.getDeleteUsersJobsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Get an application user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserUsingGETTest() throws ApiException {
        String userUuid = null;
        ApplicationUser response = api.getUserUsingGET(userUuid);

        // TODO: test validations
    }
    
    /**
     * Get application users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersUsingGETTest() throws ApiException {
        List<String> filterApplicationUserId = null;
        List<ApplicationUser> response = api.getUsersUsingGET(filterApplicationUserId);

        // TODO: test validations
    }
    
    /**
     * Start a job to delete application users by specifying their identifiers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDeleteUsersJobUsingPOSTTest() throws ApiException {
        UserDeleteRequest userDeleteRequest = null;
        ApiResponseOfBulkUserDeleteDetails response = api.startDeleteUsersJobUsingPOST(userDeleteRequest);

        // TODO: test validations
    }
    
}
