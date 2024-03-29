package week9;

import java.util.Objects;

public class Location {
    private double latitude;
    private double longitude;
    public Location(double latitude,double longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Location location))
            return false;
        return Double.compare(getLatitude(), location.getLatitude()) == 0 &&
                Double.compare(getLongitude(), location.getLongitude()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLatitude(), getLongitude());
    }
}
