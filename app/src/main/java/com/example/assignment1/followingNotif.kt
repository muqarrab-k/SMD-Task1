package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class followingNotif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val btn=findViewById<ImageView>(R.id.buttonhome)
        val btn2=findViewById<ImageView>(R.id.buttonsearch)
        val btn3=findViewById<ImageView>(R.id.buttonpost)
        val btn4=findViewById<ImageView>(R.id.buttonprofile)

        btn.setOnClickListener {

            val intent= Intent(this, mainPage::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {

            val intent= Intent(this, feed::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {

            val intent= Intent(this, imageSelection::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {

            val intent= Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}