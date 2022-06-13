package com.example.foodmuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.home.MakananModel
import com.example.foodmuapp.home.adapter.FoodItemAdapter

class MenusActivity : AppCompatActivity() {
    private lateinit var listMakanan: ArrayList<MakananModel>
    private lateinit var newRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)

        listMakanan = arrayListOf()


        listMakanan.add(MakananModel("McFlurry", gambar = R.drawable.mcflurry, "Rp11.364"))
        listMakanan.add(MakananModel("Burger", gambar = R.drawable.beefburger, "Rp11.364"))
        listMakanan.add(MakananModel("Big Mac", gambar = R.drawable.big_mac, "Rp22.364"))


        newRecyclerView = findViewById(R.id.rv_menu)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)


        newRecyclerView.adapter = FoodItemAdapter()

    }


}

