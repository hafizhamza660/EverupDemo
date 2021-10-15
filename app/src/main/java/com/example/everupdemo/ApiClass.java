package com.example.everupdemo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClass {
    private static Retrofit getRetrofit(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(100,TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .build();

        Retrofit retrofit= new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://www.everup.net/api/")
                .client(okHttpClient)
                .build();

        return retrofit;
    }

    public static LoginInterface getLoginInterface(){
        LoginInterface loginInterface =getRetrofit().create(LoginInterface.class);
        return loginInterface;
    }

    public static GetAllCustomers getAllCustomersA(){
        GetAllCustomers getAllCustomers =getRetrofit().create(GetAllCustomers.class);
        return getAllCustomers;
    }

}
