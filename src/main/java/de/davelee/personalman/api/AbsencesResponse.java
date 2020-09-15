package de.davelee.personalman.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is part of the PersonalMan REST API. It represents a response from the server containing details
 * of all matched absences according to specified criteria. As well as containing details about the absences in form of
 * a list of <code>AbsenceResponse</code> objects, the object also contains a simple count of the absences found as well
 * as statistics about the specified absences such as which category the absences belong to.
 * @author Dave Lee
 */
@Builder
@Getter
@Setter
public class AbsencesResponse {

    //a count of the number of absences which were found by the server.
    private Long count;

    //a list of all absences found by the server.
    private List<AbsenceResponse> absenceResponseList;

    //a map containing the absence categories as keys and the number of these categories in the response as values.
    private Map<String, Integer> statisticsMap = new HashMap<>();

    /**
     * Increment the count for the specified category in the hash map by 1.
     * @param absenceCategory a <code>String</code> containing the category to increment.
     */
    public void addToStatisticsMap (final String absenceCategory ) {
        if ( statisticsMap.containsKey(absenceCategory) ) {
            statisticsMap.put(absenceCategory, statisticsMap.get(absenceCategory) + 1);
        } else {
            statisticsMap.put(absenceCategory, 1);
        }
    }

}
