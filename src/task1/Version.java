package task1;

public class Version {

    private Integer globalChange;
    private Integer minorChange;
    private Integer bugFix;

    public Version() {}

    public Version(Integer globalChange, Integer minorChange, Integer bugFix) {
        this.globalChange = globalChange;
        this.minorChange = minorChange;
        this.bugFix = bugFix;
    }

    public Version(String versionAsString) {
        this();
        String[] versArray = versionAsString.split("\\.");
        this.setGlobalChange(Integer.valueOf(versArray[0]));
        this.setMinorChange(Integer.valueOf(versArray[1]));
        this.setBugFix(Integer.valueOf(versArray[2]));
    }

    public Integer getGlobalChange() {
        return globalChange;
    }

    public void setGlobalChange(Integer globalChange) {
        this.globalChange = globalChange;
    }

    public Integer getMinorChange() {
        return minorChange;
    }

    public void setMinorChange(Integer minorChange) {
        this.minorChange = minorChange;
    }

    public Integer getBugFix() {
        return bugFix;
    }

    public void setBugFix(Integer bugFix) {
        this.bugFix = bugFix;
    }

    @Override
    public String toString() {
        return globalChange + "." +
                minorChange + "." +
                bugFix;
    }
}
