package com.example.taskhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taskhub.ui.composables.HomeScreen
import com.example.taskhub.ui.composables.LoginScreen
import com.example.taskhub.ui.composables.TaskScreen

import com.example.taskhub.ui.theme.TaskHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskHubTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "login") {
                    composable(route = "login") { LoginScreen(navController) }
                    composable(route = "home") { HomeScreen(navController) }
                    composable(route = "tasks") { TaskScreen(navController) }
                }
            }
        }
    }
}
