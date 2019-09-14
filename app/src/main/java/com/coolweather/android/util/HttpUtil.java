package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//用于和服务器交互的工具类
public class HttpUtil {
    //发起一条HTTP请求时只要调用sendOkHttpRequest()方法，传入地址并注册一个回调来处理服务器响应
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
