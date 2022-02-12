package com.anomdev.makutoanepal.model

import com.anomdev.makutoanepal.R

class CountryTopicElementProvider {
    companion object {
        val countryTopicElementsList = listOf(
            CountryTopicElement(
                R.drawable.retrobackground,
                "Titulo del elemento",
                "Este es el body que pasará a la detail"
            ),
            CountryTopicElement(
                R.drawable.bluegridbackground,
                "Naturaleza ***",
                "Este es el body que pasará a la detail"
            ),
            CountryTopicElement(
                R.drawable.app_logo,
                "Puntos de interés ***",
                "Este es el body que pasará a la detail"

            ),
            CountryTopicElement(
                R.drawable.topographicbackground,
                "Rutas de montaña ***",
                "Este es el body que pasará a la detail"

            ),
            CountryTopicElement(
                R.drawable.app_logo,
                "Gastronomía ***",
                "Este es el body que pasará a la detail"

            ),
            CountryTopicElement(
                R.drawable.makutonepal_logo2,
                "Otros datos ***",
                "Este es el body que pasará a la detail"

            )
        )
    }
}