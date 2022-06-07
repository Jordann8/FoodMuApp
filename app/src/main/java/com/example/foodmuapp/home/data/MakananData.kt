package com.example.foodmuapp.home.data

import com.example.foodmuapp.R
import com.example.foodmuapp.home.model.MakananModel
import java.util.ArrayList

object MakananData {
    private val makananImage = intArrayOf(
        R.drawable.mcflurry,
        R.drawable.beefburger,
        R.drawable.mcchicken
    )
    val listData: ArrayList<MakananModel>
        get() {
            val list = arrayListOf<MakananModel>()
            for (position in makananImage.indices) {
                val makanan = MakananModel()
                makanan.makananImage = makananImage[position]
                list.add(makanan)
            }
            return list
        }
}
