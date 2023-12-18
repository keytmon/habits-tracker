package com.example.habitstracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.habitstracker.databinding.FragmentHabitsBinding
import com.example.habitstracker.rcview.HabitsListAdapter


class HabitsFragment : Fragment() {
private lateinit var binding: FragmentHabitsBinding
//    private val adapter = HabitsListAdapter()
//        get() = HabitsListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHabitsBinding.inflate(inflater, container, false)
        return binding.root
//        init()
    }
//        private fun init() {
//            binding.apply {
//                rcView.layoutManager = LinearLayoutManager(this@HabitsFragment)
//                rcView.adapter = adapter
//            }
//        }
    companion object {
        @JvmStatic
        fun newInstance() = HabitsFragment()
    }
}