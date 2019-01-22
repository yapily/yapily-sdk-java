package yapily.examples;

import yapily.ApiException;
import yapily.auth.HttpBasicAuth;
import static yapily.examples.Constants.APPLICATION_ID;
import static yapily.examples.Constants.APPLICATION_SECRET;
import yapily.sdk.OAuthApi;
import yapily.sdk.YapilyAccessToken;

public class AuthorizationUtils {

    public static String createAccessToken() {
        OAuthApi oAuthApi = new OAuthApi();

        HttpBasicAuth basicAuth = (HttpBasicAuth) oAuthApi.getApiClient().getAuthentication("basicAuth");
        // Replace these demo constants with your application credentials
        basicAuth.setUsername(APPLICATION_ID);
        basicAuth.setPassword(APPLICATION_SECRET);

        try {
            YapilyAccessToken accessToken = oAuthApi.oauthToken("client_credentials");
            return accessToken.getAccessToken();
        } catch (ApiException e) {
            throw new RuntimeException("Could not create access token, please make sure you have set valid credentials");
        }
    }

}
