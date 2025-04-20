package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class BookDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /// Bottom Navigation: Handle ALL items
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Already on Home, do nothing (or refresh)
                    startActivity(Intent(this, Home1::class.java))
                    true
                }
                R.id.profile -> {
                    startActivity(Intent(this, Profile::class.java))
                    true
                }
                //R.id.tips -> {
                //startActivity(Intent(this, SettingsActivity::class.java))
                //true
                //}
                //R.id.save -> {
                //startActivity(Intent(this, SaveActivity::class.java))
                //true
                //}
                else -> false
            }
        }

        val bookArrow: ImageView = findViewById(R.id.backarrow)
        bookArrow.setOnClickListener {
            // Redirect to Books activity
            val intent = Intent(this, Books::class.java)
            startActivity(intent)
        }


    }
}