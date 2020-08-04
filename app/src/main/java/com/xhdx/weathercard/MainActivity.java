package com.xhdx.weathercard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xhdx.view.WeatherView;

public class MainActivity extends AppCompatActivity {

    WeatherView WeatherView1;
    WeatherView WeatherView2;
    WeatherView WeatherView3;
    WeatherView WeatherView4;
    WeatherView WeatherView5;
    WeatherView WeatherView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeatherView1 = findViewById(R.id.WeatherView1);
        WeatherView2 = findViewById(R.id.WeatherView2);
        WeatherView3 = findViewById(R.id.WeatherView3);
        WeatherView4 = findViewById(R.id.WeatherView4);
        WeatherView5 = findViewById(R.id.WeatherView5);
        WeatherView6 = findViewById(R.id.WeatherView6);
        WeatherView1.setMyType(WeatherView.Type.sunday);
        WeatherView2.setMyType(WeatherView.Type.raining);
        WeatherView3.setMyType(WeatherView.Type.snow);
        WeatherView4.setMyType(WeatherView.Type.night);
        WeatherView5.setMyType(WeatherView.Type.rainingNight);
        WeatherView6.setMyType(WeatherView.Type.snowNight);
    }
}
