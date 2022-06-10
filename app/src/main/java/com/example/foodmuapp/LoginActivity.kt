package com.example.foodmuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodmuapp.databinding.ActivityLoginBinding
import com.example.foodmuapp.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import android.text.TextWatcher
import com.google.android.gms.auth.api.signin.GoogleSignInOptions


class LoginActivity : AppCompatActivity() {




    //Tempat variable jangan di ganti2 yaa ^^ -Ajriel
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()




        binding.btRegister.setOnClickListener() {
            val goToRegister = Intent(this, RegisterActivity::class.java)
            startActivity(goToRegister)}

            binding.btLogin.setOnClickListener() {
                val etEmail = binding.etUsername.text.toString()
                val etPassword = binding.etPassword.text.toString()

                if (etEmail.isNullOrEmpty() && etPassword.isNullOrEmpty()){
                    Toast.makeText(this, "Please fill in the required fields", Toast.LENGTH_SHORT).show()

                }

                else{

                firebaseAuth.signInWithEmailAndPassword(etEmail, etPassword).addOnCompleteListener(){
                    if (it.isSuccessful){
                        val goToHome = Intent(this, HomeActivity::class.java)
                        startActivity(goToHome)
                        finish()
                    }
                    
                    else{
                        Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_SHORT).show()
                    }


                }

                    }



            }


        }
}



