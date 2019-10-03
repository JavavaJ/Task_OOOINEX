package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionUtilsTest {

    @Test
    void testTask1() {
        String[] versionsArray = new String[] {
                "2.1.4",
                "1.0.0",
                "2.3.3",
                "2.2.2",
                "1.3.6"
        };
        String[] sortedArray = VersionUtils.sortVersionsArray(versionsArray);

        String[] expectedArray = new String[] {
                "1.0.0",
                "1.3.6",
                "2.1.4",
                "2.2.2",
                "2.3.3"
        };

        assertArrayEquals(expectedArray, sortedArray);
    }
}