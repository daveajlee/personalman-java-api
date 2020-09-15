package de.davelee.personalman.api;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the constructor, getter and setter methods as well as the addToStatisticsMap method
 * of the <code>AbsencesResponse</code> class.
 */
public class AbsencesResponseTest {

    @Test
    /**
     * Test the setter methods and ensure variables are set together using the getter methods.
     */
    public void testSettersAndGetters() {
        AbsencesResponse absencesResponse = AbsencesResponse.builder()
                .count(1L).build();
        assertEquals(1L, absencesResponse.getCount());
        ArrayList<AbsenceResponse> absenceResponseArrayList = new ArrayList<>();
        absenceResponseArrayList.add(new AbsenceResponse("MyCompany", "dlee", "07-02-2017", "08-02-2017", "Holiday"));
        absencesResponse.setAbsenceResponseList(absenceResponseArrayList);
        assertEquals(1, absenceResponseArrayList.size());
        assertEquals("MyCompany", absenceResponseArrayList.get(0).getCompany());
        HashMap<String, Integer> statisticsMap = new HashMap<>();
        statisticsMap.put("Holiday", 1);
        absencesResponse.setStatisticsMap(statisticsMap);
        assertEquals(1, absencesResponse.getStatisticsMap().size());
        assertEquals(1, absencesResponse.getStatisticsMap().get("Holiday"));
    }

    @Test
    /**
     * Test the addToStatisticsMap method by adding to an already existing category or adding to a new category.
     */
    public void testAddStatisticsMap() {
        //This is necessary as Maps.of will produce an immutable map which we cannot add to in next test.
        Map<String, Integer> statisticsMap = new HashMap<>();
        statisticsMap.put("Holiday", 1);
        AbsencesResponse absencesResponse = AbsencesResponse.builder()
                .statisticsMap(statisticsMap).build();
        absencesResponse.addToStatisticsMap("Illness");
        assertEquals(1, absencesResponse.getStatisticsMap().get("Illness"));
        absencesResponse.addToStatisticsMap("Holiday");
        assertEquals(2, absencesResponse.getStatisticsMap().get("Holiday"));
    }

}
