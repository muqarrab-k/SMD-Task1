package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class message : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_message)


        val btn1=findViewById<LinearLayout>(R.id.firstmessage)
        val btn2=findViewById<LinearLayout>(R.id.secondmessage)
        val btn3=findViewById<LinearLayout>(R.id.thirdmessage)
        val btn4=findViewById<LinearLayout>(R.id.fourthmessage)

        val btn5=findViewById<ImageView>(R.id.gobackagain)

        btn5.setOnClickListener {

            finish()
        }

        btn1.setOnClickListener {

            val intent= Intent(this, dm::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {

            val intent= Intent(this, dm::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {

            val intent= Intent(this, dm::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {

            val intent= Intent(this, dm::class.java)
            startActivity(intent)
        }




    }
}