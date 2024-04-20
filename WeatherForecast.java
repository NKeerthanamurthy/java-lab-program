package javaact;

import java.util.Random;

public class WeatherForecast {
    double temperature;
    double humidity; 
    public WeatherForecast(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
    public void getCurrentWeather() {
        System.out.println("Current Weather Conditions:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
    }
    public void updateWeather() {
        Random random = new Random();
        temperature += random.nextDouble() * 2 - 1; 
        humidity += random.nextDouble() * 10 - 5; 
        temperature = Math.max(-50, Math.min(50, temperature)); 
        humidity = Math.max(0, Math.min(100, humidity)); 
    }
    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast(25.0, 60.0);
        forecast.getCurrentWeather();
        forecast.updateWeather();
        forecast.getCurrentWeather();
    }
}
