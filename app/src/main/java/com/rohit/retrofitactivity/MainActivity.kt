package com.rohit.retrofitactivity

import UserResponse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    lateinit var retrofitClass: RetrofitClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retrofitClass:Call<UserResponse> =RetrofitClass().getRetrofit().getUserInfo()
        retrofitClass.enqueue(object :Callback<UserResponse>{
            override fun onResponse
                        (call: Call<UserResponse>, response: Response<UserResponse>) {

                    System.out.println("in response body ${response.body()}")
                    System.out.println("in response ${response}")
                    var UserResponse = response.body()
                    System.out.println("UserRespone ${UserResponse?.id}")
                }


            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                System.out.println("in failure ${t.message}")
            }
            })

        }
}