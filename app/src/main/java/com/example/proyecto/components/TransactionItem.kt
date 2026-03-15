package com.example.proyecto.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.proyecto.data.Transaction
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto.data.sampleTransactions
import com.example.proyecto.ui.theme.AvatarBackground
import com.example.proyecto.ui.theme.TextSecondary
import com.example.proyecto.ui.theme.TransactionExpense
import com.example.proyecto.ui.theme.TransactionIncome

@Composable
fun TransactionItem(transaction: Transaction) {

    val amountColor =
        if (transaction.amount < 0) TransactionExpense
        else TransactionIncome

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(AvatarBackground, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = transaction.icon,
                contentDescription = transaction.name
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = transaction.name,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = transaction.category,
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary
            )
        }

        Column(
            horizontalAlignment = Alignment.End
        ) {

            Text(
                text = "${if (transaction.amount > 0) "+" else ""}$${"%.2f".format(transaction.amount)}",
                style = MaterialTheme.typography.titleMedium,
                color = amountColor
            )

            Text(
                text = transaction.time,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TransactionItemPreview() {

    TransactionItem(sampleTransactions.first())
}