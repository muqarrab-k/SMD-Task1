package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class message : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_message)

        val btn1=findViewById<LinearLayout>(R.id.first)
        val btn2=findViewById<LinearLayout>(R.id.second)
        val btn3=findViewById<LinearLayout>(R.id.third)
        val btn4=findViewById<LinearLayout>(R.id.fourth)




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