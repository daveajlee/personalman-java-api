package de.davelee.personalman.api;

import lombok.*;

/**
 * This class is part of the PersonalMan REST API. It represents a request to reset the password of a particular user.
 * @author Dave Lee
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResetUserRequest {

    // username who's password should be reset
    private String username;

    // new password to set for this user
    private String password;

    // company associated with
    private String company;

}
