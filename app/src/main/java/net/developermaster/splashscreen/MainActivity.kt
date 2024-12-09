package net.developermaster.splashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import net.developermaster.splashscreen.splashScreenNavigation.AppNavigation
import net.developermaster.splashscreen.ui.theme.SplashScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplashScreenTheme {
                AppNavigation()
            }
        }
    }
}


