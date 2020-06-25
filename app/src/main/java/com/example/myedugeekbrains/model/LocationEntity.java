package com.example.myedugeekbrains.model;

public class LocationEntity {
    /**
     * localtime : 2020-06-23 23:10
     * utc_offset : 4.0
     * country : Russia
     * localtime_epoch : 1592953800
     * name : Ulyanovsk
     * timezone_id : Europe/Ulyanovsk
     * lon : 48.400
     * region : Ul'yanovsk
     * lat : 54.333
     */
    private String localtime;
    private String utc_offset;
    private String country;
    private int localtime_epoch;
    private String name;
    private String timezone_id;
    private String lon;
    private String region;
    private String lat;

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocaltime_epoch(int localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimezone_id(String timezone_id) {
        this.timezone_id = timezone_id;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLocaltime() {
        return localtime;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public String getCountry() {
        return country;
    }

    public int getLocaltime_epoch() {
        return localtime_epoch;
    }

    public String getName() {
        return name;
    }

    public String getTimezone_id() {
        return timezone_id;
    }

    public String getLon() {
        return lon;
    }

    public String getRegion() {
        return region;
    }

    public String getLat() {
        return lat;
    }
}