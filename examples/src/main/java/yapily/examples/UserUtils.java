package yapily.examples;

import yapily.ApiException;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.NewApplicationUser;

import java.util.Collections;
import java.util.List;

public class UserUtils {
    public static ApplicationUser createOrUseExistingApplciationUser(String applicationUserId) throws ApiException {
        ApplicationUsersApi applicationUsersApi = new ApplicationUsersApi();
        System.out.println("Checking for user " + applicationUserId + " using GET /users?filter[applicationUserId]=" + applicationUserId);
        List<ApplicationUser> applicationUserList = applicationUsersApi.getUsersUsingGET(Collections.singletonList(applicationUserId));

        if (applicationUserList.isEmpty()) {
            return createNewApplicationUser(applicationUserId);
        } else {
            return applicationUserList.get(0);
        }
    }

    public static ApplicationUser createNewApplicationUser(String applicationUserId) throws ApiException {

        final ApplicationUsersApi applicationUsersApi = new ApplicationUsersApi();

        // Create a new user with the given application user Id
        NewApplicationUser user = new NewApplicationUser();
        user.setApplicationUserId(applicationUserId);

        System.out.println("Adding new user [java-sdk] with POST /users");
        final ApplicationUser applicationUser = applicationUsersApi.addUserUsingPOST(user);
        return applicationUser;
    }
}
