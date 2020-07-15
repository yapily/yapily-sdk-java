/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.209
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.YapilyAccessToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
@Ignore
public class OAuthApiTest {

    private final OAuthApi api = new OAuthApi();

    
    /**
     * Retrieve Access Token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthTokenTest() throws ApiException {
        String grantType = null;
        YapilyAccessToken response = api.oauthToken(grantType);

        // TODO: test validations
    }
    
}
