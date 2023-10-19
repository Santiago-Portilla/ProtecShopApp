package com.portosdeveloper.protecshopapp.presentation.navigation

import androidx.navigation.*

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController){

    /*
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.InputCloth.route
    ){
    }

     */

}

sealed class DetailsScreen(val route : String){

    object InputCloth : DetailsScreen("input_cloth")
    object InputPlotter : DetailsScreen("input_plotter")
    object InputWadding : DetailsScreen("input_wadding")
    object InputRollWadding : DetailsScreen("input_roll_wadding")
    object InputThread : DetailsScreen("input_thread")
    object InputYarn : DetailsScreen("input_yarn")
    object InputReflective : DetailsScreen("input_reflective")
    object InputButton : DetailsScreen("input_button")
    object InputPacking : DetailsScreen("input_packing")
    object StockSupplies : DetailsScreen("stock_supplies")
    object StockProgress : DetailsScreen("stock_progress")
    object ProgramingLine : DetailsScreen("programing_line")
    object UserWorkShop : DetailsScreen("personal/details/{userWorkShop}"){
        fun passUserWorkShop(userWorkShop: String) = "personal/details/$userWorkShop"
    }
    object SearchWithNumber : DetailsScreen("search_with_number")
    object SearchWithQR : DetailsScreen("search_with_qr")

}