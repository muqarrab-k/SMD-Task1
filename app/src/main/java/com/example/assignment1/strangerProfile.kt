package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class strangerProfile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stranger_profile)

        val btn1=findViewById<ImageView>(R.id.homiebutton)
        val btn2=findViewById<ImageView>(R.id.searchiebutton)
        val btn3=findViewById<ImageView>(R.id.postiebutton)
        val btn4=findViewById<ImageView>(R.id.notifiebutton)
        val btn5=findViewById<ImageView>(R.id.profiliebutton)

        btn1.setOnClickListener {

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

            val intent= Intent(this, requests::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {

            val intent= Intent(this, profile::class.java)
            startActivity(intent)
        }




    }
}