package yapily.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import yapily.ApiClient;
import yapily.ApiException;
import yapily.auth.OAuth;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.NewApplicationUser;

import java.util.Arrays;
import java.util.List;

/**
 * This example demonstrates how to create and retrieve users using your application credentials.
 * The application credentials must be created and managed in the Yapily Dashboard Application. For
 * demo purposes, the application ID and secret are included as constants.
 */
public class ExampleConfigureUsers {

    public static void main(String[] args) {
        System.out.println("Application Users management from Yapily API!");

        try {
            // Set access credentials
            ApiClient defaultClient = new ApiClient();

            OAuth oAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
            oAuth.setAccessToken(AuthorizationUtils.createAccessToken());

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            // Create users for this application
            final ApplicationUsersApi applicationUsersApi = new ApplicationUsersApi();

            System.out.println("Adding new user [A] with POST /users");
            ApplicationUser A = applicationUsersApi.addUserUsingPOST(newApplicationUser("A"));

            System.out.println("Adding new user [B] with POST /users");
            ApplicationUser B  = applicationUsersApi.addUserUsingPOST(newApplicationUser("B"));

            System.out.println("Adding new user [C] with POST /users");
            ApplicationUser C = applicationUsersApi.addUserUsingPOST(newApplicationUser("C"));

            // Test if the API contains the users added
            // Get all users
            System.out.println("Reading users from GET /users?filter[applicationUserId]=A,B,C");
            List<ApplicationUser> users = applicationUsersApi.getUsersUsingGET(
                    Arrays.asList(A.getApplicationUserId(), B.getApplicationUserId(), C.getApplicationUserId())
            );

            System.out.println("Print all users:");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(users));

            // Get only one user: the user C created previously
            System.out.println("Reading user [C] from GET /users/{userUuid}");
            ApplicationUser applicationUserC = applicationUsersApi.getUserUsingGET(C.getUuid());

            System.out.println(gson.toJson(applicationUserC));

            System.out.println("Deleting user [A] with DELETE /users");
            applicationUsersApi.deleteUserUsingDELETE(A.getUuid());
            System.out.println("Deleting user [B] with DELETE /users");
            applicationUsersApi.deleteUserUsingDELETE(B.getUuid());
            System.out.println("Deleting user [C] with DELETE /users");
            applicationUsersApi.deleteUserUsingDELETE(C.getUuid());

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static NewApplicationUser newApplicationUser(String applicationUserId) {
        NewApplicationUser user = new NewApplicationUser();
        user.setApplicationUserId(applicationUserId);
        return user;
    }
}
