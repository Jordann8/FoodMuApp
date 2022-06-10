package com.example.foodmuapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodmuapp.databinding.ActivityLoginBinding
import com.example.foodmuapp.databinding.FragmentMainBinding
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
        
        binding.tvChange.setOnClickListener{
            Toast.makeText(context, "amonggagas", Toast.LENGTH_SHORT).show()
        }
            
            
    }



        }



