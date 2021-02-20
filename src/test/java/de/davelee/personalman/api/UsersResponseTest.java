package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the constructor, getter and setter methods of the <code>UsersResponse</code> class.
 * Created by davelee on 08.02.17.
 */
public class UsersResponseTest {

    @Test
    /**
     * Test the setter methods and ensure variables are set together using the getter methods.
     */
    public void testGettersAndSetters() {
        UserResponse[] userResponses = new UserResponse[1];
        userResponses[0] =  new UserResponse("David", "Lee", "david.lee", "MyCompany", 25, "Monday,Tuesday", "Tester", "08-02-2017", "Admin");
        UsersResponse usersResponse = UsersResponse.builder()
                .count(1L)
                .userResponses(userResponses).build();
        assertEquals(1L,usersResponse.getCount());
        assertEquals(1, userResponses.length);
        assertEquals("MyCompany", userResponses[0].getCompany());
    }

}
