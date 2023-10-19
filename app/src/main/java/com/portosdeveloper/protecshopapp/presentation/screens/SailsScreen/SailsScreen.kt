package com.portosdeveloper.protecshopapp.presentation.screens.SailsScreen

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.portosdeveloper.protecshopapp.presentation.screens.SailsScreen.components.SailsContent

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SailsScreen(){
    Scaffold(
        content = {
            SailsContent()
        }
    )
}