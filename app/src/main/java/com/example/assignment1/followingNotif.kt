package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class followingNotif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_following_notif)


        val btn=findViewById<ImageView>(R.id.buttonhomeicon)
        val btn2=findViewById<ImageView>(R.id.buttonsearchicon)
        val btn3=findViewById<ImageView>(R.id.buttonposticon)
        val btn4=findViewById<ImageView>(R.id.buttonprofileicon)
        val btn5=findViewById<LinearLayout>(R.id.youbutton)

        btn5.setOnClickListener {

            val intent=Intent(this, requests::class.java)
            startActivity(intent)
            finish()

        }

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