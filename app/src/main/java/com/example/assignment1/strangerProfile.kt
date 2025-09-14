package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
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

        val btn1=findViewById<ImageView>(R.id.homebutton)
        val btn2=findViewById<ImageView>(R.id.searchbutton)
        val btn3=findViewById<ImageView>(R.id.postbutton)
        val btn4=findViewById<ImageView>(R.id.notifbutton)
        val btn5=findViewById<ImageView>(R.id.profilebutton)

        val btn6=findViewById<FrameLayout>(R.id.lasthighlight)

        val btn7=findViewById<ImageView>(R.id.backkbutton)

        btn7.setOnClickListener {
            finish()
        }

        btn6.setOnClickListener {

            val intent=Intent(this, highlight::class.java)
            startActivity(intent)
        }

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