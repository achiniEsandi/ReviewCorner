package com.example.labexam2

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextButton2: ImageView = findViewById(R.id.backArrow)  // favoritesButton
        nextButton2.setOnClickListener {
            // Create an intent to go to the  screen
            val intent = Intent(this, Home1::class.java)
            startActivity(intent)
        }

        val nextButton: Button = findViewById(R.id.logoutButton)  // favoritesButton
        nextButton.setOnClickListener {
            // Create an intent to go to the  screen
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


        val nextButton3: Button = findViewById(R.id.deleteButton)  // favoritesButton
        nextButton3.setOnClickListener {
            // Create an intent to go to the  screen
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}