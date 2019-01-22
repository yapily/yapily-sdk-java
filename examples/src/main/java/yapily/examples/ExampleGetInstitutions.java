package yapily.examples;

import yapily.auth.OAuth;

import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import yapily.ApiException;
import yapily.sdk.ApiListResponseOfInstitution;
import yapily.sdk.Institution;
import yapily.sdk.InstitutionsApi;

/**
 * Hello Yapily! This example lists all the institutions (banks) retrieved from the Yapily API
 * server using the Yapily SDK. The application credentials must be created and managed in the
 * Yapily Dashboard Application. For demo purposes, the application ID and secret are included as
 * constants.
 */
public class ExampleGetInstitutions {

    public static void main(String[] args) {
        System.out.println("List institutions from Yapily API!");

        try {
            // Set access credentials
            ApiClient defaultClient = new ApiClient();

            OAuth oAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
            oAuth.setAccessToken(AuthorizationUtils.createAccessToken());

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            // Create InstitutionsApi API client
            final InstitutionsApi institutionsApi = new InstitutionsApi();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Get all institutions
            System.out.println("Get Institutions from API: /institutions");
            ApiListResponseOfInstitution institutionsResponse = institutionsApi.getInstitutionsUsingGET();

            // Print only the names
            final List<String> institutionsNamesList = institutionsResponse.getData().stream()
                                                                           .map(Institution::getName)
                                                                           .collect(Collectors.toList());
            System.out.println("All institutions:");
            System.out.println(gson.toJson(institutionsNamesList));

            // Get only one institution
            String institutionId = institutionsResponse.getData().get(0).getId();

            System.out.println("Get Institution from API: /institutions/{institutionId}");
            Institution institution = institutionsApi.getInstitutionUsingGET(institutionId);

            System.out.println("One institution:");
            System.out.println(gson.toJson(institution));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

}
