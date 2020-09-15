package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the constructor, getter and setter methods of the <code>UserRequest</code> class.
 * Created by davelee on 08.02.17.
 */
public class UserRequestTest {

    @Test
    /**
     * Test the setter methods and ensure variables are set together using the getter methods.
     */
    public void testGettersAndSetters() {
        UserRequest userRequest = UserRequest.builder()
                .username("david.lee")
                .company("MyCompany")
                .startDate("08-02-2017")
                .firstName("David")
                .surname("Lee")
                .leaveEntitlementPerYear(25)
                .position("Tester")
                .workingDays("Monday,Tuesday")
                .build();
        assertEquals("david.lee", userRequest.getUsername());
        assertEquals("MyCompany", userRequest.getCompany());
        assertEquals("08-02-2017", userRequest.getStartDate());
        assertEquals("David", userRequest.getFirstName());
        assertEquals("Lee", userRequest.getSurname());
        assertEquals(25, userRequest.getLeaveEntitlementPerYear());
        assertEquals("Tester", userRequest.getPosition());
        assertEquals("Monday,Tuesday", userRequest.getWorkingDays());
    }

}
