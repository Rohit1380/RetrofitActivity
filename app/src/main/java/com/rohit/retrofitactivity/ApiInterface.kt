package com.rohit.retrofitactivity

import UserResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET


interface ApiInterface {
    @GET("user/502")
    fun getUserInfo():Call<UserResponse>
}