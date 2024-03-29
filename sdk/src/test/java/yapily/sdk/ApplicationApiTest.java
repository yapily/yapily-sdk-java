/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.157.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.Application;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationApi
 */
@Ignore
public class ApplicationApiTest {

    private final ApplicationApi api = new ApplicationApi();

    
    /**
     * Returns the details of the application that owns the request credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApplicationMeUsingGETTest() throws ApiException {
        String xYapilyApiVersion = null;
        Application response = api.getApplicationMeUsingGET(xYapilyApiVersion);

        // TODO: test validations
    }
    
}
