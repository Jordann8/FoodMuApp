package com.example.foodmuapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodmuapp.databinding.FragmentLoginBinding
import com.example.foodmuapp.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterFragment : Fragment() {
    private  var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    private  lateinit var firebaseAuth: FirebaseAuth


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    )

            : View {

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()




        //Coding firebase dan verifikasi form register

        binding.btRegister.setOnClickListener{
            //variable yang udah di set untuk jadi string (sama aja jangan di ganti2 ^^) -Ajriel
            val etEmail = binding.etUsername.text.toString()
            val etPassword = binding.etPassword.text.toString()
            val etNomor = binding.etPhoneregist.text.toString()
            val etUsername = binding.etUsername.text.toString()
            val cbTAC = binding.checkBox1


            if (etEmail.isNullOrEmpty() && etPassword.isNullOrEmpty() && etNomor.isNullOrEmpty() && etUsername.isNullOrEmpty() ){
                Toast.makeText(context, "Please fill in the required fields", Toast.LENGTH_SHORT).show()
            }

            else{

                //authentikasi firebase
                firebaseAuth.createUserWithEmailAndPassword(etEmail, etPassword).addOnCompleteListener{
                    if(it.isSuccessful){
                        val goToHome = Intent(context, HomeActivity::class.java)
                        startActivity(goToHome)}
                }

            }

            if (etPassword.length < 6 ){
                Toast.makeText(context, "Please use the minimum 6 characters in your password", Toast.LENGTH_SHORT).show()

            }


            if (!cbTAC.isChecked) {
                Toast.makeText(context, "Please agree to our terms and condition", Toast.LENGTH_SHORT).show()
            }

            else{
                val goToHome = Intent(context, HomeActivity::class.java)
                startActivity(goToHome)
            }

        }



    }



}

