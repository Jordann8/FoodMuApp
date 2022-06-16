package com.example.foodmuapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.databinding.FragmentMainBinding
import com.example.foodmuapp.home.MakananModel
import com.example.foodmuapp.home.adapter.FoodItemAdapter
import com.example.foodmuapp.home.adapter.FoodItemPlusAdapter
import kotlinx.android.synthetic.main.activity_login.*

class MainFragment : Fragment() {
    private  var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var listMakananPlus: ArrayList<MakananModel>
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


        }


        listMakananPlus = arrayListOf()
        listMakananPlus = ArrayList()

        listMakananPlus.add(MakananModel("McFlurry", gambar = R.drawable.mcflurry,11500, "McDonald's"))
        listMakananPlus.add(MakananModel("Burgerr", gambar = R.drawable.beefburger, 14500, "McDonald's"))
        listMakananPlus.add(MakananModel("PaNas 1", gambar = R.drawable.panas_1,45500, "McDonald's"))
        listMakananPlus.add(MakananModel("Big Mac", gambar = R.drawable.big_mac, 22500, "McDonald's"))
        listMakananPlus.add(MakananModel("PaNas 2", gambar = R.drawable.panas_2,46000, "McDonald's"))
        listMakananPlus.add(MakananModel("Spritee", gambar = R.drawable.sprite,8500, "McDonald's"))
        listMakananPlus.add(MakananModel("McSpicy", gambar = R.drawable.mcspicy,15000, "McDonald's"))
        listMakananPlus.add(MakananModel("McChicken", gambar = R.drawable.mcchicken,18000, "McDonald's"))

        newRecyclerView = binding.rvMenu
        newRecyclerView.layoutManager = LinearLayoutManager(context)
        newRecyclerView.setHasFixedSize(true)

        newRecyclerView.adapter = FoodItemPlusAdapter(requireContext(), listMakananPlus)

    }

}



