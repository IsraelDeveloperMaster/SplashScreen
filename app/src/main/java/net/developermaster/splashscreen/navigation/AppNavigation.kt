package net.developermaster.splashscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.developermaster.splashscreen.core.MainScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController =  navController, startDestination = AppScreens.SplashScreen.route) {

        composable(AppScreens.SplashScreen.route) {
            MainScreen()
        }
    }
}