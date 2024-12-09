package net.developermaster.splashscreen.splashScreenNavigation

sealed class ModelSplashScreens(val route: String) {

    data object SplashScreenObject : ModelSplashScreens("splash_screen")
    data object MainScreenObject : ModelSplashScreens("main_screen")

}