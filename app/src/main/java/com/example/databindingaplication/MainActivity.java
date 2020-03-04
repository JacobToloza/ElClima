package com.example.databindingaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingaplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        DailyWeather clima1 = new DailyWeather("Santiago", "3/3/2020", "@drawable/ic_wb_sunny_black_24dp", "40", "°C");
        DailyWeather clima2 = new DailyWeather("Berlín", "3/3/2020", "@drawable/ic_wb_sunny_black_24dp", "37", "°C");

        binding.setClima(clima2);
    }
}
