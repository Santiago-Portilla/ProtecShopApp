package com.portosdeveloper.protecshopapp.presentation.screens.SignUpScreen.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.portosdeveloper.protecshopapp.domain.model.Response
import com.portosdeveloper.protecshopapp.presentation.components.DefaultProgressBar
import com.portosdeveloper.protecshopapp.presentation.navigation.Graph
import com.portosdeveloper.protecshopapp.presentation.screens.SignUpScreen.SignUpViewModel


@Composable
fun Update(navController: NavHostController,viewModel : SignUpViewModel = hiltViewModel()){

    when(val updateResponse = viewModel.updateResponse){
        Response.Loading -> {
            DefaultProgressBar()
        }
        is Response.Success -> {
            LaunchedEffect(Unit){
                navController.popBackStack(Graph.AUTHENTICATION, true)
                navController.navigate(route = Graph.HOME)
            }
        }
        is Response.Failure -> {
            Toast.makeText(LocalContext.current, updateResponse.exception?.message  ?: "Error Desconocido", Toast.LENGTH_LONG).show()
        }

        else -> {}
    }
}