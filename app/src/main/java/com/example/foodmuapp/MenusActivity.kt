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

        listMakanan.add(MakananModel("McFlurry", R.drawable.mcflurry, "Rp11.364"))
        listMakanan.add(MakananModel("Beef Burger", R.drawable.beefburger, "Rp11.364"))
        listMakanan.add(MakananModel("Big Mac", R.drawable.big_mac, "Rp22.364"))
        listMakanan.add(MakananModel("Fish Burger", R.drawable.fish_burger, "Rp11.364"))
        listMakanan.add(MakananModel("McChicken", R.drawable.mcchicken, "Rp11.364"))


        newRecyclerView = findViewById(R.id.rv_menu)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        listMakanan = arrayListOf()


        newRecyclerView.adapter = FoodItemAdapter()

    }

    }

