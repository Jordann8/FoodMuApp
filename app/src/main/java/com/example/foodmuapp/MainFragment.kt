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
import com.example.foodmuapp.home.MakananPlusModel
import com.example.foodmuapp.home.adapter.FoodItemAdapter
import kotlinx.android.synthetic.main.activity_login.*

class MainFragment : Fragment() {
    private  var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var listMakananPlus: ArrayList<MakananPlusModel>
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

        listMakananPlus.add(MakananPlusModel("McFlurry", R.drawable.mcflurry,"Rp11.500", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("Burgerr", R.drawable.beefburger, "Rp14.000", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("Big Mac", R.drawable.big_mac, "Rp22.500", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("PaNas 1", R.drawable.panas_1,"Rp45.500", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("PaNas 2", R.drawable.panas_2,"Rp46.000", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("Spritee", R.drawable.sprite,"Rp8.500", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("McSpicy", R.drawable.mcspicy,"Rp15.000", "McDonald's"))
        listMakananPlus.add(MakananPlusModel("McChicken", R.drawable.mcchicken,"Rp18.000", "McDonald's"))

        newRecyclerView = binding.rvMenu
        newRecyclerView.layoutManager = LinearLayoutManager(context)
        newRecyclerView.setHasFixedSize(true)

        newRecyclerView.adapter = FoodItemAdapter(requireContext(), listMakananPlus)

    }

}



