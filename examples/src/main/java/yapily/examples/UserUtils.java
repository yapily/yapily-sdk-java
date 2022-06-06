package yapily.examples;

import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.models.ApplicationUser;
import yapily.sdk.api.UsersApi;
import yapily.sdk.models.NewApplicationUser;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class UserUtils {
    public static ApplicationUser createOrUseExistingApplciationUser(String applicationUserId, ApiClient defaultClient) throws ApiException {
        UsersApi applicationUsersApi = new UsersApi(defaultClient);
        System.out.println("Checking for user " + applicationUserId + " using GET /users?filter[applicationUserId]=" + applicationUserId);
        List<ApplicationUser> applicationUserList = applicationUsersApi.getUsers(Set.of(applicationUserId));

        if (applicationUserList.isEmpty()) {
            return createNewApplicationUser(applicationUserId, defaultClient);
        } else {
            return applicationUserList.get(0);
        }
    }

    public static ApplicationUser createNewApplicationUser(String applicationUserId, ApiClient defaultClient) throws ApiException {
        UsersApi applicationUsersApi = new UsersApi(defaultClient);

        // Create a new user with the given application user Id
        NewApplicationUser user = new NewApplicationUser();
        user.setApplicationUserId(applicationUserId);

        System.out.println("Adding new user [java-sdk] with POST /users");
        final ApplicationUser applicationUser = applicationUsersApi.addUser(user);
        return applicationUser;
    }
}
