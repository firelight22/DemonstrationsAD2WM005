package com.eni.mod5navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hfa : HomeFragmentArgs? = arguments?.let { HomeFragmentArgs.fromBundle(it) }
        //val hfa1 = HomeFragmentArgs.fromBundle(arguments)
        val user = hfa?.user
        Toast.makeText(this.context,"Bonjour ${user?.email}" , Toast.LENGTH_SHORT).show()
    }
}