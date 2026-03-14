package com.example.proyecto.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

val sampleTransactions = listOf(

    Transaction(
        id = 1,
        name = "Walmart",
        category = "Groceries",
        amount = -54.20,
        time = "11:30 AM",
        icon = Icons.Default.ShoppingCart
    ),

    Transaction(
        id = 2,
        name = "Starbucks",
        category = "Food & Drinks",
        amount = -8.50,
        time = "09:15 AM",
        icon = Icons.Default.LocalCafe
    ),

    Transaction(
        id = 3,
        name = "Shell",
        category = "Fuel",
        amount = -40.00,
        time = "02:10 PM",
        icon = Icons.Default.LocalGasStation
    ),

    Transaction(
        id = 4,
        name = "Amazon",
        category = "Electronics",
        amount = -120.99,
        time = "08:45 PM",
        icon = Icons.Default.ShoppingBag
    ),

    Transaction(
        id = 5,
        name = "Barnes & Noble",
        category = "Books",
        amount = -18.75,
        time = "05:20 PM",
        icon = Icons.Default.MenuBook
    ),

    Transaction(
        id = 6,
        name = "Freelance Payment",
        category = "Income",
        amount = 250.00,
        time = "10:05 AM",
        icon = Icons.Default.AttachMoney
    )
)