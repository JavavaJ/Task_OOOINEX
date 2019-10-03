package task2.better_solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StationTaskTest {

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));

    @Test
    public void testGetStationsByTwoFirstLetters_MO() {
        StationTask task = new StationTask(STATION_LIST);

        List<String> actual_MO_stationNames = new ArrayList<>();
        Collection<Station> MO_Stations = task.getStationsByTwoFirstLetters("МО");
        for (Station station : MO_Stations) {
            actual_MO_stationNames.add(station.getName());
        }
        List<String> expected_MO_outputNames = Arrays.asList("МОСКВА", "МОЖГА", "МОЗДОК");

        assertTrue(expected_MO_outputNames.size() == actual_MO_stationNames.size() &&
            expected_MO_outputNames.containsAll(actual_MO_stationNames) &&
            actual_MO_stationNames.containsAll(expected_MO_outputNames));
    }

    @Test
    public void testGetStationsByTwoFirstLetters_CA() {
        StationTask task = new StationTask(STATION_LIST);

        List<String> actual_CA_stationNames = new ArrayList<>();
        Collection<Station> CA_Stations = task.getStationsByTwoFirstLetters("СА");
        for (Station station : CA_Stations) {
            actual_CA_stationNames.add(station.getName());
        }
        List<String> expected_CA_outputNames = Arrays.asList("САНКТ-ПЕТЕРБУРГ", "САМАРА");

        assertTrue(expected_CA_outputNames.size() == actual_CA_stationNames.size() &&
                expected_CA_outputNames.containsAll(actual_CA_stationNames) &&
                actual_CA_stationNames.containsAll(expected_CA_outputNames));
    }



}
