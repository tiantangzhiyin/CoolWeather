package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //判断是否有天气数据缓存，有就直接显示天气信息，否则选择城市
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        if(preferences.getString("weather",null)!=null){
            Intent intent=new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
