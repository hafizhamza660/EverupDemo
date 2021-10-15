package com.example.everupdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface GetAllCustomers {
    @GET("customers")
    Call<List<AllCustomers>> getCustomer(@Header("Authorization") String barerToken);
}
