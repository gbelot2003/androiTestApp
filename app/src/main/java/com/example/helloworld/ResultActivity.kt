package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { onBackPressed() }
        getAndShowName()
    }

    fun getAndShowName() {
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        binding.tvGreetens.text = "Hola $name"
    }

}