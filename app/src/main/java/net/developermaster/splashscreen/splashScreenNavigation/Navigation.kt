package net.developermaster.splashscreen.splashScreenNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.developermaster.splashscreen.core.MainScreen
import net.developermaster.splashscreen.core.SplashScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = ModelSplashScreens.SplashScreenObject.route
    ) {

        composable(ModelSplashScreens.SplashScreenObject.route) { SplashScreen(navController) }
        composable(ModelSplashScreens.MainScreenObject.route) { MainScreen() }

    }
}