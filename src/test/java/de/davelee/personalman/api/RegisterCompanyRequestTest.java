package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the builder, getter and setter methods of the <code>RegisterCompanyRequest</code> class.
 */
public class RegisterCompanyRequestTest {

    @Test
    public void testClass ( ) {
        RegisterCompanyRequest registerCompanyRequest = RegisterCompanyRequest.builder()
                .name("Mustermann GmbH")
                .defaultAnnualLeaveInDays(25)
                .country("Germany")
                .build();
        assertEquals("Mustermann GmbH", registerCompanyRequest.getName());
        assertEquals(25, registerCompanyRequest.getDefaultAnnualLeaveInDays());
        assertEquals("Germany", registerCompanyRequest.getCountry());
    }

}
