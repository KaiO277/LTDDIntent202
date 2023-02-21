package com.example.intent_202

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Name : AppCompatActivity() {

    lateinit var tvShow:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        tvShow = findViewById<View>(R.id.tvShow) as TextView

        if (intent != null){
            val data = intent.getStringExtra("Mes")
            tvShow.text = "Hello $data"
        }
    }
}