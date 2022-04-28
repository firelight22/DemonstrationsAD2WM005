package com.eni.mod8viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.eni.mod8viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    lateinit var vm : ViewModelCompteur

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this).get(ViewModelCompteur::class.java)
        vm.compteur.observe(this, Observer { amb.textViewCompteur.text = it.toString() })

        amb.fabIncrement.setOnClickListener { vm.plusUn() }

    }
}