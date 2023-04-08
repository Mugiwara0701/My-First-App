package com.blade.myfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvTextView = findViewById<TextView>(R.id.TextView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            btnClickMe.text = "HAHA"
            timesClicked += 1

            tvTextView.text = timesClicked.toString()
            Toast.makeText(this, "HAHA You Clicked Me", Toast.LENGTH_LONG).show()
        }
    }
}