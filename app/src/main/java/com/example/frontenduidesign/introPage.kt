package com.example.frontenduidesign

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class introPage : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Handler().postDelayed({
            val action = introPageDirections.actionIntroPageToHomeScreen3()
            findNavController().navigate(action)
        } , 3000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.intro_page_grag, container, false)
    }

}