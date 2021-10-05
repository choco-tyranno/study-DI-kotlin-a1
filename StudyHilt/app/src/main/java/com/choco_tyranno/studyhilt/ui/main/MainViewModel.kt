package com.choco_tyranno.studyhilt.ui.main

import androidx.lifecycle.ViewModel
import com.choco_tyranno.studyhilt.data.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel(){

    fun getRepositoryHash() = repository.hashCode().toString()
}