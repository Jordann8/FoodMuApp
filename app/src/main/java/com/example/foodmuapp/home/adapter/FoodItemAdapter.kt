package com.example.foodmuapp.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.R

class FoodItemAdapter: RecyclerView.Adapter<FoodItemAdapter.ViewHolder>() {

    private var titles = arrayOf("McFlurry", "Beef Burger", "McFlurry", "McFlurry", "McFlurry")

    private var details = arrayOf("McDonald", "McDonald", "McDonald", "McDonald", "McDonald")

    private var images = intArrayOf(
        R.drawable.mcflurry,
        R.drawable.beefburger,
        R.drawable.mcflurry,
        R.drawable.mcflurry,
        R.drawable.mcflurry
    )

    private var harga = arrayOf("Rp11.364", "Rp11.364", "Rp11.364", "Rp11.364", "Rp11.364")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: FoodItemAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
        holder.itemHarga.text = harga[position]
    }


    override fun getItemCount(): Int {
        return titles.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemHarga: TextView

        init {
            itemImage = itemView.findViewById(R.id.iv_food)
            itemTitle = itemView.findViewById(R.id.tv_makanan)
            itemDetail = itemView.findViewById(R.id.tv_restaurant)
            itemHarga = itemView.findViewById(R.id.tv_harga)
        }
    }
}



