package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/*和风天气daily_forecast数据
"daily_forecast":{
    {
        "date":"2016-08-08",
        "cond":{
            "txt_d":"阵雨"
        },
        "tmp":{
            "max":"34",
            "min":"27"
        }
    },
    {
        "date":"2016-08-09",
        "cond":{
            "txt_d":"多云"
        },
        "tmp":{
            "max":"35",
            "min":"29"
        }
    }
}
//对于数组的情况，只需定义单个元素的实体类，然后声明实体类引用时使用集合类型来声明
*/
public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        public String max;
        public String min;
    }
}
