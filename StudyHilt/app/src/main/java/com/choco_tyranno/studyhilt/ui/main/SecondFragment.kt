package com.choco_tyranno.studyhilt.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.choco_tyranno.studyhilt.R
import com.choco_tyranno.studyhilt.data.MyRepository
import com.choco_tyranno.studyhilt.di.qualifier.ActivityHash
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {
    private val viewModel by viewModels<MainViewModel>()
    private val activityViewModel by activityViewModels<MainViewModel>()

    @Inject
    lateinit var repository : MyRepository

    @ActivityHash
    @Inject
    lateinit var applicationHash : String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "appHash: $applicationHash")
        Log.d(TAG, "repository: ${repository.hashCode().toString()}")
        Log.d(TAG, "viewModel repo: ${viewModel.getRepositoryHash()}")
        Log.d(TAG, "activityViewModel repo: ${activityViewModel.getRepositoryHash()}")
        Log.d(TAG, "viewModel: ${viewModel.hashCode().toString()}")
        Log.d(TAG, "activityViewModel: ${activityViewModel.hashCode().toString()}")

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }
    }

    companion object{
        private val TAG = SecondFragment::class.java.simpleName
    }
}