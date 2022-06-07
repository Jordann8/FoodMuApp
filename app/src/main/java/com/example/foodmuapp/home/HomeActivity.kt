package com.example.foodmuapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.R
import com.example.foodmuapp.databinding.ActivityHomeBinding
import com.example.foodmuapp.home.adapter.KategoriListAdapter
import com.example.foodmuapp.home.data.MakananData
import com.example.foodmuapp.home.model.KategoriModel
import com.example.foodmuapp.home.model.MakananModel
import java.util.ArrayList

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        lateinit var rvKategori: RecyclerView

        rvKategori(findViewById(R.id.rv_kategori))
        rvRestaurant(findViewById(R.id.rv_restoran))
        rvMakanan(findViewById(R.id.rv_food))

        InitReyclerViewKategori()
        //InitReyclerViewRestaurant()
        //InitReyclerViewMakanan()

    }

    private fun InitReyclerViewKategori() {
        val list: ArrayList<KategoriModel> = arrayListOf()
    }


    }

    private fun rvMakanan(findViewById: Any) {
        TODO("Not yet implemented")
    }

    private fun rvRestaurant(findViewById: Any) {
        TODO("Not yet implemented")
    }

    private fun rvKategori(findViewById: Any) {
        TODO("Not yet implemented")
    }