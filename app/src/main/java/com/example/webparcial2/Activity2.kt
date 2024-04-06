package com.example.webparcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val textView = findViewById<TextView>(R.id.textView)
        val receiveMessage: String? = intent.extras?.getString("EXTRA_MESSAGE").orEmpty()
        textView.text = receiveMessage
    }
}