package com.example.teachme

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.passregistr.Utils.Back
import com.example.passregistr.Utils.Back.isHome
import com.example.teachme.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    lateinit var handler: Handler
    lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(layoutInflater)

        handler = Handler()
        handler.postDelayed({
            findNavController().navigate(R.id.mainFragment)
        }, 3000)

        isHome = false
        return binding.root
    }

}