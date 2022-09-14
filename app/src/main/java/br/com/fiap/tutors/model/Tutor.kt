package br.com.fiap.tutors.model

import androidx.annotation.DrawableRes

class Tutor(
    val name: String,
    val specialty: String,
    @DrawableRes val image: Int
)