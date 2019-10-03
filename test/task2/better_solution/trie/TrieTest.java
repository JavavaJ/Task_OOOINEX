package task2.better_solution.trie;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TrieTest {

    @Test
    public void testTrie() {
        Trie testTrie = new Trie();
        testTrie.insert("maria");
        testTrie.insert("mario");
        testTrie.insert("marie");
        testTrie.insert("march");
        testTrie.insert("myopic");
        testTrie.insert("dog");

        List<String> actualWordList_ByMariPrefix = testTrie.getAllWords("mari");
        List<String> expectedWordList_ByMariPrefix = Arrays.asList("maria", "marie", "mario");
        assertIterableEquals(expectedWordList_ByMariPrefix, actualWordList_ByMariPrefix);

        List<String> actualWordList_ByMPrefix = testTrie.getAllWords("m");
        List<String> expectedWordList_ByMPrefix = Arrays.asList("march", "maria", "marie", "mario", "myopic");
        assertIterableEquals(expectedWordList_ByMPrefix, actualWordList_ByMPrefix);

        List<String> actualWordList_ByDPrefix = testTrie.getAllWords("d");
        List<String> expectedWordList_ByDPrefix = Arrays.asList("dog");
        assertIterableEquals(expectedWordList_ByDPrefix, actualWordList_ByDPrefix);
    }

}
