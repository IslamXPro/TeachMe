package com.islamxpro.teachme

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import Utils.Back.isHome
import Utils.Back.isRegistr
import com.islamxpro.teachme.databinding.FragmentSplashBinding

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
            if (isRegistr) {
                findNavController().navigate(R.id.mainFragment)
            } else {
                findNavController().navigate(R.id.signInFragment)
            }
        }, 3000)

        isHome = false
        return binding.root
    }

}