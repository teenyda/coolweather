package com.teenyda.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 15:24
 * @Description:
 */
public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @Override
    public String toString() {
        return "Weather{" +
                "status='" + status + '\'' +
                ", basic=" + basic +
                ", aqi=" + aqi +
                ", now=" + now +
                ", suggestion=" + suggestion +
                ", forecastList=" + forecastList +
                '}';
    }
}
