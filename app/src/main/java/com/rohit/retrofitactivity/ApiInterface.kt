package com.rohit.retrofitactivity

import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {
    @GET("users/528")
    fun getUserInfo():Call<UserModel>
}