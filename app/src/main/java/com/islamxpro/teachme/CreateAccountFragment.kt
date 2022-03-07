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
import android.annotation.SuppressLint
import android.net.Uri
import androidx.activity.result.contract.ActivityResultContracts
import com.islamxpro.teachme.databinding.FragmentCreateAccountBinding
import com.google.android.material.snackbar.Snackbar
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.*


class CreateAccountFragment : Fragment() {

    lateinit var binding: FragmentCreateAccountBinding
    lateinit var handler: Handler
    private var image: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateAccountBinding.inflate(layoutInflater)
        isHome = false
        handler = Handler()

        binding.userImg.setOnClickListener {
            getImageCount.launch("image/*")
        }

        binding.apply {
            backBtn.setOnClickListener { findNavController().popBackStack() }
            btnSave.setOnClickListener {
                if (edtName.text.isNotEmpty() && edtSurname.text.isNotEmpty() && edtAge.text.isNotEmpty() && edtUsername.text.isNotEmpty()) {
                    waitAnim.visibility = View.VISIBLE
                    waitAnim.playAnimation()
                    Snackbar.make(root, "Yuklanmoqda kuting", Snackbar.LENGTH_LONG).show()
                    handler.postDelayed({
                        findNavController().navigate(R.id.mainFragment)
                        Snackbar.make(root, "Hush kelibsiz", Snackbar.LENGTH_LONG).show()
                        isRegistr = true
                    }, 3000)
                }else{Snackbar.make(root, "Ma'lumotlar to'liq emas", Snackbar.LENGTH_LONG).show()}
            }
        }

        return binding.root
    }
    @SuppressLint("SimpleDateFormat")
    private val getImageCount =
        registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri ->
            uri
            binding.userImg.setImageURI(uri)
            val inputStream = activity?.contentResolver?.openInputStream(uri)
            val simpleDateFormat = SimpleDateFormat("yyyy|MM|dd_HH:mm:ss").format(Date())
            val file = File(activity?.filesDir, "${simpleDateFormat}image.jpg")
            val fileOutputStream = FileOutputStream(file)
            inputStream?.copyTo(fileOutputStream)
            inputStream?.close()
            fileOutputStream.close()
            image = file.absolutePath
        }
}