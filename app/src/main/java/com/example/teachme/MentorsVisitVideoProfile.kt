package com.example.teachme

import adapters.MentorAdapterVideoVisit
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import models.MentorVideoUser
import models.MentorVisitUser
import com.example.teachme.databinding.FragmentMentorsVisitVideoProfileBinding
import models.MentorUser
import java.lang.RuntimeException



class MentorsVisitVideoProfile : Fragment() {

    lateinit var binding: FragmentMentorsVisitVideoProfileBinding
    lateinit var mentorAdapterVideoVisit: MentorAdapterVideoVisit
    lateinit var list:ArrayList<MentorVideoUser>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMentorsVisitVideoProfileBinding.inflate(layoutInflater)
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        list = ArrayList()
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video1}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video2}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video3}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video4}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video5}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video6}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video7}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video8}","Sardor Qodirov",R.drawable.pic1))
        list.add(MentorVideoUser("android.resource://${activity?.packageName}/${R.raw.video9}","Sardor Qodirov",R.drawable.pic1))
       mentorAdapterVideoVisit = MentorAdapterVideoVisit(binding.root.context, list,object: MentorAdapterVideoVisit.MyClick{
           override fun click(mentorUser: MentorVideoUser) {

           }
       })
        binding.recycleMainVide.adapter = mentorAdapterVideoVisit

        return binding.root
    }

}