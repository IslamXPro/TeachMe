package com.example.teachme

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.passregistr.Utils.Back.isHome
import com.example.teachme.databinding.FragmentCreateAccountBinding
import com.google.android.material.snackbar.Snackbar


class CreateAccountFragment : Fragment() {

    lateinit var binding: FragmentCreateAccountBinding
    lateinit var handler: Handler

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateAccountBinding.inflate(layoutInflater)
        isHome = false
        handler = Handler()

        binding.apply {
            backBtn.setOnClickListener { findNavController().popBackStack() }
            btnSave.setOnClickListener {
                if (edtName.text.isNotEmpty() && edtSurname.text.isNotEmpty() && edtAge.text.isNotEmpty() && edtUsername.text.isNotEmpty()) {
                    waitAnim.visibility = View.VISIBLE
                    waitAnim.playAnimation()
                    Snackbar.make(root, "Yuklanmoqda kuting", Snackbar.LENGTH_LONG).show()
                    handler.postDelayed({
                        findNavController().navigate(R.id.homeFragment)
                        Snackbar.make(root, "Hush kelibsiz", Snackbar.LENGTH_LONG).show()
                    }, 3000)
                }else{Snackbar.make(root, "Ma'lumotlar to'liq emas", Snackbar.LENGTH_LONG).show()}
            }
        }

        return binding.root
    }
}