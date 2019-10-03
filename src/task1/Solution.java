package task1;

public class Solution {

    public static void main(String[] args) {
        String[] versionsArray = new String[] {
                "2.1.4",
                "1.0.0",
                "2.3.3",
                "2.2.2",
                "1.3.6"
        };

        String[] sortedArray = VersionUtils.sortVersionsArray(versionsArray);

        for (String versionStr : sortedArray) {
            System.out.println(versionStr);
        }

    }

}
