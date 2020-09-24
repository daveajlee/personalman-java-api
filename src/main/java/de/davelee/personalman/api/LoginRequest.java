package de.davelee.personalman.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is part of the PersonalMan REST API. It represents a request for a login with username and password.
 * TODO: this password should also be encrypted.
 * @author Dave Lee
 */
@Builder
@Getter
@Setter
public class LoginRequest {

    //The username who wants to login
    private String username;

    //The password used for login
    private String password;

}
