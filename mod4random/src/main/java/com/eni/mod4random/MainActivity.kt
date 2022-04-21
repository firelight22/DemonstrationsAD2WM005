package com.eni.mod4random

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var editTextMin: EditText
    lateinit var editTextMax:EditText
    lateinit var textViewResult: TextView
    lateinit var buttonGenerate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMin = findViewById(R.id.editTextMin)
        editTextMax = findViewById(R.id.editTextMax)
        textViewResult = findViewById(R.id.textViewResultat)
        buttonGenerate = findViewById(R.id.buttonGenerate)
        buttonGenerate.setOnClickListener {
            generateRandom(
                editTextMin.text.toString().toIntOrNull()?:-1,
                editTextMax.text.toString().toIntOrNull()?:-1,
            )
        }
    }

    fun generateRandom(min:Int = -1, max:Int=-1){

        if(min ==-1 || max ==-1 || min > max){
            textViewResult.text = "Erreur entrée"
        }else{
            textViewResult.text = "Résultat : ${(min..max).random()}"
        }
    }
}