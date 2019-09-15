package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/*和风天气suggestion数据
"suggestion":{
        "comf":{
            "txt":"白天天气会更热..."
        },
        "cw":{
            "txt":"不宜洗车..."
        },
        "sport":{
            "txt":"有降水..."
        }
}
*/
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
