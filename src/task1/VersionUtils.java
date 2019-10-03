package task1;

import java.util.*;

public class VersionUtils {

    public static String[] sortVersionsArray(String[] versionsStrArray) {
        String[] sortedVersionsArray = new String[versionsStrArray.length];

        List<Version> versions = new ArrayList<>();
        for (String versionStr : versionsStrArray) {
            versions.add(new Version(versionStr));
        }

        List<Version> sortedVersions = sortVersionList(versions);
        for (int i = 0; i < versionsStrArray.length; i++) {
            sortedVersionsArray[i] = sortedVersions.get(i).toString();
        }

        return sortedVersionsArray;
    }

    public static List<Version> sortVersionList(List<Version> versionList) {
        Collections.sort(versionList, new VersionComparator());
        return versionList;
    }

    // generate random string of version format
    public static String generate() {
        int globalChanges = (int) (Math.random() * 2) + 1;
        int minorChanges = (int) (Math.random() * 4);
        int bugFixes = (int) (Math.random() * 7);

        return String.format("%d.%d.%d", globalChanges, minorChanges, bugFixes);
    }

    public static String[] generateRandomVersionsArray(int numberOfVersions) {
        String[] versionsArray = new String[numberOfVersions];

        for (int i = 0; i < numberOfVersions; i++) {
            versionsArray[i] = generate();
        }

        return versionsArray;
    }

    public static void printVersionList (List<Version> versionList) {
        for (Version version : versionList) {
            System.out.println(version);
        }
    }

}
