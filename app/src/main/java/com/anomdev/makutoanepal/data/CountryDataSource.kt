package com.anomdev.makutoanepal.data

import com.anomdev.makutoanepal.R
import kotlinx.coroutines.delay


interface CountryDataSource {
    /**
     * Get all [Category]s available
     */
    suspend fun getCategories(): List<Category>

    /**
     * Get all information from a specific [Category]
     */
    suspend fun getTopicInformation(categoryType: CategoryType): List<Topic>
}

/**
 * Emulates a connection against a Remote Data Source (ex. our own Wordpress server)
 */
class CountryDataSourceImpl : CountryDataSource {
    override suspend fun getCategories(): List<Category> {
        delay(2000)
        return retrieveCategories()
    }


    override suspend fun getTopicInformation(categoryType: CategoryType): List<Topic> {
        delay(2000)
        return when (categoryType) {
            CategoryType.CULTURE -> retrieveHistoryAndCulture()
            CategoryType.NATURE -> TODO()
            CategoryType.POI -> retrievePOIs()
            CategoryType.TREKKING -> TODO()
            CategoryType.GASTRONOMY -> TODO()
            CategoryType.OTHERS -> TODO()
        }
    }

    private fun retrieveCategories(): List<Category> {
        return listOf(
            Category(
                CategoryType.CULTURE,
                R.drawable.culture,
                R.string.history_culture
            ),
            Category(
                CategoryType.NATURE,
                R.drawable.nature,
                R.string.nature
            ),
            Category(
                CategoryType.POI,
                R.drawable.point_of_interest,
                R.string.poi
            ),
            Category(
                CategoryType.TREKKING,
                R.drawable.trekkings,
                R.string.trekkings
            ),
            Category(
                CategoryType.GASTRONOMY,
                R.drawable.gastronomy,
                R.string.gastronomy
            ),
            Category(
                CategoryType.OTHERS,
                R.drawable.others,
                R.string.others
            )
        )
    }

    private fun retrieveHistoryAndCulture() = listOf(
        Topic(
            "Historia",
            listOf(
                TopicItem(
                    R.drawable.silk_sea,
                    "Historia antigua",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicItem(
                    R.drawable.bluegridbackground,
                    "Historia medieval",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicItem(
                    R.drawable.bluegridbackground,
                    "Historia moderna",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicItem(
                    R.drawable.bluegridbackground,
                    "Historia contemporánea",
                    "Siglo XX e.c hasta nuestros días (dinastia rana, revolución de 1951, sistema panchayat, democracia, guerra civil, república y actualidad)"
                ),
            )
        ),
        Topic(
            "Cultura",
            listOf(
                TopicItem(
                    R.drawable.silk_sea,
                    "Arte",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                ),
                TopicItem(
                    R.drawable.bluegridbackground,
                    "Lenguas",
                    "Este es el body que pasará a la detail"
                ),
                TopicItem(
                    R.drawable.silk_sea,
                    "Religión",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                ),
                TopicItem(
                    R.drawable.bluegridbackground,
                    "Festividades",
                    "Este es el body que pasará a la detail"
                )
            )
        )
    )

    private fun retrievePOIs(): List<Topic> {
        //TODO move out hardcoded strings

        return listOf(
            Topic(
                "Área de Katmandú",
                listOf(
                    TopicItem(
                        R.drawable.cte_poi_sitapaila,
                        "Sitapaila",
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicItem(
                        R.drawable.cte_poi_tergar,
                        "Tergar Osel Ling",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicItem(
                        R.drawable.cte_poi_swayambhu,
                        "Swayambhunath",
                        "Este es el body que pasará a la detail"
                    ),
                    TopicItem(
                        R.drawable.cte_poi_pashu,
                        "Pashupatinath",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicItem(
                        R.drawable.cte_poi_durbar,
                        "Durbar square",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicItem(
                        R.drawable.cte_poi_boudha,
                        "Boudhanath",
                        "Este es el body que pasará a la detail"

                    )
                )
            ),
            Topic(
                "Area de Pokhara",
                listOf(
                    TopicItem(
                        R.drawable.cte_poi_worldpeace,
                        "World Peace Stupa",
                        "\n" +
                                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicItem(
                        R.drawable.cte_poi_sarangkot,
                        "Sarangkot",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicItem(
                        R.drawable.cte_poi_phewa,
                        "Phewa lake",
                        "Este es el body que pasará a la detail"
                    )
                )
            ),
            Topic(
                "Area de Mustang",
                listOf(
                    TopicItem(
                        R.drawable.cte_poi_lomanthang,
                        "Lo Manthang",
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicItem(
                        R.drawable.cte_poi_kagbeni,
                        "Kagbeni",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicItem(
                        R.drawable.cte_poi_jomsom,
                        "Jomsom",
                        "Este es el body que pasará a la detail"
                    ),
                )
            ),
            Topic(
                "Otras regiones",
                listOf(
                    TopicItem(
                        R.drawable.cte_poi_lumbini,
                        "Lumbini",
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicItem(
                        R.drawable.cte_poi_terai,
                        "Terai",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicItem(
                        R.drawable.cte_poi_biratnagar,
                        "Biratnagar",
                        "Este es el body que pasará a la detail"
                    )

                )
            )
        )
    }
}
