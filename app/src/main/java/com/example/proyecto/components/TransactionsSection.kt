package com.example.proyecto.components


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.proyecto.data.Transaction
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto.data.sampleTransactions

@Composable
fun TransactionsSection(transactions: List<Transaction>) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Transactions",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "See All",
                style = MaterialTheme.typography.bodyMedium
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {

            items(
                items = transactions,
                key = { it.id }
            ) { transaction ->

                TransactionItem(transaction)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TransactionsSectionPreview() {

    TransactionsSection(sampleTransactions)
}