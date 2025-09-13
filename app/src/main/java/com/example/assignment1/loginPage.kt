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

class loginPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        val btn=findViewById<TextView>(R.id.button2)

        val btn2=findViewById<LinearLayout>(R.id.button1)

        val btn3=findViewById<TextView>(R.id.signupbutton)

        btn3.setOnClickListener {

            val intent=Intent(this, Registration::class.java)
            startActivity(intent)
        }


        btn2.setOnClickListener {

            val intent=Intent(this, mainPage::class.java)
            startActivity(intent)
            finish()

        }

        btn.setOnClickListener {
            val intent = Intent(this, user_input::class.java)
            startActivity(intent)
        }
    }
}