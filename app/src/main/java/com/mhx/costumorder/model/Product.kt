package com.mhx.costumorder.model

data class Product(
    val base_price: Int,
    val category: String,
    val customization_categories: List<CustomizationCategory>,
    val id: Int,
    val name: String
)