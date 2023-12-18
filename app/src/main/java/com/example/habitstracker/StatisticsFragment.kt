package com.example.habitstracker

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.habitstracker.databinding.FragmentStatisticsBinding

class StatisticsFragment : Fragment() {
private lateinit var binding: FragmentStatisticsBinding
    companion object {
        fun newInstance() = StatisticsFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        return binding.root
    }



}