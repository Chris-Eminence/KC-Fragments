package com.example.alphaquotes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.alphaquotes.R
import com.example.alphaquotes.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding !!

    private lateinit var navCon : NavController

    override fun onCreateView
                (inflater: LayoutInflater,
                 container: ViewGroup?,
                 savedInstanceState:
                 Bundle?):View?{
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        navCon = NavController(requireContext())
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = binding.nameInputLayout.editText?.text.toString()
        val track =binding.trackInputLayout.editText?.text.toString()
        val goal =binding.goalInputLayout.editText?.text.toString()

        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(name, track, goal)

        binding.submitButton.setOnClickListener {
            navCon.navigate(action)


        }
    }
}