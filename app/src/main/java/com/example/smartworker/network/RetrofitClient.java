package com.example.smartworker.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://smarterjobs.herokuapp.com/api/";
    private static RetrofitClient mInstance;
    private static Retrofit retrofit;

    public static Retrofit retrofitClient(){
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(BASE_URL);
        builder.addConverterFactory(GsonConverterFactory.create());
        return builder.build();
    }

    public static synchronized RetrofitClient getInstance(){
        if (mInstance == null){
             mInstance = new RetrofitClient();
        }
        return mInstance;
    }

}