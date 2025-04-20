package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextButton: Button = findViewById(R.id.next)  // favoritesButton
        nextButton.setOnClickListener {
            // Create an intent to go to the UserOnbordind1 screen
            val intent = Intent(this, Onboard3::class.java)
            startActivity(intent)
        }

        val nextButton2: Button = findViewById(R.id.skip)  // favoritesButton
        nextButton2.setOnClickListener {
            // Create an intent to go to the UserOnbordind1 screen
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}