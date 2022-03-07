package com.islamxpro.teachme

import android.os.Bundle
import android.os.Handler
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import Utils.Back.isHome
import com.islamxpro.teachme.databinding.FragmentSignInBinding
import com.google.android.material.snackbar.Snackbar


class SignInFragment : Fragment() {

    lateinit var binding: FragmentSignInBinding
    lateinit var handler: Handler
    var isShow = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(layoutInflater)
        isHome = true
        handler = Handler()

        binding.apply {
            btnEnter.setOnClickListener {
                if (edtEmail.text.isNotEmpty() && edtParol.text.isNotEmpty()) {
                    waitAnim.visibility = View.VISIBLE
                    waitAnim.playAnimation()
                    Snackbar.make(root, "Tekshirilmoqda...", Snackbar.LENGTH_LONG).show()
                    handler.postDelayed({
                        Snackbar.make(root, "Bunday foydalanuvchi topilmadi", Snackbar.LENGTH_LONG).show()
                        waitAnim.visibility = View.GONE
                        waitAnim.cancelAnimation()
                        edtEmail.text.clear()
                        edtParol.text.clear()
                    }, 2000)
                }
            }
            btnRegister.setOnClickListener { findNavController().navigate(R.id.registerFragment) }
            seePswrdBtn.setOnClickListener {
                if (isShow) {
                    //parolni ko'rsatadi
                    edtParol.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    edtParol.setSelection(edtParol.length())
                    isShow = false
                } else {
                    //parolni qayta ko'rsatmedigon qiladi
                    edtParol.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                    edtParol.setSelection(edtParol.length())
                    isShow = true
                }
            }
        }

        return binding.root
    }
}