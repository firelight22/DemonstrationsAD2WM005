package com.eni.mavoiturebinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eni.mavoiturebinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //val textViewModele = findViewById<TextView>(R.id.textViewModele)
        //val textViewMarque = findViewById<TextView>(R.id.textViewMarque)
        //val textViewAnnee = findViewById<TextView>(R.id.textViewAnnee)
        //val textViewConsommation = findViewById<TextView>(R.id.textViewConsommation)
        //val textViewCarburant = findViewById<TextView>(R.id.textViewCarburant)
        val ioniq = Voiture(
            "2018",
            "Hyundai",
            "ioniq",
            "12.6kwh/100",
            "EL"
        )
        amb.v = ioniq
        //textViewAnnee.text = ioniq.annee
        //textViewModele.text = ioniq.modele
        //textViewCarburant.text = ioniq.carburant
        //textViewMarque.text = ioniq.marque
        //textViewConsommation.text = ioniq.consommation

    }
}