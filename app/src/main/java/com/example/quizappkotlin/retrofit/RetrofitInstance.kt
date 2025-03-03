package com.example.quizappkotlin.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Headers

class RetrofitInstance {
    val baseUrl = "http://10.0.0.200/quizapp/"

    @Headers("Content-Type: application/json")
    fun getRetrofitInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}