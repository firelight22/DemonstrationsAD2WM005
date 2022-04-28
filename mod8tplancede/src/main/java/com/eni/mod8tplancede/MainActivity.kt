package com.eni.mod8tplancede

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.eni.mod8tplancede.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    lateinit var vm :ViewModelLancerDe
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb= DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[ViewModelLancerDe::class.java]
        vm.valeurDe.observe(this, Observer { amb.textViewLancerDe.text = it.toString() })

        amb.fabLancer.setOnClickListener { vm.tirageDe() }
    }
}