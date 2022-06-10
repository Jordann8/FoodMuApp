package com.example.foodmuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmuapp.databinding.ActivityHomeBinding
import com.example.foodmuapp.home.adapter.FoodItemAdapter


class HomeActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<FoodItemAdapter.ViewHolder>? = null

    private lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.bottomNavbar.setItemSelected(R.id.nb_home)

        val mainFragment = MainFragment()
        val profileFragment = ProfileFragment()

        setFragment(mainFragment)

        binding.bottomNavbar.setOnItemSelectedListener {
            when(it){
                R.id.nb_profile -> {
                    setFragment(profileFragment)
                }
                R.id.nb_home -> {
                    setFragment(mainFragment)
                }
            }
        }



}

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }
    }

}



