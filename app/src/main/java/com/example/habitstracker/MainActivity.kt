package com.example.habitstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.habitstracker.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.habits -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.navigation_host_fragment, HabitsFragment.newInstance())
                        .commit()
                }
                R.id.statistics -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.navigation_host_fragment, StatisticsFragment.newInstance())
                        .commit()
                }
                R.id.achievements -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.navigation_host_fragment, AchievementsFragment.newInstance())
                        .commit()
                }
            }
            true
        }
    }
}


