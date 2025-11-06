@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.praktikum5.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier=Modifier,
        {
            TopAppBar(

            )
        })
}