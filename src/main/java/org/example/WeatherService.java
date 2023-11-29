package org.example;
@Service
public class WeatherService {
    public Weather getWeather(double latitude, double longitude) {
        Random random = new Random();
        double temperature = random.nextDouble() * 40 - 20;
        double humidity = random.nextDouble() * 100;
        String description = "Sunny";
        return new Weather(temperature, humidity, description);
    }
}
