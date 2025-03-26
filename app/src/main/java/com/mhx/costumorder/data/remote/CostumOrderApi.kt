package com.mhx.costumorder.data.remote

import com.mhx.costumorder.model.Product
import retrofit2.http.GET

interface CostumOrderApi {
    @GET("api/product/")
    suspend fun getProduct():List<Product>

}