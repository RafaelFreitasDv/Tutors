package br.com.fiap.tutors.model

import androidx.annotation.DrawableRes
import br.com.fiap.tutors.R

class Logo(
    @DrawableRes val image: Int
)

val imageLogo = Logo(
    image = R.drawable.logotutors
)