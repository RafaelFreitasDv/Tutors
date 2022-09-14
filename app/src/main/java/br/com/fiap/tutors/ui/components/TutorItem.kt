package br.com.fiap.tutors.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.tutors.R
import br.com.fiap.tutors.model.Tutor

@Composable
fun TutorView(tutor: Tutor) {
    Column(
        Modifier
            .widthIn(110.dp, 110.dp)
            .heightIn(152.dp)
    ) {
        val imageTutor = 110.dp
        Image(
            painter = painterResource(id = tutor.image),
            contentDescription = "Foto exibibida na sessão de indicação de Tutores.",
            Modifier
                .size(imageTutor)
                .clip(shape = CircleShape)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )
        Column(
            Modifier
                .heightIn()
                .padding(top = 8.dp)
        ) {
            Text(
                text = tutor.name,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = tutor.specialty,
                fontSize = 14.sp,
                fontWeight = FontWeight.W200,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
private fun TutorReView() {
    TutorView(
        tutor = Tutor(
            name = "André Luiz",
            specialty = "Game Design",
            image = R.drawable.andreluiz
        )
    )
}