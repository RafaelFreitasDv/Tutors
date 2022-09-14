package br.com.fiap.tutors.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.tutors.model.Tutor
import br.com.fiap.tutors.sampledata.sampleSuggestions

@Composable
fun TutorShowcase(
    title: String,
    tutors: List<Tutor>
) {
    Column() {
        Text(
            text = title,
            Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight.W400
        )
        Row(
            Modifier
                .padding(
                    top = 32.dp
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState(0)),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier)
            for (t in tutors) {
                TutorView(tutor = t)
            }
            Spacer(Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TutorShowcaseView() {
    TutorShowcase(title = "Tutors pra você! ♥", tutors = sampleSuggestions)
}