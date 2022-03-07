package com.islamxpro.teachme

import adapters.MentorAdapterVideo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.islamxpro.teachme.databinding.FragmentProfileBinding
import models.MentorVisitUser

class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding
    lateinit var mentorAdapterVideoVisit: MentorAdapterVideo
    lateinit var list:ArrayList<MentorVisitUser>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)
        list = ArrayList()
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video1}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video2}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video3}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video4}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video5}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video6}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video7}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video9}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video1}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video2}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video3}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video4}"))
        list.add(MentorVisitUser("android.resource://${activity?.packageName}/${R.raw.video5}"))
        mentorAdapterVideoVisit = MentorAdapterVideo(list,object : MentorAdapterVideo.MyClick{
            override fun click(mentorUser: MentorVisitUser) {
                findNavController().navigate(R.id.mentorsVisitVideoProfile)
            }

        })
        binding.recycleProfileVideo.adapter = mentorAdapterVideoVisit
        return binding.root
    }

}