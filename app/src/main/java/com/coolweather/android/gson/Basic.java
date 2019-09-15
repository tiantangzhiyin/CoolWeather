package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/*和风天气返回数据的basic
"basic":{
        "city":"苏州",//城市名
        "id":"CN101190401",//天气id
        "update":{
            "loc":"2016-08-08 21:58"//更新时间
        }
}
*/
public class Basic {
    //@SerializedName注解方式可让JSON字段和Java字段建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
