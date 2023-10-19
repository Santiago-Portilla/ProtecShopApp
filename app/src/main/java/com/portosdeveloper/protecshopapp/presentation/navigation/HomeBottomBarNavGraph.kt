package com.portosdeveloper.protecshopapp.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.portosdeveloper.protecshopapp.presentation.screens.SailsScreen.SailsScreen

@Composable
fun HomeBottomBarNavGraph(navController: NavHostController){
    
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = HomeBottomBarScreen.Sails.route
    ){
        composable(route = HomeBottomBarScreen.Sails.route){
            SailsScreen()
        }
    }
    
}

sealed class HomeBottomBarScreen(
    val route: String,
    val icon: ImageVector
){
    object Sails: HomeBottomBarScreen(
        route = "sails",
        icon = Icons.Default.ShoppingCart
    )
    object Program: HomeBottomBarScreen(
        route = "program",
        icon = Icons.Default.DateRange
    )
    object Stock: HomeBottomBarScreen(
        route = "stock",
        icon = Icons.Default.List
    )
    object Search: HomeBottomBarScreen(
        route = "search",
        icon = Icons.Default.Search
    )
    object Personal: HomeBottomBarScreen(
        route = "personal",
        icon = Icons.Default.Face
    )
    object Notification: HomeBottomBarScreen(
        route = "notification",
        icon = Icons.Default.Notifications
    )
    object Profile: HomeBottomBarScreen(
        route = "profile",
        icon = Icons.Default.Person
    )
}