package com.example.getuserdetails

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET("api/users/{id}")
    fun getUser(@Path("id")id: Int): Call<ResponseDTO>
}