package com.example.getresourcesapi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWork {
    public static HttpLoggingInterceptor httpLoggingInterceptor = new
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC);

    public static Retrofit getInstance() {
        return new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
                .build();
    }
}
