package task1;

import java.util.Comparator;

// a custom comparator which implements logic of comparing versions
public class VersionComparator implements Comparator<Version> {

    @Override
    public int compare(Version firstVersion, Version secondVersion) {
        int result = 0;

        if (!firstVersion.getGlobalChange().equals(secondVersion.getGlobalChange())) {
            result = firstVersion.getGlobalChange() - secondVersion.getGlobalChange();
            return result;
        } else {
            if (!firstVersion.getMinorChange().equals(secondVersion.getMinorChange())) {
                result = firstVersion.getMinorChange() - secondVersion.getMinorChange();
                return result;
            } else {
                if (!firstVersion.getBugFix().equals(secondVersion.getBugFix())) {
                    result = firstVersion.getBugFix() - secondVersion.getBugFix();
                    return result;
                } else {
                    result = 0;
                    return result;
                }
            }
        }
    }

}
