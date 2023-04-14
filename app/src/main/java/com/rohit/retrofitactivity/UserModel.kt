package com.rohit.retrofitactivity


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserModel(
    @Json(name = "email")
    val email: String?=null,
    @Json(name = "gender")
    val gender: String?=null,
    @Json(name = "id")
    val id: Int?=0,
    @Json(name = "name")
    val name: String?=null,
    @Json(name = "status")
    val status: String?=null
)