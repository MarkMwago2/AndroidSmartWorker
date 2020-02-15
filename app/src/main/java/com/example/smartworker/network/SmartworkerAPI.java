package com.example.smartworker.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SmartworkerAPI {

    @FormUrlEncoded
    @POST("auth/register")
    Call<ResponseBody> registerUser(
            @Field("username") String username,
            @Field("email") String email,
            @Field("password") String password
    );

        Call<ResponseBody> registerUser();
}
