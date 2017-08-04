package com.ntgtask.whattoweather.presentation.view;

import com.ntgtask.whattoweather.data.entities.WeatherResponse;

public interface IWeatherView {
    void checkGPSAvailable();

    void onDataFetched(WeatherResponse response);
}
