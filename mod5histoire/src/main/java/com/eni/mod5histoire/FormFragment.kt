package com.eni.mod5histoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class FormFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editTextPrenom = view.findViewById<EditText>(R.id.editTextPrenom)
        val editTextLieu = view.findViewById<EditText>(R.id.editTextLieu)
        val button = view.findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val prenom =editTextPrenom.text.toString()
            val lieu =editTextLieu.text.toString()
            val histoire = Histoire(prenom,lieu)
            val direction = FormFragmentDirections.actionFormToStory(histoire)
            it.findNavController().navigate(direction)
        }
    }
}