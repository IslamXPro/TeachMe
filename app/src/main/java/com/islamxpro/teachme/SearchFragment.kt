package com.islamxpro.teachme

import adapters.SearchAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import Utils.Back.isHome
import com.islamxpro.teachme.databinding.FragmentSearchBinding
import models.SearchUser


class SearchFragment : Fragment() {

    lateinit var binding: FragmentSearchBinding
    lateinit var list:ArrayList<SearchUser>
    lateinit var searchAdapter: SearchAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(layoutInflater)
        onResume()
        //back (назад) qilganda programmadan chiqib ketadi.
        isHome = true


        return binding.root
    }

    override fun onResume() {
        super.onResume()
        list = ArrayList()
        list.add(SearchUser(R.drawable.pic11,"Sardor Qodirov","Super Photoshop kursi","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic12,"Sardor Qodirov","3D max professionallikga birinchi qadam","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic13,"Sardor Qodirov","Marketing: 0 dan 100 gacha","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic14,"Sardor Qodirov","3D max professionallikga birinchi qadam","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic1,"Sardor Qodirov","Super Photoshop kursi","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic2,"Sardor Qodirov","Marketing: 0 dan 100 gacha","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic3,"Sardor Qodirov","3D max professionallikga birinchi qadam","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic4,"Sardor Qodirov","Super Photoshop kursi","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic5,"Sardor Qodirov","Marketing: 0 dan 100 gacha","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic6,"Sardor Qodirov","3D max professionallikga birinchi qadam","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic7,"Sardor Qodirov","Super Photoshop kursi","48 daq","17k o'quvchi"))
        list.add(SearchUser(R.drawable.pic8,"Sardor Qodirov","Marketing: 0 dan 100 gacha","48 daq","17k o'quvchi"))

        searchAdapter = SearchAdapter(list,object : SearchAdapter.MyClick{
            override fun click(searchUser: SearchUser) {
                Toast.makeText(context, "Clicked ${searchUser.courseName}", Toast.LENGTH_SHORT).show()
            }
        })
        binding.recycleSearch.adapter = searchAdapter
    }

}