package com.measurer.crc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
//import androidx.appcompat.app.AppCompatActivity

class MainActivity<textView> : AppCompatActivity() {
    lateinit var helloTextView:TextView
    lateinit var newTextButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_world_text_view)
        newTextButton = findViewById(R.id.button)
        newTextButtonClick()
    }

    fun newTextButtonClick() {
        newTextButton.setOnClickListener{
            helloTextView.text = Random.nextInt().toString()
        }
    }
}


// my second comment