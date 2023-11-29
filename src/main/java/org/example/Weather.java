package org.example;
public class Weather {
    private double temperature;
    private double humidity;
    private String description;

    public Weather() {
    }

    public Weather(double temperature, double humidity, String description) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
    }
}