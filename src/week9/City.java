package week9;

public class City {
    private String name;
    private String country;
    private String region;
    private int population;
    private Location location;

    public City(String nameIn, String country, String region, int population, Location location) {
        name = nameIn;
        this.country = country;
        this.region = region;
        this.population = population;
        this.location = location;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                ", location=(" + location.getLatitude()+","+location.getLongitude() +
                ")}";
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public Location getLocation() {
        return location;
    }
}
