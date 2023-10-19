package com.portosdeveloper.protecshopapp.presentation.screens.SailsScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.portosdeveloper.protecshopapp.presentation.components.DefaultTextField
import com.portosdeveloper.protecshopapp.presentation.screens.SailsScreen.SailsScreenViewModel

@Composable
fun SailsContent(viewModel: SailsScreenViewModel = hiltViewModel()){


    Box(
        Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .verticalScroll(rememberScrollState())
        ) {
            DefaultTextField(
                value = viewModel.client,
                onValueChange = { viewModel.client = it },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(),
                label = "Cliente"
            )
            Row(
                modifier = Modifier.padding(start = 10.dp, top = 40.dp)
            ) {
                Text(text = "CAMISA", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
            ) {
                Column(
                    modifier = Modifier.weight(2f)
                ) {
                    viewModel.sizes.forEachIndexed { index, size ->
                        DefaultTextField(
                            value = size,
                            onValueChange = { viewModel.sizes[index] = it },
                            modifier = Modifier.padding(end = 5.dp, bottom = 5.dp),
                            label = "TALLA"
                        )
                    }
                }
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    viewModel.quantity.forEachIndexed { index, quantities ->
                        DefaultTextField(
                            value = quantities,
                            onValueChange = { viewModel.quantity[index] = it },
                            modifier = Modifier.padding(bottom = 5.dp),
                            label = "#"
                        )
                    }
                }
            }
            Row(modifier = Modifier.padding(start = 10.dp)) {
                Row(
                    modifier = Modifier.clickable {
                        viewModel.sizes.add("")
                        viewModel.quantity.add("")
                    }
                ) {
                    Text(text = "Nueva Talla")
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                }
                Spacer(Modifier.weight(1f))
                Row(
                    modifier = Modifier.clickable {
                        if (viewModel.sizes.size >= 1 && viewModel.quantity.size >= 1) {
                            viewModel.sizes.removeLast()
                            viewModel.quantity.removeLast()
                        }
                    }
                ) {
                    Text(text = "Eliminar Talla")
                    Icon(imageVector = Icons.Default.Delete, contentDescription = "")
                }

            }
            Row(modifier = Modifier.padding(start = 10.dp,top = 30.dp)) {
                Text(text = "BLUSA", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
            ) {
                Column(
                    modifier = Modifier.weight(2f)
                ) {
                    viewModel.sizesTwo.forEachIndexed { index, size ->
                        DefaultTextField(
                            value = size,
                            onValueChange = { viewModel.sizesTwo[index] = it },
                            modifier = Modifier.padding(
                                end = 5.dp,
                                bottom = 5.dp
                            ),
                            label = "TALLA"
                        )
                    }
                }
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    viewModel.quantityTwo.forEachIndexed { index, quantities ->
                        DefaultTextField(
                            value = quantities,
                            onValueChange = { viewModel.quantityTwo[index] = it },
                            modifier = Modifier.padding(bottom = 5.dp),
                            label = "#"
                        )
                    }
                }
            }
            Row(modifier = Modifier.padding(start = 10.dp)) {
                Row(
                    modifier = Modifier.clickable {
                        viewModel.sizesTwo.add("")
                        viewModel.quantityTwo.add("")
                    }
                ) {
                    Text(text = "Nueva Talla")
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = ""
                    )
                }
                Spacer(Modifier.weight(1f))
                Row(
                    modifier = Modifier.clickable {
                        if (viewModel.sizesTwo.size >= 1 && viewModel.quantityTwo.size >= 1) {
                            viewModel.sizesTwo.removeLast()
                            viewModel.quantityTwo.removeLast()
                        }
                    }
                ) {
                    Text(text = "Eliminar Talla")
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = ""
                    )
                }
            }
            Row(
                modifier = Modifier.padding(top = 80.dp,start = 20.dp)
            ) {
                Text(
                    text = "Total a Pagar: ",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(end = 10.dp)
                )
                Text(text = "$00000000", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp, top = 100.dp)
            ) {
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Cotizacion")
                }
                Spacer(modifier = Modifier.weight(0.5f))
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Venta")
                }
            }
        }
    }
}