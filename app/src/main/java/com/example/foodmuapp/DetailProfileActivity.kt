package com.example.foodmuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodmuapp.databinding.ActivityDetailProfileBinding
import com.example.foodmuapp.databinding.FragmentMainBinding
import com.google.firebase.auth.FirebaseAuth

private lateinit var binding: ActivityDetailProfileBinding
private lateinit var auth: FirebaseAuth

class DetailProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        binding = ActivityDetailProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()
        val uid = auth.currentUser?.uid


    }
}