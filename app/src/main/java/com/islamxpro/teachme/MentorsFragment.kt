package com.islamxpro.teachme

import adapters.MentorAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import Utils.Back.isHome
import com.islamxpro.teachme.databinding.FragmentMentorsBinding
import models.MentorUser


class MentorsFragment : Fragment() {

    lateinit var binding: FragmentMentorsBinding
    lateinit var mentorAdapter: MentorAdapter
    lateinit var list:ArrayList<MentorUser>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMentorsBinding.inflate(layoutInflater)
        list = ArrayList()
        isHome = false
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        val mentorUser = MentorUser()
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic1,"23.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic2,"23.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic3,"12.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic4,"54.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic5,"45.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic6,"23.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic7,"12.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic8,"23.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic9,"23.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic10,"86.1k obunachi",false))
        list.add(MentorUser("Sardor Qodirov",R.drawable.pic11,"2.1k obunachi",false))
        mentorAdapter = MentorAdapter(list,object : MentorAdapter.MyClick{
            override fun click(mentorUser: MentorUser) {
                findNavController().navigate(R.id.mentorsVisitProfile, bundleOf("mentor" to mentorUser))
            }
        })
        binding.recycleMentors.adapter = mentorAdapter
        return binding.root
    }

}