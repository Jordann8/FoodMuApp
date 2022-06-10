package com.example.foodmuapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.foodmuapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private  var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    )

            : View {

            _binding = FragmentProfileBinding.inflate(inflater, container, false)
            return binding.root


        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        binding.btEdit.setOnClickListener{
            val editProfile = Intent(context, DetailProfileActivity::class.java)
            startActivity(editProfile)
        }
            
            
    }



        }



