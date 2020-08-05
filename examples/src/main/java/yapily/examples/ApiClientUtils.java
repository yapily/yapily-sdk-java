package yapily.examples;

import yapily.ApiClient;
import yapily.auth.HttpBasicAuth;
import static yapily.examples.Constants.APPLICATION_ID;
import static yapily.examples.Constants.APPLICATION_SECRET;

public class ApiClientUtils {
    public static ApiClient basicAuth() {
        ApiClient defaultClient = new ApiClient();
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername(APPLICATION_ID);
        basicAuth.setPassword(APPLICATION_SECRET);
        return defaultClient;
    }
}
