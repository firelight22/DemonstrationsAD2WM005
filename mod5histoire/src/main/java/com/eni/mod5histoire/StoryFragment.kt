package com.eni.mod5histoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eni.mod5histoire.databinding.FragmentStoryBinding


class StoryFragment : Fragment() {
    lateinit var fsb : FragmentStoryBinding;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fsb = FragmentStoryBinding.inflate(inflater,container,false)
        return fsb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fsb.histoire = arguments?.let { StoryFragmentArgs.fromBundle(it).story }
    }

}