package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the builder, getter and setter methods of the <code>RegisterUserRequest</code> class.
 */
public class RegisterUserRequestTest {

    @Test
    public void testClass ( ) {
        RegisterUserRequest registerUserRequest = RegisterUserRequest.builder()
                .firstName("Max")
                .surname("Mustermann")
                .company("Mustermann GmbH")
                .username("mmustermann")
                .password("pwd")
                .role("Employee")
                .build();
        assertEquals("Max", registerUserRequest.getFirstName());
        assertEquals("Mustermann", registerUserRequest.getSurname());
        assertEquals("Mustermann GmbH", registerUserRequest.getCompany());
        assertEquals("mmustermann", registerUserRequest.getUsername());
        assertEquals("pwd", registerUserRequest.getPassword());
        assertEquals("Employee", registerUserRequest.getRole());
    }

}
