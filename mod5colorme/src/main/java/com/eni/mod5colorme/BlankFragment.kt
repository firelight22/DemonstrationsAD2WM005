package com.eni.mod5colorme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class BlankFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn =view.findViewById<Button>(R.id.buttonValider)
        btn.setOnClickListener {
            if((0..1).random() >0){
                view.findNavController().navigate(R.id.action_blankFragment_to_redFragment)
            }else{
                view.findNavController().navigate(R.id.action_blankFragment_to_pinkFragment)
            }
        }
    }
}