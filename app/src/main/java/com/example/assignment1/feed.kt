package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class feed : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feed)

        val btn=findViewById<EditText>(R.id.username_input)

        val btn2=findViewById<ImageView>(R.id.homebutton)

        val btn3=findViewById<ImageView>(R.id.notificationsbutton)

        val btn4=findViewById<ImageView>(R.id.profilebutton)

        val btn5=findViewById<ImageView>(R.id.postbutton)

        btn5.setOnClickListener {

            val intent=Intent(this, imageSelection::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {

            val intent=Intent(this,mainPage::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {

            val intent=Intent(this, requests::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {

            val intent=Intent(this,profile::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {

            val intent= Intent(this, searchPage::class.java)
            startActivity(intent)
        }



    }
}