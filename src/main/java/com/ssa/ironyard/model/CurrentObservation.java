package com.ssa.ironyard.model;

public class CurrentObservation {
    private String weather;
    private Double temp_f;
    private String relative_humidity;
    private String wind_dir;
    private Double wind_mph;
    private String icon;
    
    public CurrentObservation() {
        // TODO Auto-generated constructor stub
    }
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public Double getTemp_f() {
        return temp_f;
    }
    public void setTemp_f(Double temp_f) {
        this.temp_f = temp_f;
    }
    @Override
    public String toString() {
        return "CurrentObservation [weather=" + weather + ", temp_f=" + temp_f + "]";
    }
    public String getRelative_humidity() {
        return relative_humidity;
    }
    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }
    public String getWind_dir() {
        return wind_dir;
    }
    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }
    public Double getWind_mph() {
        return wind_mph;
    }
    public void setWind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
