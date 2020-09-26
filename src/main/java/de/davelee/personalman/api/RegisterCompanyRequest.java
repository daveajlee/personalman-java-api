package de.davelee.personalman.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is part of the PersonalMan REST API. It represents a request for registration of a new company in PersonalMan.
 * @author Dave Lee
 */
@Builder
@Getter
@Setter
public class RegisterCompanyRequest {

    //name of the company
    private String name;

    //default annual leave in days
    private int defaultAnnualLeaveInDays;

    //base country
    private String country;

}
