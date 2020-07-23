package com.example.detroyt


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button: Button = findViewById(R.id.button)
        Button.setOnClickListener { lol() }

    }


    private fun lol() {
        setContentView(R.layout.knickerbocker)
        val back : Button= findViewById(R.id.button2)
        back.setOnClickListener {loll()}
    }

    private fun loll() {
        setContentView(R.layout.activity_main)
    }
}


