package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//总的实例类，用来引用gson包中的各个实体类
public class Weather {

    public String status;
    public Basic basic;
    public Aqi aqi;
    public Now now;
    public Suggestion suggestion;
    //由于daily_forecast中包含的是一个数组，因此使用List集合引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
