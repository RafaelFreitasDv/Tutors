package br.com.fiap.tutors.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SeachBar() {
    Surface(
        Modifier
            .padding(
                start = 16.dp,
                top = 29.dp,
                end = 16.dp,
                bottom = 29.dp

            ),
        shape = RoundedCornerShape(40.dp),
        elevation = 4.dp,
    ) {
        Box(
            Modifier
                .heightIn(50.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
            ) {
                Text(
                    text = "Pesquisar um tutor...",
                    Modifier.padding(
                        start = 16.dp,
                        end = 16.dp
                    ),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W500,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview
@Composable
private fun SearchBarPreview() {
    SeachBar()
}