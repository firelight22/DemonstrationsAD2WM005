package com.eni.mod5navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class ConnexionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_connexion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button)

        val moi = User("qrouet@campus-eni.fr",26)

        button.setOnClickListener {
            val actionToHome = ConnexionFragmentDirections.actionConnexionFragmentToHomeFragment(moi)
            it.findNavController().navigate(actionToHome)
            //it.findNavController().navigate(R.id.action_connexionFragment_to_homeFragment)
        }

    }
}