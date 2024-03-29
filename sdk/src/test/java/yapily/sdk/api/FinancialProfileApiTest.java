/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.13.1
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package yapily.sdk.api;

import yapily.sdk.*;
import yapily.sdk.auth.*;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfFinancialProfile;
import yapily.sdk.models.ApiResponseOfFinancialProfileAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfFinancialProfileBalancePrediction;
import yapily.sdk.models.ApiResponseOfFinancialProfileConsent;
import yapily.sdk.models.ApiResponseOfFinancialProfileConsentRemoveResponse;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FinancialProfileApi
 */
public class FinancialProfileApiTest {

    private final FinancialProfileApi api = new FinancialProfileApi();

    /**
     * Create Profile Consent
     *
     * Used to add a consent to a &#x60;Financial Profile&#x60; for a &#x60;User&#x60;.  The response is asynchronous, returned with pending status, while retrieval of financial data is commenced.  There is a limit of 10,000 transactions for enrichment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProfileConsentTest() throws ApiException {
        //UUID userUuid = null;
        //String consent = null;
        //ApiResponseOfFinancialProfileAuthorisationResponse response = api.createProfileConsent(userUuid, consent);
        // TODO: test validations
    }

    /**
     * Delete Profile Consent
     *
     * Used to delete a &#x60;ProfileConsent&#x60; for a &#x60;User&#x60;. This will remove the consent and all associated financial data from the &#39;Financial Profile&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProfileConsentTest() throws ApiException {
        //UUID userUuid = null;
        //String profileConsentId = null;
        //ApiResponseOfFinancialProfileConsentRemoveResponse response = api.deleteProfileConsent(userUuid, profileConsentId);
        // TODO: test validations
    }

    /**
     * Get Predicted Balances
     *
     * Used to retrieve a &#x60;Balance Prediction Profile&#x60; for a &#x60;User&#x60;.  Status will be &#x60;PENDING&#x60; until all ProfileConsents are &#x60;COMPLETED&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBalancePredictionTest() throws ApiException {
        //UUID userUuid = null;
        //ApiResponseOfFinancialProfileBalancePrediction response = api.getBalancePrediction(userUuid);
        // TODO: test validations
    }

    /**
     * Get Profile Consent
     *
     * Used to retreive a specific ProfileConsent for a User.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProfileConsentTest() throws ApiException {
        //UUID userUuid = null;
        //String profileConsentId = null;
        //ApiResponseOfFinancialProfileConsent response = api.getProfileConsent(userUuid, profileConsentId);
        // TODO: test validations
    }

    /**
     * Get User Profile
     *
     * Used to retrieve a &#x60;FinancialProfile&#x60; for a &#x60;User&#x60;.  Status will be &#x60;PENDING&#x60; until all ProfileConsents are &#x60;COMPLETED&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserProfileTest() throws ApiException {
        //UUID userUuid = null;
        //ApiResponseOfFinancialProfile response = api.getUserProfile(userUuid);
        // TODO: test validations
    }

}
