package com.example.retrofitforecaster

import retrofit2.Call
import retrofit2.http.*

interface RetrofitServices {
    @GET("forecast?q=Shklov&appid=11ad4916d5e0bd559cc8a336e4273ead&units=metric&lang=ru")
    fun getWeatherList(): Call<DataWeather>
}