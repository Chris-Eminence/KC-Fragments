package com.example.alphaquotes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.alphaquotes.databinding.FragmentDetailsBinding
import com.example.alphaquotes.databinding.FragmentHomeBinding


class DetailsFragment : Fragment() {

    private var _binding : FragmentDetailsBinding? = null
    private val binding get() = _binding !!

    private lateinit var name : String
    private lateinit var track : String
    private lateinit var goal : String

    companion object{
        const val NAME = "name"
        const val TRACK = "track"
        const val GOAL = "goal"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            name = it.getString(NAME).toString()
            track = it.getString(TRACK).toString()
            goal = it.getString(GOAL).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
//        navCon = NavController(requireContext())
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nameTextView.text = name
        binding.trackTextView.text = track
        binding.goalTextView.text = goal
    }
}