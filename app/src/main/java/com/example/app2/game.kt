package com.example.app2

import android.os.Bundle
import android.provider.Settings.Global.putInt
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.app2.databinding.FragmentGameBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val arg_nav = "time"

class game : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_game,container,false)
        var count=0
        var random=Math.floor(Math.random()*49+1).toInt()
        var guess =0
        binding.btnGuess.setOnClickListener()
        {
            if (binding.numText.getText().toString() != "") {
                count++
                guess = binding.numText.getText().toString().toInt()
                binding.CountText.setText(count.toString())
                if (guess > random){
                    binding.tvhint.setText("Should be less than "+guess)
                }else if (guess < random){
                    binding.tvhint.setText("Should be greater than "+guess)
                }else{
                    val bundle = Bundle()
                    bundle.putInt("time",count)
                    findNavController()?.navigate(R.id.action_game_to_gamewin,bundle)
                }
                if (count>10){
                    view?.findNavController()?.navigate(R.id.action_game_to_gamelose)
                }
                binding.CountText.setText(count.toString())
            }
        }

        return binding.root
    }

}