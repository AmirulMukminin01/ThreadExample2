package com.example.threadexample2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.threadexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.btnStartThread.setOnClickListener {
            startThread()
        }
    }
    private fun startThread() {
        val runnable = ExampleThread(10)
        Thread(runnable).start()
    }
}