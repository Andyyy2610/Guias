package com.example.guia7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.guia7.ui.theme.HomeScreen
import com.example.guia7.ui.theme.HomeScreenPreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstance: Bundle?){
        super.onCreate(savedInstance)
        setContent {
            HomeScreen()
            HomeScreenPreview()
        }
    }
}