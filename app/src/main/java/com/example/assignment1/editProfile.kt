package com.example.assignment1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class editProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)


        val btn=findViewById<TextView>(R.id.done)

        val btn2=findViewById<TextView>(R.id.cancel)

        btn2.setOnClickListener {

            finish()
        }

        btn.setOnClickListener {

            finish()
        }
    }
}