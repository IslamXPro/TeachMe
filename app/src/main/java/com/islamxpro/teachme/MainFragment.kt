package com.islamxpro.teachme

import adapters.ViewPagerAdapter
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.islamxpro.teachme.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding


    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)

        binding.viewpager.adapter = ViewPagerAdapter(parentFragmentManager)
        //Scrolln qilishni o'chirish
        //binding.viewpager.setOnTouchListener(View.OnTouchListener { arg0, arg1 -> true })

        binding.viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        isClick(false)
                        binding.homeIc.setImageResource(R.drawable.home_ic_click)
                    }
                    1 -> {
                        isClick(false)
                        binding.searchIc.setImageResource(R.drawable.search_ic_click)
                    }
                    2 -> {
                        isClick(false)
                        binding.courseIc.setImageResource(R.drawable.course_ic_click)
                    }
                    3 -> {
                        isClick(false)
                        binding.chatIc.setImageResource(R.drawable.chat_ic_click)
                    }
                    4 -> {
                        isClick(false)
                        binding.profileIc.setImageResource(R.drawable.profile_ic_click)
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        binding.homeBtn.setOnClickListener {
            binding.viewpager.currentItem = 0
            isClick(false)
            binding.homeIc.setImageResource(R.drawable.home_ic_click)
        }
        binding.searchBtn.setOnClickListener {
            binding.viewpager.currentItem = 1
            isClick(false)
            binding.searchIc.setImageResource(R.drawable.search_ic_click)
        }
        binding.courseBtn.setOnClickListener {
            binding.viewpager.currentItem = 2
            isClick(false)
            binding.courseIc.setImageResource(R.drawable.course_ic_click)
        }
        binding.chatBtn.setOnClickListener {
            binding.viewpager.currentItem = 3
            isClick(false)
            binding.chatIc.setImageResource(R.drawable.chat_ic_click)
        }
        binding.profileBtn.setOnClickListener {
            binding.viewpager.currentItem = 4
            isClick(false)
            binding.profileIc.setImageResource(R.drawable.profile_ic_click)
        }

        return binding.root
    }

    fun isClick(off:Boolean){
        if (off){
        }else{
            binding.homeIc.setImageResource(R.drawable.home_ic)
            binding.searchIc.setImageResource(R.drawable.search_ic)
            binding.courseIc.setImageResource(R.drawable.course_ic)
            binding.chatIc.setImageResource(R.drawable.chat_ic)
            binding.profileIc.setImageResource(R.drawable.profile_ic)
        }
    }

}