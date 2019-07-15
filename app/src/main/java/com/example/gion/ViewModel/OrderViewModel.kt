package com.example.gion.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.gion.domain.Order

class OrderViewModel (application: Application) : AndroidViewModel(application){
    var allOrder : List<Order>

    init {
        allOrder = arrayListOf(Order("Endome",46,1500), Order("verz",96,500))
    }
}