package com.mhx.costumorder.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://restaurant-backend-tdw1.onrender.com/"

    val instance : CostumOrderApi by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CostumOrderApi::class.java)
    }
}