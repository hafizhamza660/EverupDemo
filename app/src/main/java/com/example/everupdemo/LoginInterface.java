package com.example.everupdemo;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface LoginInterface {


    @POST("users/login")
    Call<LoginResponse> getLogin(@Header("Authorization") String authHeader);

}
