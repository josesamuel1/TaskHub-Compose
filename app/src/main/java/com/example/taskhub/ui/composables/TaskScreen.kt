package com.example.taskhub.ui.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.taskhub.ui.theme.green_110

@Preview
@Composable
fun TaskScreenPreview() {
    TaskScreen(navController = rememberNavController())
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TaskScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column() {
            Box() {// Cabeçalho da página
                Cabecalho(navController = navController)
            }

            Box() {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    var taskName by remember { mutableStateOf("") }
                    var taskDesc by remember { mutableStateOf("") }

                    TextField(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        value = taskName,
                        onValueChange = { taskName = it },
                        label = { Text("Nome da Task") }
                    )
                    TextField(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        value = taskDesc,
                        onValueChange = { taskDesc = it },
                        label = { Text("Descrição da Task") }
                    )

                    // Botão para criar outra task
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Button(
                            onClick = { navController.navigate("tasks") },
                            colors = ButtonDefaults.buttonColors( containerColor = Color.Transparent ),
                            modifier = Modifier
                                .height(45.dp)
                                .background(green_110)
                        ) {
                            Text(text = "Criar Task")
                        }
                    }
                }
            }

            // Espaçamento pra manter o rodapé em baixo
            Spacer(modifier = Modifier.weight(1f))

            // Rodapé da página
            Box() {
                Rodape(navController = navController)
            }
        }
    }
}
