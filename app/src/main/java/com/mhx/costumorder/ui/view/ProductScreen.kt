package com.mhx.costumorder.ui.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mhx.costumorder.ui.viewmodel.ProductViewModel

@Composable
fun ProductScreen(viewModel: ProductViewModel = viewModel()) {
    if (viewModel.isLoading){
        CircularProgressIndicator()
    }else{
        LazyColumn {    
            items(viewModel.products){ product ->
                Text(text = product.name)
                Text(text = "${product.base_price} DA")

                product.customization_categories.forEach{ category ->
                    Text(text = category.name)
                    category.customizations.forEach{ customization ->
                        Text(text = customization.name)
                    }
                }
            }
        }
    }
}
