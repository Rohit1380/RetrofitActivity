package com.rohit.retrofitactivity

import retrofit2.Retrofit

class RetrofitClass {
    lateinit var apiInterface: ApiInterface
    lateinit var retrofit: Retrofit

    fun getRetrofit() :ApiInterface{
        retrofit=Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v2/users/502")
            .build()
        apiInterface=retrofit.create(apiInterface::class.java)
        return apiInterface
    }
}