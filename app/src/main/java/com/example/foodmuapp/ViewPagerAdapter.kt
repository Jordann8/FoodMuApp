package com.example.foodmuapp
import android.content.res.Resources
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.foodmuapp.LoginFragment
import com.example.foodmuapp.ProfileFragment
import com.google.firebase.auth.FirebaseAuth


class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle){
    private  lateinit var firebaseAuth: FirebaseAuth
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
         when(position){
            0 -> fragment = LoginFragment()
            1 -> fragment = RegisterFragment()

        }
        return fragment
    }

}