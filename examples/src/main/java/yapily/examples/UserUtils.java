package yapily.examples;

import yapily.ApiClient;
import yapily.ApiException;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.NewApplicationUser;

import java.util.Collections;
import java.util.List;

public class UserUtils {
    public static ApplicationUser createOrUseExistingApplciationUser(String applicationUserId, ApiClient defaultClient) throws ApiException {
        ApplicationUsersApi applicationUsersApi = new ApplicationUsersApi(defaultClient);
        System.out.println("Checking for user " + applicationUserId + " using GET /users?filter[applicationUserId]=" + applicationUserId);
        List<ApplicationUser> applicationUserList = applicationUsersApi.getUsersUsingGET(Collections.singletonList(applicationUserId));

        if (applicationUserList.isEmpty()) {
            return createNewApplicationUser(applicationUserId, defaultClient);
        } else {
            return applicationUserList.get(0);
        }
    }

    public static ApplicationUser createNewApplicationUser(String applicationUserId, ApiClient defaultClient) throws ApiException {
        ApplicationUsersApi applicationUsersApi = new ApplicationUsersApi(defaultClient);

        // Create a new user with the given application user Id
        NewApplicationUser user = new NewApplicationUser();
        user.setApplicationUserId(applicationUserId);

        System.out.println("Adding new user [java-sdk] with POST /users");
        final ApplicationUser applicationUser = applicationUsersApi.addUserUsingPOST(user);
        return applicationUser;
    }
}
