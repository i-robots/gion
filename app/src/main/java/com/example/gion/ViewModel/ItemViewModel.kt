package com.example.gion.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.gion.R
import com.example.gion.domain.Product

class ItemViewModel(application: Application) : AndroidViewModel(application){
    val allItems: List<Product>

    init {
        val endomin = Product("Endomin",  R.mipmap.endomin,7)
        val oil = Product("Oil",  R.mipmap.oil,7)
        val mama = Product("Mama",  R.mipmap.mama,7)
        val extra = Product("extra",  R.mipmap.extra,7)
        val hometate = Product("hometate",  R.mipmap.homtate,7)
        val maya = Product("maya",  R.mipmap.maya,7)


        val kop = Product("Kop",  R.mipmap.kop,6)
        val arial = Product("Arial",R.mipmap.arial,6)
        val splash = Product("Splash",R.mipmap.splash,6)
        val toilet = Product("Toilet",  R.mipmap.toilet,6)
        val towel = Product("Towel",  R.mipmap.homtate,6)
        val colgate = Product("colgate",  R.mipmap.colgate,6)
        val fota = Product("fota",R.mipmap.fota,6)

        val phone = Product("phone",R.mipmap.phone,9)

        val flash = Product("flash",  R.mipmap.flash,2)
        val hhdplayer = Product("hhd player",  R.mipmap.hhdplayer,2)
        val pc = Product("pc",  R.mipmap.pc,2)
        val projector = Product("Projector",R.mipmap.projector,2)
        val remote = Product("Remote",R.mipmap.remote,2)
        val tv = Product("TV",  R.mipmap.tv,2)
        val smartTv = Product("smart Tv",R.mipmap.splash,2)
        val bg = Product("projector background",  R.mipmap.bg,2)

        val skirt = Product("skirt",R.mipmap.splash,0)

        val showerco = Product("shower co",  R.mipmap.showerco,3)
        val showercover = Product("shower cover",R.mipmap.showercover,3)
        val showermentaf = Product("mentaf",R.mipmap.showermentaf,3)
        val showermes = Product("shower Mes",R.mipmap.showermes,3)
        allItems = arrayListOf(endomin,oil,mama,extra,hometate,maya,kop,arial,splash,toilet,towel,colgate,fota,phone,flash,
            hhdplayer,pc,projector,remote,tv,smartTv,bg,skirt,showerco,showercover,showermentaf,showermes)
    }
}
