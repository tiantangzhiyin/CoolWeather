package com.coolweather.android.gson;
/*和风天气aqi数据
"aqi":{
    "city":{
        "aqi":"44",
        "pm25":"13"
    }
}
*/
public class Aqi {

    public AqiCity city;
    public class AqiCity{
        public String aqi;
        public String pm25;
    }
}
