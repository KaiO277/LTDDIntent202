package com.example.intent_202

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editTextName: EditText
    lateinit var btnClinkMe: Button
    lateinit var btnDIAL: Button
    lateinit var editTextURL: EditText
    lateinit var btnURL: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById<View>(R.id.editTextName) as EditText
        btnClinkMe = findViewById<View>(R.id.btnClickMe) as Button
        btnDIAL = findViewById<View>(R.id.btnDIAL) as Button
        editTextURL = findViewById<View>(R.id.editTextURL) as EditText
        btnURL = findViewById<View>(R.id.btnURL) as Button

        btnClinkMe.setOnClickListener {
            val intent = Intent(this, Name::class.java)
            val YName = editTextName.text.toString()
            intent.putExtra("Mes",YName)
            startActivity(intent)
        }

        btnDIAL.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }

        btnURL.setOnClickListener {
            val url = editTextURL.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}