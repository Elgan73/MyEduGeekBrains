package com.example.myedugeekbrains.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService mInstance;
    private static final String apiKey = "current?access_key=00138a6a0ccff95b3b1e1064f3f9b25c";
    private static final String baseUrl = "http://api.weatherstack.com/";
    private Retrofit mRetrofit;

    private NetworkService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public WeatherGetData getApi() {
        return mRetrofit.create(WeatherGetData.class);
    }

}
