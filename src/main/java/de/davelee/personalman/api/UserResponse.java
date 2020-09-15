package de.davelee.personalman.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This class is part of the PersonalMan REST API. It represents a response from the server for a particular user
 * containing first name, surname, username, company they work for, how much leave they are entitled to per year,
 * which days they work, their position and their start date.
 * @author Dave Lee
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserResponse {

    // first name of the user
    private String firstName;

    // surname of the user
    private String surname;

    // username
    private String username;

    // company associated with
    private String company;

    // leave entitlement for this user (in days per year)
    private int leaveEntitlementPerYear;

    // which days of the week that the users works comma-separated (e.g. Monday,Tuesday,Wednesday,Thursday)
    private String workingDays;

    // the position of this user
    private String position;

    // start date for the user in format dd-MM-yyyy
    private String startDate;

}
