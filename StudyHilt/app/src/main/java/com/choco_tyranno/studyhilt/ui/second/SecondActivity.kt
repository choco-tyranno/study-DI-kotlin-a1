package com.choco_tyranno.studyhilt.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.choco_tyranno.studyhilt.R
import com.choco_tyranno.studyhilt.data.MyRepository
import com.choco_tyranno.studyhilt.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var repository : MyRepository

    @AppHash
    @Inject
    lateinit var applicationHash : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "appHash: $applicationHash")
        Log.d("SecondActivity", repository.hashCode().toString())

        setContentView(R.layout.activity_second)
    }
}