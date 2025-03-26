package com.mhx.costumorder.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mhx.costumorder.data.remote.RetrofitClient
import com.mhx.costumorder.model.Product
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {
    var products by mutableStateOf<List<Product>>(emptyList())
    var isLoading by mutableStateOf(true)

    init {
        viewModelScope.launch {
            try {
                products = RetrofitClient.instance.getProduct()
            } catch (e: Exception) {
                Log.e("ProductViewModel", "Error: ${e.message}")
            } finally {
                isLoading = false
            }
        }
    }
}
