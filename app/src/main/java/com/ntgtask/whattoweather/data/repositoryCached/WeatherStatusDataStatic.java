package com.ntgtask.whattoweather.data.repositoryCached;

import com.ntgtask.whattoweather.domain.models.Main;
import com.ntgtask.whattoweather.domain.repository.GetWeatherStatusCached;

public class WeatherStatusDataStatic implements GetWeatherStatusCached {
    private static WeatherStatusDataStatic INSTANCE;

    public static WeatherStatusDataStatic get() {
        if (INSTANCE == null) {
            INSTANCE = new WeatherStatusDataStatic();
        }
        return INSTANCE;
    }

    private Main main;

    private WeatherStatusDataStatic() {
        main = new Main();
    }

    @Override
    public void getWeatherStatusCached(Main main) {

    }
}
