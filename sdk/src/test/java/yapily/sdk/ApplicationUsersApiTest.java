/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.57
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApplicationUser;
import yapily.sdk.NewApplicationUser;
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
     * Delete an application user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserUsingDELETETest() throws ApiException {
        String userUuid = null;
        Object response = api.deleteUserUsingDELETE(userUuid);

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
        List<ApplicationUser> response = api.getUsersUsingGET();

        // TODO: test validations
    }
    
}
