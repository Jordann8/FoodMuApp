package com.example.foodmuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.R
import com.example.foodmuapp.databinding.ActivityHomeBinding
import com.example.foodmuapp.databinding.ActivityLoginBinding
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
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //belum bisa dipakai sementara ^^ -Ajriel
        binding.rvRestoran.setOnClickListener(){
           val goToRestaurant = Intent(this, RestaurantActivity::class.java)
            startActivity(goToRestaurant)
        }


    }

}