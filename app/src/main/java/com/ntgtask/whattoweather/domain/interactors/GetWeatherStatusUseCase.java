package com.ntgtask.whattoweather.domain.interactors;

import com.ntgtask.whattoweather.domain.models.Main;
import com.squareup.otto.Subscribe;

public class GetWeatherStatusUseCase extends BaseUseCase {
    double latitude;
    double longitude;

    public GetWeatherStatusUseCase(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    protected Object setSubscriber() {
        return new Object() {

            @Subscribe
            public void onWeatherStatusReceived(Main main) {
                post(main);
                unregisterUseCaseSubscriber();
            }
        };
    }

    @Override
    protected void onExecute() {

    }
}
