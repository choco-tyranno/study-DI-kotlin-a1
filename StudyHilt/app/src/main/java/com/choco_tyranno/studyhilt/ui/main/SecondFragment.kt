package com.choco_tyranno.studyhilt.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.choco_tyranno.studyhilt.R
import com.choco_tyranno.studyhilt.data.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {
    @Inject
    lateinit var repository : MyRepository

    @Inject
    lateinit var applicationHash : String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("SecondFragment", "appHash: $applicationHash")
        Log.d("SecondFragment", repository.hashCode().toString())

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }
    }
}