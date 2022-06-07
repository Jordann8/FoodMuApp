package com.example.foodmuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodmuapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLogin.setOnClickListener(){
            if (binding.etUsername.text.isNullOrEmpty() && binding.etPassword.text.isNullOrEmpty()){
                Toast.makeText(this, "Please fill out the required form", Toast.LENGTH_SHORT).show()

            }

            else {

                if (binding.etUsername.text.toString() == "admin" && binding.etPassword.text.toString() == "admin"){
                    Toast.makeText(this, "bener banget bang", Toast.LENGTH_SHORT).show()
                    
                }
                
                else{
                    Toast.makeText(this, "salah woi", Toast.LENGTH_SHORT).show()
                    
                }
            }

        }





    }
}