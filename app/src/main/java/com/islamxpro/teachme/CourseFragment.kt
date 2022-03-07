package com.islamxpro.teachme

import adapters.CourseAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import Utils.Back.isHome
import com.islamxpro.teachme.databinding.FragmentCourseBinding
import models.CourseInfo


class CourseFragment : Fragment() {

    lateinit var binding: FragmentCourseBinding
    lateinit var courseAdapter: CourseAdapter
    lateinit var list: ArrayList<CourseInfo>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCourseBinding.inflate(layoutInflater)
        isHome = true

        list = ArrayList()
        list.add(CourseInfo(R.drawable.pic1,R.drawable.pic1,"Sardor Qodirov","Super Photoshop kursi","0 dan professionallikga qadam","320 000 so'm","325 marta"))
        list.add(CourseInfo(R.drawable.pic2,R.drawable.pic2,"Alisher Zokirov","Android bo'yicha ko'nikmalar","2 oy davomida professional o'rganinig","300 000 so'm","192 marta"))
        list.add(CourseInfo(R.drawable.pic3,R.drawable.pic3,"Sardor Qodirov","Super Photoshop kursi","0 dan professionallikga qadam","250 000 so'm","115 marta"))
        list.add(CourseInfo(R.drawable.pic4,R.drawable.pic4,"Alisher Zokirov","Android bo'yicha ko'nikmalar","2 oy davomida professional o'rganinig","350 000 so'm","231 marta"))
        list.add(CourseInfo(R.drawable.pic5,R.drawable.pic5,"Sardor Qodirov","Super Photoshop kursi","0 dan professionallikga qadam","200 000 so'm","98 marta"))

        courseAdapter = CourseAdapter(binding.root.context,list,object : CourseAdapter.MyClick{
            override fun click(courseInfo: CourseInfo) {
                findNavController().navigate(R.id.courseVisitFragment, bundleOf(
                    "course" to courseInfo
                ))
                Toast.makeText(binding.root.context, "Cliked ${courseInfo.courseName}", Toast.LENGTH_SHORT).show()
            }
        })
        binding.recycleMainCourse.adapter = courseAdapter
        return binding.root
    }
}