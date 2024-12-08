package net.developermaster.splashscreen.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import net.developermaster.splashscreen.R
import net.developermaster.splashscreen.navigation.AppScreens

@Composable
fun SplashScreen(navController: NavHostController) {
   navController.navigate(AppScreens.MainScreen.route)

    LaunchedEffect(key1 = true) {

        delay(5000)
        navController.popBackStack()
        navController.navigate(AppScreens.MainScreen.route)

    }

    Splash()
}

@Composable
fun Splash() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,) {

        Image(
            painter = painterResource(id = R.drawable.meus_projetos), contentDescription = "Logo" ,
        Modifier.size(200.dp, 200.dp))
        Text(
            text = "Carregando...",
        fontSize = MaterialTheme.typography.headlineLarge.fontSize)
    }

}