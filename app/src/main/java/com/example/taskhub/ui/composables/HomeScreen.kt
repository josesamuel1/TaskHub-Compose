package com.example.taskhub.ui.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column() {
            Box() {// Cabeçalho da página
                Cabecalho(navController = navController)
            }

            Box() {
                Column(modifier = Modifier.padding(16.dp)) {
                    TaskBox(
                        taskName = "teste1",
                        taskDesc = "Maecenas placerat diam sapien, quis vulputate purus facilisis a. Nunc euismod, est et dapibus lacinia.",
                        createDate = "10/06/24",
                    )
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

/*
    Button(onClick = {
        navController.navigate("login")
    }
    ) {
        Text(text = "Voltar para a tela de login")
    }
*/
