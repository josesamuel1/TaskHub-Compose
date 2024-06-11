package com.example.taskhub.ui.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.taskhub.ui.theme.green_110
import com.example.taskhub.ui.theme.green_170
import com.example.taskhub.ui.theme.green_90

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
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Tasks mais recentes",
                        color = green_90,
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = Bold,
                        modifier = Modifier
                            .padding(bottom = 6.dp)
                    )
                    // Task 1
                    TaskBox(
                        taskName = "Enviar atividade",
                        taskDesc = "Terminar atividade e enviar pro professor até dia 17/06.",
                        createDate = "08/06/24",
                    )

                    Spacer(modifier = Modifier.padding(8.dp))

                    // Task 2
                    TaskBox(
                        taskName = "Fazer a feira",
                        taskDesc = "Arroz, macarrão, carne, frango, temperos, suplementos.",
                        createDate = "08/06/24",
                    )

                    Spacer(modifier = Modifier.padding(8.dp))

                    // Task 3
                    TaskBox(
                        taskName = "Ajudar mãe",
                        taskDesc = "Visitar mãe e ajudar ela com seus projetos próxima segunda.",
                        createDate = "09/06/24",
                    )
                }
            }

            // Espaçamento pra manter o rodapé em baixo
            Spacer(modifier = Modifier.weight(1f))

            // Botão para criar outra task
            Box(
                contentAlignment = Alignment.BottomEnd,
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
                    Text(text = "Nova Task")
                }
            }

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
