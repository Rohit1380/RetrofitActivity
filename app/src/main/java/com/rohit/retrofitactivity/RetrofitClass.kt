package com.rohit.retrofitactivity

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitClass {
    lateinit var apiInterface: ApiInterface
    lateinit var retrofit: Retrofit

    fun getRetrofit() :ApiInterface{
        retrofit=Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        apiInterface=retrofit.create(ApiInterface::class.java)
        return apiInterface
    }
}