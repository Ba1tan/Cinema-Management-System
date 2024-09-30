package config;

public class CinemaConfig
{
    private static CinemaConfig instance;
    private String cinemaName;
    private int numberOfScreens;
    private String operatingHours;

    private CinemaConfig() {
    }

    public static CinemaConfig getInstance() {
        if (instance == null) {
            synchronized (CinemaConfig.class) {
                if (instance == null) {
                    instance = new CinemaConfig();
                }
            }
        }
        return instance;
    }

    // Getters and setters for cinemaName, numberOfScreens, operatingHours

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;

    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;

    }
}
