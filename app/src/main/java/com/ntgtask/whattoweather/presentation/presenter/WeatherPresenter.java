package com.ntgtask.whattoweather.presentation.presenter;

import com.ntgtask.whattoweather.presentation.view.IWeatherView;

public class WeatherPresenter extends BasePresenter {
    private IWeatherView view;

    public WeatherPresenter(IWeatherView view) {
        this.view = view;
    }

    public void startService() {

    }
}
