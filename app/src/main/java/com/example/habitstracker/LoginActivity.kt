package com.example.habitstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.habitstracker.databinding.ActivityMainBinding
import com.example.habitstracker.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = MainDb.getDb(this)
        binding.buttonStart.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            val item = Item(null,
                binding.edLog.text.toString(),
                binding.edPass.text.toString()
            )
            Thread{
                db.getDao().insertItem(item)
            }.start()
        }
    }
}