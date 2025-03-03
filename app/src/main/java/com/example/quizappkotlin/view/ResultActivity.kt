package com.example.quizappkotlin.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.quizappkotlin.R
import com.example.quizappkotlin.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding : ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_result)

        binding.txtAnswer.text = "Your Score is: "+MainActivity.result +"/"+MainActivity.totalQuestions

        binding.btnBack.setOnClickListener(){

            val intent = Intent(this@ResultActivity , MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}