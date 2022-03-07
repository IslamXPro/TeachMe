package com.islamxpro.teachme

import adapters.MentorAdapterVideo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.islamxpro.teachme.databinding.FragmentMentorsVisitProfileBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_mentors_visit_profile.view.*
import models.MentorUser
import models.MentorVisitUser


class MentorsVisitProfile : Fragment() {

    lateinit var binding: FragmentMentorsVisitProfileBinding
    lateinit var mentorAdapterVideo: MentorAdapterVideo
    lateinit var list:ArrayList<MentorVisitUser>
    var isClick = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMentorsVisitProfileBinding.inflate(layoutInflater)
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
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

        binding.smsBtnToMentor.setOnClickListener {
            findNavController().navigate(R.id.chatFragment, bundleOf("chatMentor" to MentorUser()))
        }
        binding.notificationBtn.setOnClickListener {
            if (isClick) {
                Snackbar.make(binding.root, "Notification On", Snackbar.LENGTH_LONG).show()
                binding.notificationBtn.setImageResource(R.drawable.notification_ic_full)
                isClick = false
            }else{
                Snackbar.make(binding.root, "Notification Off", Snackbar.LENGTH_LONG).show()
                binding.notificationBtn.setImageResource(R.drawable.notification_ic)
                isClick = true
            }
        }

        mentorAdapterVideo = MentorAdapterVideo(list,object : MentorAdapterVideo.MyClick{
            override fun click(mentorUser: MentorVisitUser) {
                findNavController().navigate(R.id.mentorsVisitVideoProfile)
            }

        })
        binding.recycleProfileVideo.adapter = mentorAdapterVideo
        return binding.root
    }
}