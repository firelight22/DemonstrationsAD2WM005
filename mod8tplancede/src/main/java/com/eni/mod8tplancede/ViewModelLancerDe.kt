package com.eni.mod8tplancede

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelLancerDe : ViewModel() {
    var valeurDe : MutableLiveData<Int> = MutableLiveData(1)

    fun tirageDe(){
        valeurDe.value = (1..6).random()
    }
}