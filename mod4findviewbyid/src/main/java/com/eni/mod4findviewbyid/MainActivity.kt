package com.eni.mod4findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Récupération vue par l'id
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        //Modification des attributs
        textView.text = "Hello"
        editText.hint = "Comment allez-vous?"
        editText.text.clear()
        ratingBar.rating = 3.0f

        //Récupération des instances de mes boutons
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            Toast.makeText(this, "Hello tu as appuyé sur un bouton", Toast.LENGTH_SHORT).show()
        }

        //Pour récupérer le contenu d'un EditText
        editText.text.toString().toInt()
    }

    fun onClickButton2(v:View){
        Toast.makeText(this, "2 eme bouton", Toast.LENGTH_SHORT).show()
    }
}