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

        upperBodyButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.to_upperBody)
            }
            return view
        }
    }



