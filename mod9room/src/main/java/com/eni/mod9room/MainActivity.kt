package com.eni.mod9room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread {
            AppDB.get(this).animalDao()
                .insert(Animal(0,"Vache","Marguerite",500))
        }


    }
}