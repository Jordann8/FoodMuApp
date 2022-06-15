package com.example.foodmuapp.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.R

class FoodItemAdapter: RecyclerView.Adapter<FoodItemAdapter.ViewHolder>() {

    private var titles = arrayOf("McFlurry", "Burgerrr", "Big Mac", "PaNas 1", "PaNas 2", "Spritee", "McSpicy")

    private var details = arrayOf("McDonald's", "McDonald's", "McDonald's", "McDonald's", "McDonald's", "McDonald's", "McDonald's")

    private var images = intArrayOf(
        R.drawable.mcflurry,
        R.drawable.beefburger,
        R.drawable.big_mac,
        R.drawable.panas_1,
        R.drawable.panas_2,
        R.drawable.sprite,
        R.drawable.mcspicy
    )

    private var harga = arrayOf("Rp11.500", "Rp14.000", "Rp34.500", "Rp45.500", "Rp46.500", "Rp8.500", "Rp15.000")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: FoodItemAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemResto.text = details[position]
        holder.itemImage.setImageResource(images[position])
        holder.itemHarga.text = harga[position]
    }


    override fun getItemCount(): Int {
        return titles.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemResto: TextView
        var itemHarga: TextView

        init {
            itemImage = itemView.findViewById(R.id.iv_food)
            itemTitle = itemView.findViewById(R.id.tv_makanan)
            itemResto = itemView.findViewById(R.id.tv_restaurant)
            itemHarga = itemView.findViewById(R.id.tv_harga)
        }
    }
}



