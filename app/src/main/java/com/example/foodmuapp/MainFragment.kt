package com.example.foodmuapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.databinding.ActivityHomeBinding
import com.example.foodmuapp.databinding.FragmentMainBinding
import com.example.foodmuapp.databinding.FragmentProfileBinding
import com.example.foodmuapp.home.MakananModel
import com.example.foodmuapp.home.adapter.FoodItemAdapter

class MainFragment : Fragment() {
    private  var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var listMakanan: ArrayList<MakananModel>
    private lateinit var newRecyclerView: RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    )

            : View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardViewMcd.setOnClickListener{
            val goToMCD = Intent(context, RestaurantActivity::class.java)
            startActivity(goToMCD)

            listMakanan = arrayListOf()


            listMakanan.add(MakananModel("McFlurry", gambar = R.drawable.mcflurry, "Rp11.500"))
            listMakanan.add(MakananModel("Burger", gambar = R.drawable.beefburger, "Rp14.000"))
            listMakanan.add(MakananModel("Big Mac", gambar = R.drawable.big_mac, "Rp34.500"))
            listMakanan.add(MakananModel("PaNas 1", gambar = R.drawable.panas_1, "Rp45.500"))
            listMakanan.add(MakananModel("PaNas 2", gambar = R.drawable.panas_2, "Rp46.500"))
            listMakanan.add(MakananModel("Sprite", gambar = R.drawable.sprite, "Rp8.500"))


            newRecyclerView = binding.rvMenu
            newRecyclerView.layoutManager = LinearLayoutManager(context)
            newRecyclerView.setHasFixedSize(true)


            newRecyclerView.adapter = FoodItemAdapter()

        }

    }

}



