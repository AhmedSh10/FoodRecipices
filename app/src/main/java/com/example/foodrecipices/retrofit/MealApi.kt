package com.example.foodrecipices.retrofit

import com.example.foodrecipices.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {

    @GET("random.php")
    fun getRandomMeal(): Call<MealList>

}