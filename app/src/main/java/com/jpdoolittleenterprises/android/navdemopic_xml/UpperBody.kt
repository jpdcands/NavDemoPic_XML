package com.jpdoolittleenterprises.android.navdemopic_xml

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*


class UpperBody : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_upper_body, container, false)

        val vertical_tractionButton = view.findViewById<Button>(R.id.vertical_traction)

        vertical_tractionButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_upperBody_to_technoVerticalTractionFragment)
        }
        return view


        }
    }

