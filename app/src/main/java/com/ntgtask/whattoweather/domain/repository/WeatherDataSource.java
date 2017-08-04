package com.ntgtask.whattoweather.domain.repository;

public interface WeatherDataSource {
    void getWeatherStatus(double latitude, double longitude);
}
