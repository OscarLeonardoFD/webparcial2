package com.example.webparcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext = findViewById<EditText>(R.id.edittext)
        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener{
            val message:String = edittext.text.toString()
            val sendMessage = Intent(this, Activity2::class.java)
            sendMessage.putExtra("EXTRA_MESSAGE",message)
            startActivity(sendMessage)
        }
    }
}