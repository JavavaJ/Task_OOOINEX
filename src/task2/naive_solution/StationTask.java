package task2.naive_solution;

import java.util.*;

public class StationTask {

    // a map with two-letter prefixes as keys and stations as values
    private Map<String, List<Station>> stationMap;

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));

    public static void main(String[] args) {
        StationTask task = new StationTask(STATION_LIST);
        System.out.println(task.getStationsByTwoFirstLetters("МО"));
        System.out.println(task.getStationsByTwoFirstLetters("СА"));
    }

    public StationTask(List<Station> stationList) {
        initializeStationMap(stationList);
    }

    public void initializeStationMap(List<Station> stationList) {
        stationMap = new HashMap<>();
        int numOfFirstLetters = 2;
        for (Station currentStation : stationList) {
            if (numOfFirstLetters <= currentStation.getName().length()) {
                String prefix = currentStation.getName().substring(0, numOfFirstLetters);
                if (stationMap.containsKey(prefix)) {
                    List<Station> stations = stationMap.get(prefix);
                    stations.add(currentStation);
                }else {
                    List<Station> stations = new ArrayList<>();
                    stations.add(currentStation);
                    stationMap.put(prefix, stations);
                }
            }
        }
    }

    private Collection<Station> getStationsByTwoFirstLetters(String prefix) {
        return stationMap.get(prefix);
    }

    public Map<String, List<Station>> getStationMap() {
        return stationMap;
    }

    private static class Station {

        private String name;

        public Station(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // for readability
        @Override
        public String toString() {
            return name;
        }
    }
}

