package com.choco_tyranno.studyhilt.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.choco_tyranno.studyhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}