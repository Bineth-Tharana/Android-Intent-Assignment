package com.example.mainactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Find the button using the ID you set in the layout
        val button = findViewById<Button>(R.id.btnSecondActivity)

        // 2. Set a listener to detect when the button is clicked
        button.setOnClickListener {

            // 3. Create an Intent to navigate from this activity to SecondActivity
            val intent = Intent(this, SecondActivity::class.java)


            // 4. Start the new activity
            startActivity(intent)
        }
    }
}