package transport;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int experienceInYears;

    public Driver(String name, boolean hasDriverLicense, int experienceInYears) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experienceInYears = experienceInYears;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }


    public String getName() {
        return name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();
}
