package com.example.foodmuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodmuapp.databinding.ActivityLoginBinding
import com.example.foodmuapp.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    //Tempat variable jangan di ganti2 yaa ^^ -Ajriel {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        //Tombol back yang redirect ke login page{

        binding.tbRegister.setNavigationOnClickListener {
            val goToLogin = Intent(this, LoginActivity::class.java)
            startActivity(goToLogin)}


        //Coding firebase dan verifikasi form register

        binding.btRegister.setOnClickListener{
            //variable yang udah di set untuk jadi string (sama aja jangan di ganti2 ^^) -Ajriel
             val etEmail = binding.etEmail.text.toString()
             val etPassword = binding.etPassword.text.toString()
             val etNomor = binding.etPhonenumber.text.toString()
             val etUsername = binding.etUsername.text.toString()
             val cbTAC = binding.checkBox1


            if (etEmail.isNullOrEmpty() && etPassword.isNullOrEmpty() && etNomor.isNullOrEmpty() && etUsername.isNullOrEmpty() ){
                Toast.makeText(this, "Please fill in the required fields", Toast.LENGTH_SHORT).show()
            }

            else{

                //authentikasi firebase
                firebaseAuth.createUserWithEmailAndPassword(etEmail, etPassword).addOnCompleteListener{
                   if(it.isSuccessful){
                           val goToHome = Intent(this, HomeActivity::class.java)
                           startActivity(goToHome)}
                       }
                      
                   }

                   if (etPassword.length < 6 ){
                       Toast.makeText(this, "Please use the minimum 6 characters in your password", Toast.LENGTH_SHORT).show()

                   }


                 if (!cbTAC.isChecked) {
                     Toast.makeText(this, "Please agree to our terms and condition", Toast.LENGTH_SHORT).show()
            }

            else{
                val goToHome = Intent(this, HomeActivity::class.java)
                startActivity(goToHome)
            }

        }
}}

