package com.example.esteplogic_android.posttorecyclerview;

import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Call;

/**
 * Created by Belal on 11/5/2015.
 */

public interface RegisterAPI
{
    @POST("/hotshel")
    @Headers({"Content-Type: application/json"})
    Call<Example> insertUser(@Header("auth") String authkey);
}