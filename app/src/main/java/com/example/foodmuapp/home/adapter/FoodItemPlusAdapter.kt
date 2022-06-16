package com.example.foodmuapp.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.R
import com.example.foodmuapp.home.MakananModel
import com.google.android.material.card.MaterialCardView

class FoodItemPlusAdapter(val context: Context, val listModelPLus: ArrayList<MakananModel>)
    : RecyclerView.Adapter<FoodItemPlusAdapter.ViewHolderMakananPlus>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FoodItemPlusAdapter.ViewHolderMakananPlus {
        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.item_row_food_plus, viewGroup, false)


        return FoodItemPlusAdapter.ViewHolderMakananPlus(view)
    }

    class ViewHolderMakananPlus(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(model: MakananModel) {
            itemImage.setImageResource(model.gambar)
            itemTitle.text = model.title
            itemResto.text = model.resto
            itemHarga.text = "Rp ${model.harga}"
            btnCount.visibility = View.GONE

        }

        val itemImage: ImageView
        val itemTitle: TextView
        val itemResto: TextView
        val itemHarga: TextView
        val btnCount: MaterialCardView

        init {
            itemImage = itemView.findViewById(R.id.iv_food)
            itemTitle = itemView.findViewById(R.id.tv_makanan)
            itemResto = itemView.findViewById(R.id.tv_restaurant)
            itemHarga = itemView.findViewById(R.id.tv_harga)
            btnCount= itemView.findViewById(R.id.btn_count)
        }

    }

    override fun onBindViewHolder(holder: FoodItemPlusAdapter.ViewHolderMakananPlus, position: Int) {
        holder.onBind(listModelPLus[position])
    }

    override fun getItemCount(): Int {
        return listModelPLus.size
    }


}