package net.developermaster.splashscreen.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SplashScreen(
    navController: NavController,
) {
    navController.navigate("main_screen") {
        popUpTo("splash_screen") {
            inclusive = true
        }
    }
}