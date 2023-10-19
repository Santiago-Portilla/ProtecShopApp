package com.portosdeveloper.protecshopapp.presentation.screens.LoginScreen.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.portosdeveloper.protecshopapp.domain.model.Response
import com.portosdeveloper.protecshopapp.presentation.components.DefaultProgressBar
import com.portosdeveloper.protecshopapp.presentation.navigation.Graph
import com.portosdeveloper.protecshopapp.presentation.screens.LoginScreen.LoginViewModel

@Composable
fun Login(navController: NavHostController, viewModel: LoginViewModel = hiltViewModel()){
    
    
    when(val loginResponse = viewModel.loginResponse){
        Response.Loading -> {
            DefaultProgressBar()
        }
        is Response.Success -> {
            LaunchedEffect(Unit){
                navController.navigate(route = Graph.HOME){
                    popUpTo(Graph.AUTHENTICATION){inclusive = true}
                }
            }
        }
        is Response.Failure -> {
            Toast.makeText(LocalContext.current, loginResponse.exception.message ?: "Error desconosido", Toast.LENGTH_LONG).show()
        }
        else -> {}
    }
    
    
}