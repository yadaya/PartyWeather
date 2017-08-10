package com.example.macuna.colorweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    public static final String TAG = MainActivity.class.getSimpleName();
   // private TextView dailyWeatherTextView;
   // private TextView hourlyWeatherTextView;
   // private TextView minutelyWeatherTextView;

    //@BindView(R.id.dayliWeatherTextView) TextView dailyWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.dayliWeatherTextView)
    public void dailyWeatherClick(){

        Intent dailyActivityIntent = new Intent(MainActivity.this, DayliWeatherActivity.class);
        startActivity(dailyActivityIntent);
    }

    @OnClick(R.id.hourlyWeatherTextView)
    public void hourlyWeatherClick(){
        Intent hourlyActivityIntent = new Intent(MainActivity.this, HourlyWeatherctivity.class);
        startActivity(hourlyActivityIntent);
    }

    @OnClick(R.id.minutelyWeatherTextView)
    public void minutelyWeatherClick(){
        Intent minutelyActivityIntent = new Intent(MainActivity.this, MinuteliWeatherActivity.class);
        startActivity(minutelyActivityIntent);
    }

}
