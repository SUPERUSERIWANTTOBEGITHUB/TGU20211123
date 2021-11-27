package com.measurer.crc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity

// my first comment

class MainActivity<textView> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloTextView:TextView = findViewById(R.id.hello_world_text_view)
        helloTextView.text = "HI! welcome"
        val newTextButton:Button = findViewById(R.id.button)
        newTextButton.setOnClickListener {
            helloTextView.text = "I am welcome you"
        }

    }
}
// my second comment