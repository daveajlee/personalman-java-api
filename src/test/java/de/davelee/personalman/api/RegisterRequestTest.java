package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the builder, getter and setter methods of the <code>RegisterRequest</code> class.
 */
public class RegisterRequestTest {

    @Test
    public void testClass ( ) {
        RegisterRequest registerRequest = RegisterRequest.builder()
                .firstName("Max")
                .surname("Mustermann")
                .company("Mustermann GmbH")
                .username("mmustermann")
                .password("pwd")
                .role("Employee")
                .build();
        assertEquals("Max", registerRequest.getFirstName());
        assertEquals("Mustermann", registerRequest.getSurname());
        assertEquals("Mustermann GmbH", registerRequest.getCompany());
        assertEquals("mmustermann", registerRequest.getUsername());
        assertEquals("pwd", registerRequest.getPassword());
        assertEquals("Employee", registerRequest.getRole());
    }

}
