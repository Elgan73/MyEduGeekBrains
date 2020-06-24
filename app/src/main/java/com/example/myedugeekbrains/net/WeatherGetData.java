package com.example.myedugeekbrains.net;

import com.example.myedugeekbrains.model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherGetData {

    @GET("current?")
    Call<WeatherModel> getWeather(@Query("access_key") String accessKey, @Query("city") String city);
}


