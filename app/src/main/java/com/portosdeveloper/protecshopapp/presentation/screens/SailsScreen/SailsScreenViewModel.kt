package com.portosdeveloper.protecshopapp.presentation.screens.SailsScreen

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SailsScreenViewModel @Inject constructor() : ViewModel() {
    var client by mutableStateOf("")
    val sizes = mutableStateListOf<String>()
    val sizesTwo = mutableStateListOf<String>()
    val quantity = mutableStateListOf<String>()
    val quantityTwo = mutableStateListOf<String>()

}