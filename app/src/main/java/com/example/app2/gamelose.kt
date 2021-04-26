package com.example.app2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.app2.databinding.FragmentGameloseBinding
import com.example.app2.databinding.FragmentGamewinBinding

// TODO: Rename parameter arguments, choose names that match

class gamelose : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameloseBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_gamelose,container,false)
        binding.btn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gamelose_to_game)
        }
        return binding.root
    }

}