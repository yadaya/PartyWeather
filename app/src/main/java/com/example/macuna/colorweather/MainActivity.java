package com.example.macuna.colorweather;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.iconImageView) ImageView iconImageView;
    @BindView(R.id.descriptionTextView) TextView descriptionTextView;
    @BindView(R.id.tempTextView) TextView tempTextView;
    @BindView(R.id.higestTempTextView) TextView higestTempTextView;
    @BindView(R.id.lowestTempTextView) TextView lowestTempTextView;

    @BindDrawable(R.drawable.clear_night) Drawable clearNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        CurrentWeather currentWeather = new CurrentWeather();
         iconImageView.setImageDrawable(clearNight);
        descriptionTextView.setText("Sunny Day");
        tempTextView.setText("19");
        higestTempTextView.setText("H:25");
        lowestTempTextView.setText("L:10");
    }


    @OnClick(R.id.dayliWeatherTextView)
    public void dailyWeatherClick(){

        Intent dailyActivityIntent = new Intent(MainActivity.this, DayliWeatherActivity.class);
        startActivity(dailyActivityIntent);
    }



}
