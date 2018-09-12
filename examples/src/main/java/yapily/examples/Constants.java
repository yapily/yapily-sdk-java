package yapily.examples;

public class Constants {

    /**
     * Yapily Auth API url and parameters
     */
    static final String YAPILY_AUTH_BASE_URL = "https://auth.yapily.com/direct";
    static final String PARAMETER_INSTITUTION_ID = "institution";
    static final String PARAMETER_APPLICATION_ID = "application";
    static final String PARAMETER_USER_ID = "user";
    static final String PARAMETER_CALLBACK_URL = "callback";

    /**
     * Placeholder for credentials created in the Applications dashboard. Hardcoded here only for
     * example purposes. Can be used to test/demonstrate code. NOT SUITABLE FOR PRODUCTION
     */
    public static final String APPLICATION_ID = "fc3b5a43-69a7-48c8-8712-99c38fadf564";
    public static final String APPLICATION_SECRET = "6fea428c-0f30-4870-8e54-c8c4de11701a";

    /**
     * Provide your callback URL to redirect the customer back to, following the institution's
     * authorisation
     */
    public static final String CALLBACK_URL = "";

}
