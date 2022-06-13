package com.example.foodmuapp

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.foodmuapp.databinding.ActivityLoginBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {




    //Tempat variable jangan di ganti2 yaa ^^ -Ajriel
    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private  lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        with(binding){
            vpLoginregister.adapter = viewPagerAdapter
            TabLayoutMediator(tlLoginregister, vpLoginregister) { tab, position ->
                when (position) {
                    0 -> tab.text = "Log in"
                    1 -> tab.text = "Register"
                }
            }.attach()
        }






    }
}



