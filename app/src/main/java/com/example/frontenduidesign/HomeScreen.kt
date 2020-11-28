package com.example.frontenduidesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_screen_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.LoginButton)
        val button_create = view.findViewById<Button>(R.id.CreateButton)

        button.setOnClickListener {
            val action = HomeScreenDirections.actionHomeScreen3ToLoginFragment()
            findNavController().navigate(action)
        }
        button_create.setOnClickListener {
            val action = HomeScreenDirections.actionHomeScreen3ToCreateAccountFragment2()
            findNavController().navigate(action)
        }
    }


}