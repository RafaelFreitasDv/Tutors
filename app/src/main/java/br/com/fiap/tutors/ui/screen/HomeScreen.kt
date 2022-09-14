package br.com.fiap.tutors.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.tutors.sampledata.sampleAttended
import br.com.fiap.tutors.sampledata.sampleSuggestions
import br.com.fiap.tutors.ui.components.SeachBar
import br.com.fiap.tutors.ui.components.TutorShowcase

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SeachBar()
        TutorShowcase(title = "Tutors para você! ♥", tutors = sampleSuggestions)
        TutorShowcase(title = "Tutorias recentes", tutors = sampleAttended)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}