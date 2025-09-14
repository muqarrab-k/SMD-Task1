package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class capture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_capture)

        val btn=findViewById<FrameLayout>(R.id.capture_button)

        val btn2=findViewById<ImageView>(R.id.next_icon)

        btn2.setOnClickListener {

            finish()
        }


        btn.setOnClickListener {

            val intent= Intent(this, postingStory::class.java)
            startActivity(intent)
            finish()
        }

    }
}