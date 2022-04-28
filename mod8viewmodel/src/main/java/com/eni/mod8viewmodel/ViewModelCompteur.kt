package com.eni.mod8viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelCompteur : ViewModel() {
    var compteur = MutableLiveData<Int>();
    init {
        compteur.value = 0
    }

    fun plusUn() {
        compteur.value = compteur.value?.inc()
    }
}