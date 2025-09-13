package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Highlights
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)


        val btn=findViewById<TextView>(R.id.editProfileBtn)

        val btn2=findViewById<FrameLayout>(R.id.view_highlights)
        val btn3=findViewById<FrameLayout>(R.id.view_highlights_again)


        val btn4=findViewById<ImageView>(R.id.buttonforhome)
        val btn5=findViewById<ImageView>(R.id.buttonforsearch)
        val btn6=findViewById<ImageView>(R.id.buttonforpost)
        val btn7=findViewById<ImageView>(R.id.buttonfornotif)

        val btn8=findViewById<ImageView>(R.id.backbutton)

        btn8.setOnClickListener {

            finish()
        }




        btn4.setOnClickListener {

            val intent=Intent(this,mainPage::class.java)
            startActivity(intent)
        }

        btn5.setOnClickListener {

            val intent=Intent(this,feed::class.java)
            startActivity(intent)
        }

        btn6.setOnClickListener {

            val intent=Intent(this, imageSelection::class.java)
            startActivity(intent)
        }

        btn7.setOnClickListener {

            val intent=Intent(this, requests::class.java)
            startActivity(intent)
        }


        btn3.setOnClickListener {

            val intent=Intent(this, highlight::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {

            val intent=Intent(this, highlight::class.java)
            startActivity(intent)
        }



        btn.setOnClickListener {

            val intent= Intent(this, editProfile::class.java)
            startActivity(intent)

        }

    }
}