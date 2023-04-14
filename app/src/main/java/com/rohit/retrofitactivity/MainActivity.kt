package com.rohit.retrofitactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var retrofitClass: RetrofitClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println("in on create")

        var retrofitClass:Call<UserModel> =RetrofitClass().getRetrofit().getUserInfo()
        retrofitClass.enqueue(object :Callback<UserModel>{
            override fun onResponse
                        (call: Call<UserModel>, response: Response<UserModel>) {

                    System.out.println("in response body ${response.body()}")
                    System.out.println("in response ${response}")
                    var UserResponse = response.body()
                    System.out.println("UserRespone ${UserResponse?.id}")
                }


            override fun onFailure(call: Call<UserModel>, t: Throwable) {
                System.out.println("in failure ${t.message}")
            }
            })
        }
}