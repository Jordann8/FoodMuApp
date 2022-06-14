package com.example.foodmuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodmuapp.databinding.ActivityChangeNameBinding
import com.example.foodmuapp.databinding.ActivityRestaurantBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ChangeNameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChangeNameBinding
    private  lateinit var firebaseAuth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_name)
        binding = ActivityChangeNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val uid = firebaseAuth.currentUser?.uid
        firebaseAuth = FirebaseAuth.getInstance()
        databaseReference = FirebaseDatabase.getInstance().getReference("Users")

        binding.btEdit.setOnClickListener(){
            val name = binding.etEditnama.text.toString()
            val user = Data(name)

            if (uid != null){
                databaseReference.child(uid).setValue(user).addOnCompleteListener(){

                    if (it.isSuccessful){
                        Toast.makeText(this, "Update successful", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(this, "Update failed", Toast.LENGTH_SHORT).show()
                    }
                    

                }
            }

        }



    }
}