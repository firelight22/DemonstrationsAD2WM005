package com.eni.mod4databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eni.mod4databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val manu : Utilisateur = Utilisateur("Macron","Manu","1977","H")
        val valls : Utilisateur = Utilisateur("Valls","Manu","1962","H")
        val elon : Utilisateur = Utilisateur("Musk","Elon","1971","H")
        val sibeth : Utilisateur = Utilisateur("Ndiaye","Sibeth","1979","F")

    }
}