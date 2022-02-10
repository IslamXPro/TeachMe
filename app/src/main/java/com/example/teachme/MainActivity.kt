package com.example.teachme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.example.passregistr.Utils.Back.isHome
import com.example.teachme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

/*           binding.homeBtn.setOnClickListener{
            startActivity(Intent(this,HomeFragment::class.java))
        }
        binding.searchBtn.setOnClickListener{
            startActivity(Intent(this,SearchFragment::class.java))
        }
        binding.courseBtn.setOnClickListener{
            startActivity(Intent(this,CourseFragment::class.java))
        }
        binding.chatBtn.setOnClickListener{
            startActivity(Intent(this,ChatFragment::class.java))
        }
        binding.profileBtn.setOnClickListener{
            startActivity(Intent(this,ProfileFragment::class.java))
        }*/

    }
    override fun onBackPressed() {
        if (isHome) {
            finish()
        } else {
            super.onBackPressed()
        }
    }


}