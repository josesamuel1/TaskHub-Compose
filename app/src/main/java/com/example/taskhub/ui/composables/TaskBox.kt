package com.example.taskhub.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskhub.ui.theme.color1

@Preview
@Composable
fun TaskBoxPreview() {
    TaskBox(
        taskName = "teste123",
        taskDesc = "Maecenas placerat diam sapien, quis vulputate purus facilisis a. Nunc euismod, est et dapibus lacinia.",
        createDate = "29/08/24"
    )
}

@Composable
fun TaskBox(
    taskName: String,
    taskDesc: String,
    createDate: String,
) {

    // Conteúdo da TaskBox
    Column(
        modifier = Modifier
            .background(color1)
            .padding(horizontal = 8.dp)
    ) {
        // Nome e data da task
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Nome da Task
            Box(
                modifier = Modifier
                    .background(color = color1)
                    .padding(vertical = 8.dp)
            ) {
                Row() {
                    Text(
                        text = "Task",
                        fontWeight = Bold,
                        modifier = Modifier.padding(0.dp, 0.dp, 16.dp, 0.dp)
                    )
                    Text(text = taskName)
                }
            }
            // Espaçador
            Spacer(modifier = Modifier.weight(1f))

            // Data da Task
            Box(
                modifier = Modifier
                    .background(color = color1)
                    .padding(vertical = 8.dp)
            ) {
                Row(horizontalArrangement = Arrangement.End) {
                    Text(
                        text = "Data de criação",
                        fontWeight = Bold,
                        modifier = Modifier.padding(0.dp, 0.dp, 16.dp, 0.dp)
                    )
                    Text(text = createDate)
                }
            }
        }
        // Espaçamento entre elementos
        Spacer(modifier = Modifier.padding(vertical = 4.dp))

        // Descrição da Task
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Text(
                    text = "Descrição",
                    fontWeight = Bold
                )
                Text(text = taskDesc)
            }
        }
    }
}
