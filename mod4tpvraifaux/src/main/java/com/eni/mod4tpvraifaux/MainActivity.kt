package com.eni.mod4tpvraifaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eni.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb:ActivityMainBinding
    var index = 0;
    var score = 0;
    var listQr = listOf(
        QuestionReponse("La terre est-elle plate ?",false),
        QuestionReponse("La France est est un pays ?",true),
        QuestionReponse("Mars est-elle une planète",true),
        QuestionReponse("Est-ce que la soleil est chaud ?",true),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)

        amb.textViewScore.text =  "${score}/${listQr.size} questions"
        amb.qr = listQr[index]
        amb.buttonVrai.setOnClickListener {reponseUtilisateur(true)  }
        amb.buttonFaux.setOnClickListener {reponseUtilisateur(false)  }
    }
    fun reponseUtilisateur(reponseUtilisateur : Boolean){
        //On vérifie que l'utilisateur a bien répondu
        if(reponseUtilisateur == listQr[index].reponse){
            score++
            amb.textViewScore.text =  "${score}/${listQr.size}  questions"
        }
        //On est rendu au bout du tableau
        //INDEX = 3
        //taille liste = 4
        if(index == listQr.size-1){
            amb.buttonVrai.isEnabled = false
            amb.buttonFaux.isEnabled = false
        }else{
            //On passe à la question suivante
            index++
            //On l'affiche
            amb.qr = listQr[index]
        }
    }
}