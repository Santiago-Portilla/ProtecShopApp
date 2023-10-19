package com.portosdeveloper.protecshopapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.portosdeveloper.protecshopapp.presentation.ui.theme.Red900

@Composable
fun DefaultTextFieldImage (
    modifier: Modifier,
    value: String,
    onValueChange: (value: String) -> Unit,
    validateField:() -> Unit = {},
    label: String,
    icon: Painter,
    keyboartype: KeyboardType = KeyboardType.Text,
    hideText: Boolean = false,
    errorMsg: String = "",
    readOnly: Boolean = false
){
    Column() {
        OutlinedTextField(
            modifier = modifier,
            value = value,
            onValueChange = {
                onValueChange(it)
                validateField()
            },
            keyboardOptions = KeyboardOptions(keyboardType = keyboartype),
            label = {
                Text(
                    text = label,
                    color = Color.Black
                )
            },
            leadingIcon = {
                Image(
                    modifier = Modifier.size(20.dp),
                    painter = icon,
                    contentDescription = "")
            },
            visualTransformation = if(hideText) PasswordVisualTransformation() else VisualTransformation.None,
            readOnly = readOnly
        )
        Text(
            modifier = Modifier.padding(top = 5.dp),
            text = errorMsg,
            fontSize = 11.sp,
            color = Red900
        )

    }
}