package task3;

import java.util.*;

public class UniqueSums {

    private final static int ARRAY_LENGTH = 3;
    private final static int MAX_INTEGER_IN_ARRAY = 5;

    public static void main(String[] args) {
        int[] arr = generateRandomIntArray(ARRAY_LENGTH, MAX_INTEGER_IN_ARRAY);
        System.out.println("Array:       " + Arrays.toString(arr));
        List<Integer> uniqueSums = getUniqueSums(arr);
        System.out.println("Unique sums: " + uniqueSums);
    }

    public static int[] generateRandomIntArray(int arrayLen, int maxIntValue) {
        int[] intArray = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            intArray[i] = (int) (Math.random() * maxIntValue);
        }
        return intArray;
    }

    public static List<Integer> getUniqueSums(int[] intArray) {
        Set<Integer> uniqueSums = new HashSet<>();

        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                int sum = intArray[i] + intArray[j];
                uniqueSums.add(sum);
            }
        }
        return new ArrayList<>(uniqueSums);
    }

}
