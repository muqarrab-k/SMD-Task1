package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class user_input : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_input)

        val btn=findViewById<LinearLayout>(R.id.loginbutton)

        val btn2=findViewById<TextView>(R.id.singUptoaccount)


        btn2.setOnClickListener {

            val intent=Intent(this, Registration::class.java)
            startActivity(intent)
            finish()


        }
        btn.setOnClickListener {
            val intent = Intent(this, loginPage::class.java)
            startActivity(intent)
            finish()


        }
    }
}