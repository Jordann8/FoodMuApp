package com.example.foodmuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodmuapp.databinding.ActivityLoginBinding
import com.example.foodmuapp.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    fun Register(){
        val goToRegister = Intent(this, RegisterActivity::class.java)
        startActivity(goToRegister)
    }


    //Tempat variable jangan di ganti2 yaa ^^ -Ajriel
    private lateinit var binding: ActivityRegisterBinding
   // private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btRegister.setOnClickListener{
            //variable yang udah di set untuk jadi string (sama aja jangan di ganti2 ^^) -Ajriel
            val etEmail = binding.etEmail.text.toString()
            val etPassword = binding.etPassword.text.toString()
            val etNomor = binding.etPhonenumber.text.toString()
            val etUsername = binding.etUsername.text.toString()

            if (etEmail.isNullOrEmpty() && etPassword.isNullOrEmpty() && etNomor.isNullOrEmpty() && etUsername.isNullOrEmpty()){
                Toast.makeText(this, "Please fill in the required field", Toast.LENGTH_SHORT).show()
            }

            else{
               // firebaseAuth.createUserWithEmailAndPassword(etEmail, etPassword).addOnCompleteListener{
                  val goToHome = Intent(this, HomeActivity::class.java)
                    startActivity(goToHome)
                }
            }

        }
    }
