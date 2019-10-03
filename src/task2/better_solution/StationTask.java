package task2.better_solution;

import task2.better_solution.trie.Trie;

import java.util.*;

public class StationTask {

    private Trie stationTrie;

    public StationTask(List<Station> stationList) {
        initializeTrie(stationList);
    }

    public static void main(String[] args) {
        StationTask task = new StationTask(STATION_LIST);
        System.out.println(task.getStationsByTwoFirstLetters("МО"));
        System.out.println(task.getStationsByTwoFirstLetters("СА"));
    }

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));


    // the method can also return stations by any number of first letters, not only two
    public Collection<Station> getStationsByTwoFirstLetters(String prefix) {
        List<String> stationNames = stationTrie.getAllWords(prefix);
        List<Station> stations = new ArrayList<>();
        for (String stationName : stationNames) {
            stations.add(new Station(stationName));
        }
        return stations;
    }

    public void initializeTrie(List<Station> stationList) {
        stationTrie = new Trie();
        for (Station station : stationList) {
            stationTrie.insert(station.getName());
        }
    }

}
