package com.example.myedugeekbrains.model;

public class RequestEntity {
    /**
     * unit : m
     * query : Ulyanovsk, Russia
     * language : en
     * type : City
     */
    private String unit;
    private String query;
    private String language;
    private String type;

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public String getQuery() {
        return query;
    }

    public String getLanguage() {
        return language;
    }

    public String getType() {
        return type;
    }
}
