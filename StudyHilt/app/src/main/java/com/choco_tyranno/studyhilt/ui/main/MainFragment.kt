package com.choco_tyranno.studyhilt.ui.main

import android.content.Intent
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
import com.choco_tyranno.studyhilt.ui.second.SecondActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    @Inject
    lateinit var repository : MyRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MainFragment", repository.hashCode().toString())

        view.findViewById<Button>(R.id.button_activity).setOnClickListener {
            val intent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }
        view.findViewById<Button>(R.id.button_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }


    }
}