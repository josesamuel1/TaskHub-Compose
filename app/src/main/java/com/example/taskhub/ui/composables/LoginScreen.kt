package com.example.taskhub.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.example.taskhub.R
import com.example.taskhub.ui.theme.green_170
import com.example.taskhub.ui.theme.green_110
import com.example.taskhub.ui.theme.green_90
import com.example.taskhub.ui.theme.green_50

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(navController = rememberNavController())
}

@Composable
fun LoginScreen(navController: NavController) {
    // Coluna onde todos os dados estão
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        green_90,
                        green_50
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Nome do Aplicativo
        Row( // Linha do Nome do App
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                color = Color.White,
                text = "TASK",
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                color = Color.White,
                text = "HUB",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }

        // Imagem do App
        Image(
            painter = painterResource(id = R.drawable.logo_taskhub),
            contentDescription = "Logo TaskHub",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(200.dp)
                .padding(20.dp)
        )

        // Espaçamento
        Spacer(modifier = Modifier.padding(0.dp, 20.dp))

        // Botão de Entrar
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .width(175.dp)
                .padding(10.dp)
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            green_170,
                            green_110,
                            green_170,
                        )
                    )
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 0.dp,
                pressedElevation = 0.dp,
                hoveredElevation = 0.dp,
            )
        ) {
            Text(
                text = "Entrar",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
