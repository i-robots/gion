package com.example.gion.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.gion.R
import com.example.gion.domain.Product

class ProductViewModel(application: Application) : AndroidViewModel(application) {
    val allProducts: List<Product>

    init {
        val womens = Product("Women Cloth",  R.mipmap.womens,0)
        val produc = Product("Men Cloth", R.mipmap.mens,1)
        val produ = Product("Electronics", R.mipmap.electronics,2)
        val shower = Product("shower Equ",  R.mipmap.shower,3)
        val pro = Product("Jwelery", R.mipmap.jewels,4)
        val shoebag = Product("shoes and bag", R.mipmap.shoe_bag,5)
        val p = Product("Home",R.mipmap.home,6)
        val food = Product("foods",R.mipmap.endomin,7)
        val children = Product("Chldren",R.mipmap.photo,8)
        val phones = Product("Phones",R.mipmap.phones,9)
        allProducts = arrayListOf(womens,produc,produ,shower,pro,shoebag,p,food,children,phones)
    }
}