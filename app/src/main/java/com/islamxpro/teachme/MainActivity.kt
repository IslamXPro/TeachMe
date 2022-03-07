package com.islamxpro.teachme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import Utils.Back.isHome
import com.islamxpro.teachme.databinding.ActivityMainBinding

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