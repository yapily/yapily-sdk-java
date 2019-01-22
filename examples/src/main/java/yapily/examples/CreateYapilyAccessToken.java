package yapily.examples;

import yapily.ApiClient;
import yapily.ApiException;
import yapily.Configuration;
import yapily.sdk.YapilyAccessToken;
import yapily.auth.HttpBasicAuth;
import static yapily.examples.Constants.APPLICATION_ID;
import static yapily.examples.Constants.APPLICATION_SECRET;
import yapily.sdk.OAuthApi;

/**
 * This example simulates creating a Yapily access token for a Yapily application, in order to interact securely with the Yapily api through token based authentication instead of a basic one.
 * In order to interact with the Yapily api it is strongly recommended to use access tokens instead of your applications credentials
 * For demo purposes, the application ID and secret are included as constants.
 */
public class CreateYapilyAccessToken {

    public static void main(String[] args) {
        System.out.println("Create an access token for Yapily API!");

        ApiClient defaultClient = new ApiClient();

        // Configure the API authentication
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        // Replace these demo constants with your application credentials
        basicAuth.setUsername(APPLICATION_ID);
        basicAuth.setPassword(APPLICATION_SECRET);

        System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

        //Create an access token for the application
        try {
            OAuthApi oAuthApi = new OAuthApi();
            oAuthApi.setApiClient(defaultClient);
            YapilyAccessToken accessToken = oAuthApi.oauthToken("client_credentials");
            System.out.println("Created the accessToken: "+accessToken.getAccessToken());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
