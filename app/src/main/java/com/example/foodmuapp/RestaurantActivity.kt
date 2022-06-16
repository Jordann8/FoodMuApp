package com.example.foodmuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.foodmuapp.databinding.ActivityRestaurantBinding


class RestaurantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_restaurant)
        binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imagelist = arrayListOf<SlideModel>()

        imagelist.add(SlideModel("https://nos.jkt-1.neo.id/mcdonalds/assets/ico/richlink.jpg"))
        imagelist.add(SlideModel("https://nos.jkt-1.neo.id/mcdonalds/assets/ico/richlink.jpg"))

        binding.isHeader.setImageList(imagelist, ScaleTypes.CENTER_CROP)

        binding.btBack.setOnClickListener(){
            val goBack = Intent(this, HomeActivity::class.java)
            startActivity(goBack)
        }

        binding.btMenu.setOnClickListener(){
           val goToMenu = Intent(this, MenusActivity::class.java)
            startActivity(goToMenu)
        }
    }


}