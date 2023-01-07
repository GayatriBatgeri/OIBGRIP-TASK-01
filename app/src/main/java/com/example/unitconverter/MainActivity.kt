package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btntog = findViewById<Button>(R.id.btntog)
        val btntokg = findViewById<Button>(R.id.btntokg)
        val etg = findViewById<EditText>(R.id.etg)
        val etkg = findViewById<EditText>(R.id.etkg)
        btntog.setOnClickListener(){
            val etkg = findViewById<EditText>(R.id.etkg)
             var result = (etkg.text.toString().toFloat()*1000)
            etg.setText(result.toString())
        }
        btntokg.setOnClickListener(){
            val etg = findViewById<EditText>(R.id.etg)
             var result = (etg.text.toString().toFloat()/1000)
            etkg.setText(result.toString())
        }
    }
}