package com.anomdev.makutoanepal.model

import com.anomdev.makutoanepal.R

class CountryTopicProvider {
        companion object{
            val countryTopicsList = listOf(
                CountryTopic(
                    R.drawable.culture,
                    "Historia y cultura",
                ),
                CountryTopic(
                    R.drawable.nature,
                    "Habitat y ecosistema",
                ),
                CountryTopic(
                    R.drawable.point_of_interest,
                    "Puntos de interés",
                ),
                CountryTopic(
                    R.drawable.trekkings,
                    "Rutas de montaña",
                ),
                CountryTopic(
                    R.drawable.gastronomy,
                    "Gastronomía",
                ),
                CountryTopic(
                    R.drawable.others,
                    "Otros datos",
                )
            )
        }
}