package com.example.foodmuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.databinding.ActivityMenusBinding
import com.example.foodmuapp.home.MakananModel
import com.example.foodmuapp.home.adapter.FoodItemAdapter
import kotlinx.android.synthetic.main.activity_menus.*

class MenusActivity : AppCompatActivity() {
    private lateinit var listMakanan: ArrayList<MakananModel>
    private lateinit var newRecyclerView: RecyclerView

    private lateinit var binding: ActivityMenusBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)
        binding = ActivityMenusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listMakanan = arrayListOf()
        listMakanan = ArrayList()

        listMakanan.add(MakananModel("McFlurry", gambar = R.drawable.mcflurry,"Rp11.500", "McDonald's"))
        listMakanan.add(MakananModel("Burgerr", gambar = R.drawable.beefburger, "Rp14.000", "McDonald's"))
        listMakanan.add(MakananModel("Big Mac", gambar = R.drawable.big_mac, "Rp22.500", "McDonald's"))
        listMakanan.add(MakananModel("PaNas 1", gambar = R.drawable.panas_1,"Rp45.500", "McDonald's"))
        listMakanan.add(MakananModel("PaNas 2", gambar = R.drawable.panas_2,"Rp46.000", "McDonald's"))
        listMakanan.add(MakananModel("Spritee", gambar = R.drawable.sprite,"Rp8.500", "McDonald's"))
        listMakanan.add(MakananModel("McSpicy", gambar = R.drawable.mcspicy,"Rp15.000", "McDonald's"))
        listMakanan.add(MakananModel("McChicken", gambar = R.drawable.mcchicken,"Rp18.000", "McDonald's"))

        newRecyclerView = findViewById(R.id.rv_menu_plus)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newRecyclerView.adapter = FoodItemAdapter(this, listMakanan,)

        btn_order_menu.setOnClickListener {
            val listMakanan: ArrayList<MakananModel> = arrayListOf()

            listMakanan.forEach {
                if (it.jumlah > 0) {
                    listMakanan.add(it)
                }
            }

            if (listMakanan.size == 0) {
                Toast.makeText(this, "Harap pilih makanan terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, KeranjangActivity::class.java)

                intent.putExtra("makanan", listMakanan)

                startActivity(intent)
            }
        }
        binding.tbMenu.setNavigationOnClickListener(){
            val goBack = Intent(this, HomeActivity::class.java)
            startActivity(goBack)
        }

    }

}

