package com.example.teachme

import adapters.MyExtandableAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teachme.databinding.FragmentCourseVisitBinding
import models.ChildUser
import models.CourseInfo

class CourseVisitFragment : Fragment() {

    lateinit var binding: FragmentCourseVisitBinding
    lateinit var myExtandableAdapter: MyExtandableAdapter
    lateinit var map:HashMap<String, List<ChildUser>>
    lateinit var titleList:ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCourseVisitBinding.inflate(layoutInflater)
         titleList = ArrayList()
        map = HashMap()

        titleList.add("Codial 2-3")
        titleList.add("Codial 4")
        titleList.add("Codial 5")
        titleList.add("Codial 6")

        map[titleList[0]] = listOf(ChildUser("android.resource://${activity?.packageName}/${R.raw.video1}","1 dars","kdnfsknfkasnf"))
        map[titleList[1]] = listOf(ChildUser("android.resource://${activity?.packageName}/${R.raw.video2}","1 dars","kdnfsknfkasnf"))
        map[titleList[2]] = listOf(ChildUser("android.resource://${activity?.packageName}/${R.raw.video3}","1 dars","kdnfsknfkasnf"))
        map[titleList[3]] = listOf(ChildUser("android.resource://${activity?.packageName}/${R.raw.video4}","1 dars","kdnfsknfkasnf"))

        /*
        var list = arguments?.getSerializable("course") as CourseInfo*/
        myExtandableAdapter = MyExtandableAdapter(titleList,map)
        binding.expend.setAdapter(myExtandableAdapter)

        return binding.root
    }

}