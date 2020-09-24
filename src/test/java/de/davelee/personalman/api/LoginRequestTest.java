package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the builder, getter and setter methods of the <code>LoginRequest</code> class.
 */
public class LoginRequestTest {

    @Test
    public void testClass ( ) {
        LoginRequest loginRequest = LoginRequest.builder()
                .username("testuser")
                .password("testpwd")
                .build();
        assertEquals("testuser", loginRequest.getUsername());
        assertEquals("testpwd", loginRequest.getPassword());
    }

}
