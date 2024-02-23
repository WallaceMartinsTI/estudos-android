package com.wcsm.jetpackcomposemusicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.wcsm.jetpackcomposemusicapp.screens.FormLogin


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormLogin()
        }
    }
}

