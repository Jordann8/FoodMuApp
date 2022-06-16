package com.example.foodmuapp.home.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.R
import com.example.foodmuapp.home.MakananModel

class FoodItemAdapter(val context : Context, val listModel: ArrayList<MakananModel>, val callback: AdapterMakananCallback)
    : RecyclerView.Adapter<FoodItemAdapter.ViewHolderMakanan>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolderMakanan {
        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.item_row_food_plus, viewGroup, false)


        return ViewHolderMakanan(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolderMakanan, position: Int) {
        viewHolder.onBind(listModel[position])
    }


    override fun getItemCount(): Int {
        return listModel.size
    }


    inner class ViewHolderMakanan(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView
        val itemTitle: TextView
        val itemResto: TextView
        val itemHarga: TextView
        val textTotal: TextView

        init {
            itemImage = itemView.findViewById(R.id.iv_food)
            itemTitle = itemView.findViewById(R.id.tv_makanan)
            itemResto = itemView.findViewById(R.id.tv_restaurant)
            itemHarga = itemView.findViewById(R.id.tv_harga)
            textTotal = itemView.findViewById(R.id.product_selectedQuantity)

            itemView.findViewById<ImageView>(R.id.ic_minus)
                .setOnClickListener {
                    Log.d("sini", "sana")
                    // jika jumlah pada urutan ke "adapterPosition" lebih dari 0
                    if (listModel[adapterPosition].jumlah > 0) {
                        // mengurangi pada urutan ke "adapterPosition"
                        listModel[adapterPosition].jumlah = listModel[adapterPosition].jumlah - 1
                        notifyItemChanged(adapterPosition)

                        callback.ketikaJumlahBerubah(adapterPosition)
                    }
                }

            // atur ketika plus di tap
            itemView.findViewById<ImageView>(R.id.ic_plus)
                .setOnClickListener {
                    // menambahkan pada urutan ke "adapterPosition"
                    listModel[adapterPosition].jumlah = listModel[adapterPosition].jumlah + 1
                    notifyItemChanged(adapterPosition)

                    callback.ketikaJumlahBerubah(adapterPosition)
                }
        }

        fun onBind(model: MakananModel) {
            itemImage.setImageResource(model.gambar)
            itemTitle.text = model.title
            itemResto.text = model.resto
            itemHarga.text = "Rp ${model.harga}"
            textTotal.text = "${model.jumlah}"


        }
    }
    interface AdapterMakananCallback {
        fun ketikaJumlahBerubah(position: Int)
    }

}



