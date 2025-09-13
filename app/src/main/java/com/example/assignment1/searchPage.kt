package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class searchPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_page)

        val btn=findViewById<LinearLayout>(R.id.first)

        btn.setOnClickListener {

            val intent= Intent(this, profilenotfollowed::class.java)
            startActivity(intent)
        }

    }
}