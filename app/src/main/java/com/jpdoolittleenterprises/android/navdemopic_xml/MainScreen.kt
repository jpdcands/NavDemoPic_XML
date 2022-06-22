package com.jpdoolittleenterprises.android.navdemopic_xml

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import kotlinx.coroutines.NonCancellable.start

class MainScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)
        val upperBodyButton = view.findViewById<Button>(R.id.upperBody)
        val lowerBodyButton = view.findViewById<Button>(R.id.lowerBody)
        val absButton = view.findViewById<Button>(R.id.abs)
        val cardioButton = view.findViewById<Button>(R.id.cardio)
        val otherButton = view.findViewById<Button>(R.id.other)
        val balanceButton = view.findViewById<Button>(R.id.balance)


        upperBodyButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_upperBody)
        }
        lowerBodyButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_lowerBody)
        }
        absButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_abs)
        }
        cardioButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_cardio)
        }
        otherButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_other)
        }
        balanceButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_balance)
        }

        return view
    }

}


