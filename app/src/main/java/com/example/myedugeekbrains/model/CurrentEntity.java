package com.example.myedugeekbrains.model;

import java.util.List;

public class CurrentEntity {
    /**
     * weather_descriptions : ["Clear"]
     * observation_time : 07:10 PM
     * wind_degree : 190
     * visibility : 8
     * weather_icons : ["https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0008_clear_sky_night.png"]
     * feelslike : 17
     * is_day : no
     * wind_dir : S
     * pressure : 1016
     * cloudcover : 0
     * precip : 0
     * uv_index : 1
     * temperature : 17
     * humidity : 68
     * wind_speed : 7
     * weather_code : 113
     */
    private List<String> weather_descriptions;
    private String observation_time;
    private int wind_degree;
    private int visibility;
    private List<String> weather_icons;
    private int feelslike;
    private String is_day;
    private String wind_dir;
    private int pressure;
    private int cloudcover;
    private int precip;
    private int uv_index;
    private int temperature;
    private int humidity;
    private int wind_speed;
    private int weather_code;

    public void setWeather_descriptions(List<String> weather_descriptions) {
        this.weather_descriptions = weather_descriptions;
    }

    public void setObservation_time(String observation_time) {
        this.observation_time = observation_time;
    }

    public void setWind_degree(int wind_degree) {
        this.wind_degree = wind_degree;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public void setWeather_icons(List<String> weather_icons) {
        this.weather_icons = weather_icons;
    }

    public void setFeelslike(int feelslike) {
        this.feelslike = feelslike;
    }

    public void setIs_day(String is_day) {
        this.is_day = is_day;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }

    public void setPrecip(int precip) {
        this.precip = precip;
    }

    public void setUv_index(int uv_index) {
        this.uv_index = uv_index;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setWind_speed(int wind_speed) {
        this.wind_speed = wind_speed;
    }

    public void setWeather_code(int weather_code) {
        this.weather_code = weather_code;
    }

    public List<String> getWeather_descriptions() {
        return weather_descriptions;
    }

    public String getObservation_time() {
        return observation_time;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public int getVisibility() {
        return visibility;
    }

    public List<String> getWeather_icons() {
        return weather_icons;
    }

    public int getFeelslike() {
        return feelslike;
    }

    public String getIs_day() {
        return is_day;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public int getPressure() {
        return pressure;
    }

    public int getCloudcover() {
        return cloudcover;
    }

    public int getPrecip() {
        return precip;
    }

    public int getUv_index() {
        return uv_index;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWind_speed() {
        return wind_speed;
    }

    public int getWeather_code() {
        return weather_code;
    }
}
