package com.islamxpro.teachme

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import Utils.Back.isHome
import com.islamxpro.teachme.databinding.FragmentRegisterBinding
import com.google.android.material.snackbar.Snackbar

class RegisterFragment : Fragment() {

    lateinit var binding: FragmentRegisterBinding
    lateinit var handler: Handler

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        isHome = false

        binding.apply {
            backBtn.setOnClickListener { findNavController().popBackStack() }
            emailSignBtn.setOnClickListener {
                findNavController().navigate(R.id.createAccountFragment)
                Snackbar.make(binding.root, "Email orqali kirildi (test)", Snackbar.LENGTH_LONG).show()
            }
            facebookSignBtn.setOnClickListener {
                findNavController().navigate(R.id.createAccountFragment)
                Snackbar.make(binding.root, "Facebook orqali kirildi (test)", Snackbar.LENGTH_LONG).show()
            }
            numberSignBtn.setOnClickListener {
                findNavController().navigate(R.id.numberRegistrationFragment)
                Snackbar.make(binding.root, "Telefon orqali kirildi (test)", Snackbar.LENGTH_LONG).show()
            }
        }

        return binding.root
    }
}