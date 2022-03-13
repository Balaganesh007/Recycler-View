package com.example.recyclerview.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerview.DisplayAdapter
import com.example.recyclerview.Model
import com.example.recyclerview.R
import com.example.recyclerview.databinding.FragmentDisplayBinding
import com.example.recyclerview.viewModel.DisplayViewModel

class DisplayFragment : Fragment() {
    private lateinit var viewModel: DisplayViewModel
    private lateinit var binding: FragmentDisplayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_display, container, false)
        viewModel = ViewModelProvider(this).get(DisplayViewModel::class.java)
        binding.displayViewModel = viewModel
        binding.lifecycleOwner = this


        val adapter = DisplayAdapter()
        binding.dataList.adapter = adapter
       /* adapter.data = listOf<Model>(
            Model(1, "Patrick","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(2, "White","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(3, "Patrick","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(4, "White","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(5, "Teresa","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(6, "Kathryn","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(7, "Teresa","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(8, "Kathryn","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(9, "Olivia","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(10, "Harry","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(11, "Olivia","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(12, "Harry","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(13, "nick","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(14, "nick","https://randomuser.me/api/portraits/women/91.jpg")
        )*/


        val a = listOf<Model>(
            Model(1, "Patrick","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(2, "White","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(3, "Patrick","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(4, "White","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(5, "Teresa","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(6, "Kathryn","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(7, "Teresa","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(8, "Kathryn","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(9, "Olivia","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(10, "Harry","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(11, "Olivia","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(12, "Harry","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(13, "nick","https://randomuser.me/api/portraits/women/91.jpg"),
            Model(14, "nick","https://randomuser.me/api/portraits/women/91.jpg")
        )
        adapter.submitList(a)


        return binding.root
    }
}