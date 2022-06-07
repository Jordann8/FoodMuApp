package com.example.foodmuapp.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodmuapp.R
import com.example.foodmuapp.home.model.KategoriModel

class KategoriListAdapter(private val listKategori: ArrayList<KategoriModel>) :
    RecyclerView.Adapter<KategoriListAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvKategori: TextView = itemView.findViewById(R.id.tv_kategori)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_kategori, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKategori.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kategori = listKategori[position]
        Glide.with(holder.itemView)
            .load(kategori.KategoriText)
            .load(holder.tvKategori)
    }

}
