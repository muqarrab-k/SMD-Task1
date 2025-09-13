package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)


        val btn=findViewById<LinearLayout>(R.id.createAccount)

        btn.setOnClickListener {

            val intent= Intent(this, loginPage::class.java)
            startActivity(intent)
            finish()

        }
    }
}