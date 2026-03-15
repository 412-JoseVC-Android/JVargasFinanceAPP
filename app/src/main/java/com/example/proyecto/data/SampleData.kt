package com.example.proyecto.data

import com.example.proyecto.ui.theme.CardGreen
import com.example.proyecto.ui.theme.CardOrange
import com.example.proyecto.ui.theme.CardPurple

val sampleUser = User(
    name = "Jose",
    saldo = 15230.50
)

val sampleSummaryCards = listOf(
    SummaryCard(
        title = "Actividad de la semana",
        amount = 2340.0,
        backgroundColor = CardGreen
    ),
    SummaryCard(
        title = "Ventas",
        amount = 12450.0,
        backgroundColor = CardOrange
    ),
    SummaryCard(
        title = "Ganancias",
        amount = 4830.0,
        backgroundColor = CardPurple
    )
)
