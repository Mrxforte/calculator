package com.example.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        plus button onclick handler
        binding.plus.setOnClickListener() {
            var num1 = binding.firstNumber.text.toString().toInt()
            var num2 = binding.secondNumber.text.toString().toInt()
            binding.result.text = "Result: ${num1 + num2}"
        }

//

        binding.minus.setOnClickListener() {
            var num1 = binding.firstNumber.text.toString().toInt()
            var num2 = binding.secondNumber.text.toString().toInt()
            binding.result.text = "Result: ${num1 - num2}"
        }
        binding.multiply.setOnClickListener() {
            var num1 = binding.firstNumber.text.toString().toInt()
            var num2 = binding.secondNumber.text.toString().toInt()
            binding.result.text = "Result: ${num1 * num2}"
        }
        binding.devision.setOnClickListener() {
            var num1 = binding.firstNumber.text.toString().toInt()
            var num2 = binding.secondNumber.text.toString().toInt()
            binding.result.text = "Result: ${num1 / num2}"
        }
    }
}