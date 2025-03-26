package com.mhx.costumorder.model

data class CustomizationCategory(
    val customizations: List<Customization>,
    val id: Int,
    val name: String,
    val product: Int
)