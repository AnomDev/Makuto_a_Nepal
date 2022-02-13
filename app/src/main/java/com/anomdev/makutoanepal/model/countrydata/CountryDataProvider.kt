package com.anomdev.makutoanepal.model.countrydata

import com.anomdev.makutoanepal.R

class CountryDataProvider {

    companion object {

        //HISTORY & CULTURE

        val headerHistory = "Historia"
        val headerCulture = "Cultura"

        val ancientHistoryList = listOf(
            CountryData(
                R.drawable.silk_sea,
                "Historia antigua",
                "Siglo IV a.e.c hasta s. VIII e.c."
            ),
            CountryData(
                R.drawable.bluegridbackground,
                "Historia medieval",
                "Siglo IX e.c. hasta s.XVII e.c"
            ),
            CountryData(
                R.drawable.bluegridbackground,
                "Historia moderna",
                "Siglo XVIII e.c. hasta s. XIX e.c"
            ),
            CountryData(
                R.drawable.bluegridbackground,
                "Historia contemporánea",
                "Siglo XX e.c hasta nuestros días (dinastia rana, revolución de 1951, sistema panchayat, democracia, guerra civil, república y actualidad)"
            ),
        )

        val cultureList = listOf(
            CountryData(
                R.drawable.silk_sea,
                "Arte",
                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
            ),
            CountryData(
                R.drawable.bluegridbackground,
                "Lenguas",
                "Este es el body que pasará a la detail"
            ),
            CountryData(
                R.drawable.silk_sea,
                "Religión",
                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
            ),
            CountryData(
                R.drawable.bluegridbackground,
                "Festividades",
                "Este es el body que pasará a la detail"
            ),
        )

        //POI

        val headerKathmandu = "Área de Katmandú"
        val headerPokhara = "Área de Pokhara"
        val headerMountains = "Área de las montañas"
        val headerOther = "Otros lugares de interés"

        //Kathmandu region
        val poiKathmanduElementsList = listOf(
            CountryData(
                R.drawable.cte_poi_sitapaila,
                "Sitapaila",
                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
            ),
            CountryData(
                R.drawable.cte_poi_tergar,
                "Tergar Osel Ling",
                "Este es el body que pasará a la detail"

            ),
            CountryData(
                R.drawable.cte_poi_swayambhu,
                "Swayambhunath",
                "Este es el body que pasará a la detail"
            ),
            CountryData(
                R.drawable.cte_poi_pashu,
                "Pashupatinath",
                "Este es el body que pasará a la detail"

            ),
            CountryData(
                R.drawable.cte_poi_durbar,
                "Durbar square",
                "Este es el body que pasará a la detail"

            ),
            CountryData(
                R.drawable.cte_poi_boudha,
                "Boudhanath",
                "Este es el body que pasará a la detail"

            ),

            )

        //Pokhara region
        val poiPokharaElementsList = listOf(
            CountryData(
                R.drawable.cte_poi_worldpeace,
                "World Peace Stupa",
                "\n" +
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
            ),
            CountryData(
                R.drawable.cte_poi_sarangkot,
                "Sarangkot",
                "Este es el body que pasará a la detail"

            ),
            CountryData(
                R.drawable.cte_poi_phewa,
                "Phewa lake",
                "Este es el body que pasará a la detail"
            ),

            )

        // Mustang region
        val poiMustangElementsList = listOf(
            CountryData(
                R.drawable.cte_poi_lomanthang,
                "Lo Manthang",
                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
            ),
            CountryData(
                R.drawable.cte_poi_kagbeni,
                "Kagbeni",
                "Este es el body que pasará a la detail"

            ),
            CountryData(
                R.drawable.cte_poi_jomsom,
                "Jomsom",
                "Este es el body que pasará a la detail"
            ),
        )

        // Others region
        val poiOtherElementsList = listOf(
            CountryData(
                R.drawable.cte_poi_lumbini,
                "Lumbini",
                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
            ),
            CountryData(
                R.drawable.cte_poi_terai,
                "Terai",
                "Este es el body que pasará a la detail"

            ),
            CountryData(
                R.drawable.cte_poi_biratnagar,
                "Biratnagar",
                "Este es el body que pasará a la detail"
            ),

            )

    }

}