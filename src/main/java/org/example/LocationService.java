package org.example;
@Service
public class LocationService {
    public Location getLocation(double latitude, double longitude) {
        Random random = new Random();
        double lat = random.nextDouble() * 180 - 90;
        double lon = random.nextDouble() * 360 - 180;
        return new Location(lat, lon);
    }
}
