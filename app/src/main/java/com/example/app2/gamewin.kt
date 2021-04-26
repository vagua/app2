package com.example.app2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.app2.databinding.FragmentGameBinding
import com.example.app2.databinding.FragmentGamewinBinding

private const val arg_nav = "time"
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
class gamewin : Fragment() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            count = it.getInt(arg_nav)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var n=0
        val binding: FragmentGamewinBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_gamewin,container,false)
        binding.tvcount.setText(count.toString())
        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gamewin_to_game)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}