package de.davelee.personalman.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is part of the PersonalMan REST API. It represents a response from the server containing details
 * of all matched user according to specified criteria. As well as containing details about the users in form of
 * an array of <code>UserResponse</code> objects, the object also contains a simple count of the users.
 * @author Dave Lee
 */
@Builder
@Getter
@Setter
public class UsersResponse {

    //a count of the number of users which were found by the server.
    private Long count;

    //an array of all users found by the server.
    private UserResponse[] userResponses;

}
