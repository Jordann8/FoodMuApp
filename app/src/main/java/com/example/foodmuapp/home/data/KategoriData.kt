package com.example.foodmuapp.home.data

import com.example.foodmuapp.R
import com.example.foodmuapp.home.model.KategoriModel
import com.example.foodmuapp.home.model.MakananModel
import java.util.ArrayList

object KategoriData {
    private val kategoriText = intArrayOf(
        R.string.food_text,
        R.string.drink_text,
        R.string.desert_text
    )
    val listData: ArrayList<KategoriModel>
        get() {
            val list = arrayListOf<KategoriModel>()
            for (position in kategoriText.indices) {
                val kategori = MakananModel()
                kategori.makananImage = kategoriText[position]
                list.add(kategori)
            }
            return list
        }
}



