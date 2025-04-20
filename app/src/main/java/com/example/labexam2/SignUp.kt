package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextButton2: Button = findViewById(R.id.signInButton)  // favoritesButton
        nextButton2.setOnClickListener {
            // Create an intent to go to the UserOnbordind1 screen
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val next: TextView = findViewById(R.id.loginTextView)  // favoritesButton
        next.setOnClickListener {
            // Create an intent to go to the UserOnbordind1 screen
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}