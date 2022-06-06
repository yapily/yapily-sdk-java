package yapily.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.models.ApplicationUser;
import yapily.sdk.api.UsersApi;
import yapily.sdk.models.NewApplicationUser;

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
            ApiClient defaultClient = ApiClientUtils.basicAuth();

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            // Create users for this application
            final UsersApi UsersApi = new UsersApi(defaultClient);

            System.out.println("Adding new user [A] with POST /users");
            ApplicationUser A = UsersApi.addUser(newApplicationUser("A"));

            System.out.println("Adding new user [B] with POST /users");
            ApplicationUser B  = UsersApi.addUser(newApplicationUser("B"));

            System.out.println("Adding new user [C] with POST /users");
            ApplicationUser C = UsersApi.addUser(newApplicationUser("C"));

            // Test if the API contains the users added
            // Get all users
            System.out.println("Reading users from GET /users?filter[applicationUserId]=A,B,C");
            List<ApplicationUser> users = UsersApi.getUsers(
                    Set.of(A.getApplicationUserId(), B.getApplicationUserId(), C.getApplicationUserId())
            );

            System.out.println("Print all users:");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(users));

            // Get only one user: the user C created previously
            System.out.println("Reading user [C] from GET /users/{userUuid}");
            ApplicationUser applicationUserC = UsersApi.getUser(C.getUuid());

            System.out.println(gson.toJson(applicationUserC));

            System.out.println("Deleting user [A] with DELETE /users");
            UsersApi.deleteUser(A.getUuid());
            System.out.println("Deleting user [B] with DELETE /users");
            UsersApi.deleteUser(B.getUuid());
            System.out.println("Deleting user [C] with DELETE /users");
            UsersApi.deleteUser(C.getUuid());

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
