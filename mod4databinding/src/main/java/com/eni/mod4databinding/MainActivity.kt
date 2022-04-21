package com.eni.mod4databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eni.mod4databinding.databinding.ActivityMainBinding
import io.github.serpro69.kfaker.faker

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val faker = faker {fakerConfig { locale="fr" }}
        val user = Utilisateur(
            faker.name.lastName(),
            faker.name.firstName(),
            (1900..2000).random().toString(),
            faker.gender.types()
        )
        amb.utilisateur = user

        amb.textViewGenre.textSize = 25.0f
    }
}