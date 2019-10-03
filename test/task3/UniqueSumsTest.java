package task3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueSumsTest {

    @Test
    public void testGetUniqueSums() {
        int[] arr = new int[] {2, 2, 4};
        List<Integer> actualUniqueSums = UniqueSums.getUniqueSums(arr);
        List<Integer> expectedUniqueSums = Arrays.asList(4, 6);

        assertTrue(expectedUniqueSums.size() == actualUniqueSums.size() &&
            expectedUniqueSums.containsAll(actualUniqueSums) && actualUniqueSums.containsAll(expectedUniqueSums));
    }
}