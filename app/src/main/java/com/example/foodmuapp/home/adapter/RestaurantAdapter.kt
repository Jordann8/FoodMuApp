package com.example.foodmuapp.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodmuapp.R
import com.example.foodmuapp.home.RestaurantModel


class RestaurantAdapter(private val listRestaurantBinding: ArrayList<RestaurantModel>) :
    RecyclerView.Adapter<RestaurantAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.cover)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_resto, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listRestaurantBinding.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val restaurant = listRestaurantBinding[position]
        Glide.with(holder.itemView)
            .load(restaurant.id)
            .load(holder.imgPhoto)
            .load(restaurant.name)
    }


}