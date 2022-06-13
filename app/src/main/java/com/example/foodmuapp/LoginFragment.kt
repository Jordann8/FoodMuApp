package com.example.foodmuapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodmuapp.databinding.FragmentLoginBinding
import com.example.foodmuapp.databinding.FragmentMainBinding
import com.google.firebase.auth.FirebaseAuth


class LoginFragment : Fragment() {
    private  var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private  lateinit var firebaseAuth: FirebaseAuth


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    )

            : View {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firebaseAuth = FirebaseAuth.getInstance()




        binding.btLogin.setOnClickListener() {

            val etEmail = binding.etUsername.text.toString()
            val etPassword = binding.etPassword.text.toString()

            if (etEmail.isNullOrEmpty() || etPassword.isNullOrEmpty()){
                Toast.makeText(context, "Please fill in the required fields", Toast.LENGTH_SHORT).show()



            }



            else{

                firebaseAuth.signInWithEmailAndPassword(etEmail, etPassword).addOnCompleteListener(){
                    if (it.isSuccessful){
                        val goToHome = Intent(context, HomeActivity::class.java)
                        startActivity(goToHome)
                    } else{
                        Toast.makeText(context, "Incorrect username or password", Toast.LENGTH_SHORT).show()
                    }


                }

            }



        }



    }



}

