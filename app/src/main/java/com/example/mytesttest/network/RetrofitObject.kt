package com.example.mytesttest.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitObject {

    private const val BASE_URL = ""

    private var okHttpClient: OkHttpClient = OkHttpClient().newBuilder()
        .callTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
    }

    val apiService: Api by lazy {
        retrofitBuilder
            .build()
            .create(Api::class.java)
    }
}
//const val BASE_URL = "http://88.99.23.115/api/"

/*    private  val okHttpClient = OkHttpClient.Builder()
    .addInterceptor{chain ->
        val orginal = chain.request()
        val requestBuilder = orginal.newBuilder()
            .addHeader()
            .method(orginal.method(),orginal.body())
        val request = requestBuilder.build()
        chain.proceed(request)
    }*/