package com.example.proyecto.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction(
    val id: Int,
    val name: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)