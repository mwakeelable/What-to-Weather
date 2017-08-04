package com.ntgtask.whattoweather.data.network;

import com.ntgtask.whattoweather.domain.models.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("pokemon/")
    Call<Response> getWeatherStatus(@Query("lat") double latitude,
                                    @Query("lon") double longitude, @Query("APPID") String appId);
}
