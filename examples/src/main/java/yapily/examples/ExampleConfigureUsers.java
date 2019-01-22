package yapily.examples;

import yapily.auth.OAuth;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import yapily.ApiException;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.NewApplicationUser;

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
            final ApplicationUsersApi usersApi = new ApplicationUsersApi();

            System.out.println("Adding new user [A] with POST /users");
            usersApi.addUserUsingPOST(newApplicationUser("A"));

            System.out.println("Adding new user [B] with POST /users");
            usersApi.addUserUsingPOST(newApplicationUser("B"));

            System.out.println("Adding new user [C] with POST /users");
            String userUuid = usersApi.addUserUsingPOST(newApplicationUser("C")).getUuid();

            // Test if the API contain the users added
            // Get all users
            System.out.println("Reading users from GET /users");
            List<ApplicationUser> users = usersApi.getUsersUsingGET();

            System.out.println("Print all users:");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(users));

            // Get only one user: the user C created previously
            System.out.println("Reading user [C] from GET /users/{userUuid}");
            ApplicationUser applicationUserC = usersApi.getUserUsingGET(userUuid);

            System.out.println(gson.toJson(applicationUserC));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static NewApplicationUser newApplicationUser(String userId) {
        NewApplicationUser user = new NewApplicationUser();
        user.setReferenceId(userId);
        return user;
    }

}
