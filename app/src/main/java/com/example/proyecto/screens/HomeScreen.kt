package com.example.proyecto.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto.components.HeaderSection
import com.example.proyecto.components.SummaryCardsSection
import com.example.proyecto.components.TransactionsSection
import com.example.proyecto.data.sampleSummaryCards
import com.example.proyecto.ui.theme.ProyectoTheme
import com.example.proyecto.data.sampleTransactions
import com.example.proyecto.data.sampleUser

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        HeaderSection(sampleUser)
        SummaryCardsSection(sampleSummaryCards)
        TransactionsSection(sampleTransactions)

    }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ProyectoTheme() {
        HomeScreen()
    }
}