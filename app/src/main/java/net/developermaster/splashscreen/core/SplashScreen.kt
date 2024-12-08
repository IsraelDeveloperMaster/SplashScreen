package net.developermaster.splashscreen.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import net.developermaster.splashscreen.R

@Composable
fun SplashScreen( ) {
//   Splash(navController = navController)
}

@Composable
fun Splash(navController: NavController,) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,) {

        Image(
            painter = painterResource(id = R.drawable.nestemomento), contentDescription = "Logo" ,
        Modifier.size(200.dp, 200.dp))
        Text(
            text = "Carregando...",
        fontSize = MaterialTheme.typography.headlineLarge.fontSize)
    }

    navController.navigate("main_screen") {
        popUpTo("splash_screen") {
            inclusive = true
        }
    }

}