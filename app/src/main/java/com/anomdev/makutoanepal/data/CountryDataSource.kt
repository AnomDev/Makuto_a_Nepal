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
            CategoryType.NATURE -> retrieveNature()
            CategoryType.POI -> retrievePOIs()
            CategoryType.TREKKING -> retrieveTrekking()
            CategoryType.GASTRONOMY -> retrieveGastronomy()
            CategoryType.OTHERS -> retrieveOthers()
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
                TopicElement(
                    R.drawable.silk_sea,
                    "Historia antigua",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Historia medieval",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Historia moderna",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Historia contemporánea",
                    "Siglo XX e.c hasta nuestros días (dinastia rana, revolución de 1951, sistema panchayat, democracia, guerra civil, república y actualidad)"
                ),
            )
        ),
        Topic(
            "Cultura",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Arte",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Lenguas",
                    "Este es el body que pasará a la detail"
                ),
                TopicElement(
                    R.drawable.silk_sea,
                    "Religión",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                ),
                TopicElement(
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
                    TopicElement(
                        R.drawable.cte_poi_sitapaila,
                        "Sitapaila",
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_tergar,
                        "Tergar Osel Ling",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_swayambhu,
                        "Swayambhunath",
                        "Este es el body que pasará a la detail"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_pashu,
                        "Pashupatinath",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_durbar,
                        "Durbar square",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_boudha,
                        "Boudhanath",
                        "Este es el body que pasará a la detail"

                    )
                )
            ),
            Topic(
                "Area de Pokhara",
                listOf(
                    TopicElement(
                        R.drawable.cte_poi_worldpeace,
                        "World Peace Stupa",
                        "\n" +
                                "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_sarangkot,
                        "Sarangkot",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_phewa,
                        "Phewa lake",
                        "Este es el body que pasará a la detail"
                    )
                )
            ),
            Topic(
                "Area de Mustang",
                listOf(
                    TopicElement(
                        R.drawable.cte_poi_lomanthang,
                        "Lo Manthang",
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_kagbeni,
                        "Kagbeni",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_jomsom,
                        "Jomsom",
                        "Este es el body que pasará a la detail"
                    ),
                )
            ),
            Topic(
                "Otras regiones",
                listOf(
                    TopicElement(
                        R.drawable.cte_poi_lumbini,
                        "Lumbini",
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_terai,
                        "Terai",
                        "Este es el body que pasará a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_biratnagar,
                        "Biratnagar",
                        "Este es el body que pasará a la detail"
                    )

                )
            )
        )
    }

    private fun retrieveNature() = listOf(
        Topic(
            "Montanias",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Montanias1",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Montanias2",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Montanias3",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                )
            )
        ),
        Topic(
            "Bosques",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Bosque1",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Bosque2",
                    "Este es el body que pasará a la detail"
                ),
                TopicElement(
                    R.drawable.silk_sea,
                    "Bosque3",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                )
            )
        )
    )

    private fun retrieveTrekking() = listOf(
        Topic(
            "Trekking",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Trekking1",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Trekking2",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Trekking3",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                )
            )
        )
    )

    private fun retrieveGastronomy() = listOf(
        Topic(
            "Comida",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Comida1",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Comida2",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Comida3",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Comida4",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Comida5",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                )
            )
        ),
        Topic(
            "Postres",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Postres1",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Postres2",
                    "Este es el body que pasará a la detail"
                ),
                TopicElement(
                    R.drawable.silk_sea,
                    "Postres3",
                    "Sitapaila es una aldea (antiguamente miembro del Comité por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal tenía una población de 5156 habitantes y 1008 hogares"
                )
            )
        )
    )

    private fun retrieveOthers() = listOf(
        Topic(
            "Other",
            listOf(
                TopicElement(
                    R.drawable.silk_sea,
                    "Other1",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Other2",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Other3",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                )
            )
        )
    )

}
