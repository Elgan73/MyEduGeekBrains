package com.example.myedugeekbrains.model;

import java.util.List;

public class WeatherModel {

    /**
     * request : {"unit":"m","query":"Ulyanovsk, Russia","language":"en","type":"City"}
     * current : {"weather_descriptions":["Clear"],"observation_time":"07:10 PM","wind_degree":190,"visibility":8,"weather_icons":["https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0008_clear_sky_night.png"],"feelslike":17,"is_day":"no","wind_dir":"S","pressure":1016,"cloudcover":0,"precip":0,"uv_index":1,"temperature":17,"humidity":68,"wind_speed":7,"weather_code":113}
     * location : {"localtime":"2020-06-23 23:10","utc_offset":"4.0","country":"Russia","localtime_epoch":1592953800,"name":"Ulyanovsk","timezone_id":"Europe/Ulyanovsk","lon":"48.400","region":"Ul'yanovsk","lat":"54.333"}
     */
    private RequestEntity request;
    private CurrentEntity current;
    private LocationEntity location;

    public void setRequest(RequestEntity request) {
        this.request = request;
    }

    public void setCurrent(CurrentEntity current) {
        this.current = current;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

    public RequestEntity getRequest() {
        return request;
    }

    public CurrentEntity getCurrent() {
        return current;
    }

    public LocationEntity getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "WeatherModel{" +
                "request=" + request +
                ", current=" + current +
                ", location=" + location +
                '}';
    }
}
