package com.example.habitstracker

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.habitstracker.databinding.FragmentAchievementsBinding

class AchievementsFragment : Fragment() {
private lateinit var binding: FragmentAchievementsBinding
    companion object {
        fun newInstance() = AchievementsFragment()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAchievementsBinding.inflate(inflater, container, false)
        return binding.root
    }


}