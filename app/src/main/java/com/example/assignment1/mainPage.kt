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

class mainPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_page)

        val btn=findViewById<ImageView>(R.id.searchButton)

        val btn2=findViewById<ImageView>(R.id.postStory)

        val btn3=findViewById<ImageView>(R.id.notifications)

        val btn4=findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.myprofile)

        val btn5=findViewById<FrameLayout>(R.id.mystory)

        val btn6=findViewById<FrameLayout>(R.id.friendStory)

        val btn7=findViewById<ImageView>(R.id.directmessage)

        btn7.setOnClickListener {

            val intent=Intent(this,message::class.java)
            startActivity(intent)
        }


        btn6.setOnClickListener {

            val intent=Intent(this, story::class.java)
            startActivity(intent)
        }



        btn5.setOnClickListener {

            val intent=Intent(this, postingStory::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {

            val intent=Intent(this,profile::class.java)
            startActivity(intent)

        }

        btn3.setOnClickListener {

            val intent=Intent(this,requests::class.java)
            startActivity(intent)

        }

        btn2.setOnClickListener {

            val intent=Intent(this,imageSelection::class.java)
            startActivity(intent)

        }

        btn.setOnClickListener {

            val intent=Intent(this, feed::class.java)
            startActivity(intent)

        }
    }
}