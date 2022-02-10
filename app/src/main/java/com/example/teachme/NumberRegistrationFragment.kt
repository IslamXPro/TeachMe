package com.example.teachme

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.passregistr.Utils.Back
import com.example.teachme.databinding.FragmentNumberRegistrationBinding
import com.google.android.material.snackbar.Snackbar

class NumberRegistrationFragment : Fragment() {

    lateinit var binding: FragmentNumberRegistrationBinding
    lateinit var handler: Handler
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNumberRegistrationBinding.inflate(layoutInflater)

        handler = Handler()

        Back.isHome = false

        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
            btnTasdiqlash.setOnClickListener {
                waitAnim.visibility = View.VISIBLE
                waitAnim.playAnimation()
                Snackbar.make(root,"Yuklanmoqda kuting", Snackbar.LENGTH_LONG).show()
                handler.postDelayed({
                    findNavController().navigate(R.id.createAccountFragment)
                }, 3000)
            }
        }

        return binding.root
    }
}