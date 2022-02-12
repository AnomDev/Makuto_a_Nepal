package com.anomdev.makutoanepal.model

import com.anomdev.makutoanepal.R

class CountryTopicProvider {
    companion object {
        val countryTopicsList = listOf(
            CountryTopic(
                R.drawable.culture,
                R.string.history_culture
            ),
            CountryTopic(
                R.drawable.nature,
                R.string.nature
            ),
            CountryTopic(
                R.drawable.point_of_interest,
                R.string.poi
            ),
            CountryTopic(
                R.drawable.trekkings,
                R.string.trekkings
            ),
            CountryTopic(
                R.drawable.gastronomy,
                R.string.gastronomy
            ),
            CountryTopic(
                R.drawable.others,
                R.string.others
            )
        )
    }
}