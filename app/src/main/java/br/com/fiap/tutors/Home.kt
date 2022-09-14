package br.com.fiap.tutors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import br.com.fiap.tutors.ui.screen.HomeScreen
import br.com.fiap.tutors.ui.theme.TutorsTheme

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    TutorsTheme {
        HomeScreen()
    }
}