package com.example.mytesttest.network

import com.example.mytesttest.network.model.LoginDto
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("SignIn")
    suspend fun loginApi(
        @Field("PhoneNumber") PhoneNumber : String,
        @Field("Version") Version : String,
    ):LoginDto
}