package com.example.teachme

import adapters.MainRecycleAdapter
import adapters.MainRecycleAdapter2
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.passregistr.Utils.Back.isHome
import com.example.teachme.databinding.FragmentHomeBinding
import models.CourseUser


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var list:ArrayList<CourseUser>
    lateinit var list2:ArrayList<CourseUser>
    lateinit var mainRecycleAdapter: MainRecycleAdapter
    lateinit var mainRecycleAdapter2: MainRecycleAdapter2
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        onResume()
    /*    binding.viewpager.adapter = ViewPagerAdapter(parentFragmentManager)
        binding.viewpager.setOnTouchListener(OnTouchListener { arg0, arg1 -> true })*/
        isHome = true

        binding.btnThis.setOnClickListener {
            findNavController().navigate(R.id.mentorsFragment)
        }



     /*   binding.homeBtn.setOnClickListener{
            binding.viewpager.currentItem = 0
        }
        binding.searchBtn.setOnClickListener{
            binding.viewpager.currentItem = 1
        }
        binding.courseBtn.setOnClickListener{
            binding.viewpager.currentItem = 2
        }
        binding.chatBtn.setOnClickListener{
            binding.viewpager.currentItem = 3
        }
        binding.profileBtn.setOnClickListener{
            binding.viewpager.currentItem = 4
        }*/

        return binding.root

    }

    override fun onResume() {
        super.onResume()
        list = ArrayList()
        list2 = ArrayList()
        list.add(CourseUser(R.drawable.pic1,R.drawable.pic1,"Sardor Qodirov","Grafik Dizayn", "Super Photoshop","6 soat 48 daqiqa - 48 ta dars", false))
        list.add(CourseUser(R.drawable.pic2,R.drawable.pic2,"Miraziz Ahmedov","FrontEnd", "Web dizayn","6 soat 48 daqiqa - 48 ta dars", false))
        list.add(CourseUser(R.drawable.pic3,R.drawable.pic3,"Asror Iskandarov","BackEnd", "Web BackEnd","6 soat 48 daqiqa - 48 ta dars", false))
        list.add(CourseUser(R.drawable.pic4,R.drawable.pic4,"Jahongir Pulatov","Python", "Telegram bot","6 soat 48 daqiqa - 48 ta dars", false))
        list.add(CourseUser(R.drawable.pic5,R.drawable.pic5,"Sardor Qodirov","Grafik Dizayn", "Super Photoshop","6 soat 48 daqiqa - 48 ta dars", false))

        list2.add(CourseUser(R.drawable.pic10,R.drawable.pic10,"Sardor Qodirov","Grafik Dizayn", "Super Photoshop","6 soat 48 daqiqa - 48 ta dars", false))
        list2.add(CourseUser(R.drawable.pic9,R.drawable.pic9,"Jahongir Pulatov","Python", "Telegram bot","6 soat 48 daqiqa - 48 ta dars", false))
        list2.add(CourseUser(R.drawable.pic8,R.drawable.pic8,"Asror Iskandarov","BackEnd", "Web BackEnd","6 soat 48 daqiqa - 48 ta dars", false))
        list2.add(CourseUser(R.drawable.pic7,R.drawable.pic7,"Miraziz Ahmedov","FrontEnd", "Web dizayn","6 soat 48 daqiqa - 48 ta dars", false))
        list2.add(CourseUser(R.drawable.pic6,R.drawable.pic6,"Sardor Qodirov","Grafik Dizayn", "Super Photoshop","6 soat 48 daqiqa - 48 ta dars", false))

        mainRecycleAdapter = MainRecycleAdapter(list,object : MainRecycleAdapter.MyClick{
            override fun click(courseUser: CourseUser) {
                Toast.makeText(context, "Clicked ${courseUser.courseName}", Toast.LENGTH_SHORT).show()
            }
        })
        mainRecycleAdapter2 = MainRecycleAdapter2(list2,object : MainRecycleAdapter2.MyClick{
            override fun click(courseUser: CourseUser) {
                Toast.makeText(context, "Clicked ${courseUser.courseName}", Toast.LENGTH_SHORT).show()
            }
        })
        binding.rvTavsiya.adapter = mainRecycleAdapter
        binding.rvKopkorilgan.adapter = mainRecycleAdapter2
    }
}