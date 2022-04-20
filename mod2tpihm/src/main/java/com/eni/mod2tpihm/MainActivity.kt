package com.eni.mod2tpihm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val maConst : String = "sdfgsdfdsfghkosddf"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvQuestionnaire = findViewById<TextView>(R.id.textViewTheQuestionnaire)
        


    }
}