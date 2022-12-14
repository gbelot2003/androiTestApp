package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowName.setOnClickListener{
            checkValue()
        }
    }

    private fun checkValue(){
        if (binding.etName.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.etName.text)
            startActivity(intent)
        } else {
            showErrorName()
        }
    }

    private fun showErrorName(){
        Toast.makeText(this, "El nombre del usuario no puede estar vacio", Toast.LENGTH_SHORT).show()
    }
}