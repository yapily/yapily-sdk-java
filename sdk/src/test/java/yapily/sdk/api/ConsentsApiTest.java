/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package yapily.sdk.api;

import yapily.sdk.*;
import yapily.sdk.auth.*;
import yapily.sdk.models.ApiListResponseOfConsent;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfConsent;
import yapily.sdk.models.ApiResponseOfConsentDeleteResponse;
import yapily.sdk.models.Consent;
import yapily.sdk.models.ConsentAuthCodeRequest;
import yapily.sdk.models.OneTimeTokenRequest;
import java.util.Set;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConsentsApi
 */
public class ConsentsApiTest {

    private final ConsentsApi api = new ConsentsApi();

    /**
     * Exchange OAuth2 Code
     *
     * Used to obtain a Yapily Consent object containing the &#x60;consentToken&#x60; once the user has authenticated and you have an OAuth2 authorisation code &#x60;auth-code&#x60; and state &#x60;auth-state&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConsentWithCodeTest() throws ApiException {
        //ConsentAuthCodeRequest consentAuthCodeRequest = null;
        //Consent response = api.createConsentWithCode(consentAuthCodeRequest);
        // TODO: test validations
    }

    /**
     * Delete Consent
     *
     * Delete a consent using the consent Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        //UUID consentId = null;
        //Boolean forceDelete = null;
        //ApiResponseOfConsentDeleteResponse response = api.delete(consentId, forceDelete);
        // TODO: test validations
    }

    /**
     * Get Consent
     *
     * Get consent using the consent Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentByIdTest() throws ApiException {
        //UUID consentId = null;
        //ApiResponseOfConsent response = api.getConsentById(consentId);
        // TODO: test validations
    }

    /**
     * Exchange One Time Token
     *
     * Exchange a One-time-token for the consent token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentBySingleAccessConsentTest() throws ApiException {
        //OneTimeTokenRequest oneTimeTokenRequest = null;
        //Consent response = api.getConsentBySingleAccessConsent(oneTimeTokenRequest);
        // TODO: test validations
    }

    /**
     * Get Consents
     *
     * Used to retrieve all the consents created for each user within an application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentsTest() throws ApiException {
        //Set<String> filterApplicationUserId = null;
        //Set<UUID> filterUserUuid = null;
        //Set<String> filterInstitution = null;
        //Set<String> filterStatus = null;
        //String from = null;
        //String before = null;
        //Integer limit = null;
        //Integer offset = null;
        //ApiListResponseOfConsent response = api.getConsents(filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset);
        // TODO: test validations
    }

}
