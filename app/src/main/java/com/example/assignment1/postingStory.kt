package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class postingStory : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_posting_story)


        val btn=findViewById<ImageView>(R.id.newstory)

        val btn2=findViewById<ImageView>(R.id.closepostingstory)

        btn2.setOnClickListener {

            finish()
        }

        btn.setOnClickListener {

            val intent= Intent(this, postedStory::class.java)
            startActivity(intent)
            finish()
        }

    }
}