package com.example.practicekt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.practicekt.databinding.FragmentEndBinding
import com.example.practicekt.databinding.FragmentPlayBinding
import com.example.practicekt.databinding.FragmentStartBinding

class EndFragment : Fragment() {

    private var b : FragmentEndBinding? = null
    private val binding get() = b!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentEndBinding.inflate(inflater, container, false)

        binding.endBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_endFragment_to_startFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        b = null
    }
}