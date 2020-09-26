package de.davelee.personalman.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is part of the PersonalMan REST API. It represents a request for a registration of a new user.
 * TODO: this password should also be encrypted.
 * @author Dave Lee
 */
@Builder
@Getter
@Setter
public class RegisterUserRequest {

    //first name of the person making registration request
    private String firstName;

    //surname of the person making registration request
    private String surname;

    //company which the person works for
    private String company;

    //The username which the user wants to use
    private String username;

    //The password which the user wants to use
    private String password;

    //The role which the user would like
    private String role;

}
