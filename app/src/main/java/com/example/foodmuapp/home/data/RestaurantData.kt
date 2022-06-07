package com.example.foodmuapp.home.data

import com.example.foodmuapp.R
import com.example.foodmuapp.home.model.RestaurantModel
import java.util.ArrayList

object RestaurantData {
    private val restaurantImage = intArrayOf(
        R.drawable.bg_resto,
        R.drawable.bg_resto2
    )
    val listData: ArrayList<RestaurantModel>
        get() {
            val list = arrayListOf<RestaurantModel>()
            for (position in restaurantImage.indices) {
                val restaurant = RestaurantModel()
                restaurant.restaurantImage = restaurantImage[position]
                list.add(restaurant)
            }
            return list
        }
}