package com.anomdev.makutoanepal.data.country

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
        delay(1000)
        return retrieveCategories()
    }


    override suspend fun getTopicInformation(categoryType: CategoryType): List<Topic> {
        delay(1000)
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
                    R.drawable.history_ancient,
                    "Historia antigua",
                    "Siglo IV a.e.c hasta s. VIII e.c." +
                            "\n" +
                            "\n" +
                            "Aproximadamente entre el 450 y 750, en Nepal gobernó el reino " +
                            "Licchavi;1\u200B las evidencias arqueológicas de este período " +
                            "consisten en inscripciones en piedra.\n" +
                            "\n" +
                            "La mayoría de las inscripciones listan las fechas de fabricación y " +
                            "comisionado de las construcciones en piedra, otras informan sobre " +
                            "edictos reales, mantras religiosos o notas históricas; es gracias a " +
                            "la corroboración de los mitos locales que se ha podido identificar a" +
                            " un pueblo anterior a los licchavi, conocidos como los kirāṭa, " +
                            "pueblo del que se sabe muy poco."
                ),
                TopicElement(
                    R.drawable.history_medieval,
                    "Historia medieval",
                    "Siglo IX e.c. hasta s.XVII e.c" +
                            "\n" +
                            "\n" +
                            "NO HAY INFO !!!"
                ),
                TopicElement(
                    R.drawable.history_modern,
                    "Historia moderna",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicElement(
                    R.drawable.history_actual,
                    "Historia contemporánea",
                    "Siglo XX e.c hasta nuestros días (dinastia rana, revolución de 1951, " +
                            "sistema panchayat, democracia, guerra civil, república y actualidad)" +
                            "\n" +
                            "\n" +
                            "AAAAAAAAAAA"
                ),
            )
        ),
        Topic(
            "Cultura",
            listOf(
                TopicElement(
                    R.drawable.history_art,
                    "Arte",
                    "Un thangka, también llamado Tangka, Thanka o Tanka (tibetano: ཐང་ཀ་, Nepal" +
                            " Bhasa: पौभा) es un tapiz o bandera budista, de seda pintada o bordada." +
                            " Suele colgarse en monasterios o altares familiares y ocasionalmente es" +
                            " llevado por los monjes en procesiones ceremoniales religiosas." +
                            "\n" +
                            "\n" +
                            "Originalmente, las pinturas thangka se hicieron populares entre los " +
                            "monjes itinerantes ya que las pinturas en rollos eran fáciles de " +
                            "transportar de monasterio en monasterio. Estos thangka eran importantes" +
                            " herramientas de enseñanza, ya que mostraban escenas de la vida del " +
                            "Buda, o a varios destacados Lamas, o a otras deidades o a Bodhisattva." +
                            " Un tema popular de los thangka es La rueda de la vida, que es una " +
                            "representación visual de las enseñanzas del Abhidharma (o Arte de la" +
                            " Iluminación)" +
                            "\n" +
                            "\n" +
                            "Mientras que para algunas personas estos son solo coloridos tapices, " +
                            "para los budistas, estas pinturas religiosas tibetanas poseen una" +
                            " belleza que se interpreta como una manifestación de ciertas energías " +
                            "iluminadas, y por lo tanto son visualmente estimulantes."

                ),
                TopicElement(
                    R.drawable.history_language,
                    "Lenguas",
                    "En Nepal se hablan más de 120 idiomas diferentes pero el idioma nacional" +
                            ", el nepalés, es el más extensamente hablado. Se enseña en escuelas y" +
                            " es usado por el gobierno. El nepalés también se habla en Bután, y " +
                            "partes de la India y de Birmania." +
                            "\n" +
                            "\n" +
                            " Incluye influencias del sánscrito y los idiomas tibéticos y birmanos " +
                            "vecinos. También comparte similitudes con el hindi, que utiliza el " +
                            "mismo estilo de escritura"
                ),
                TopicElement(
                    R.drawable.history_religion,
                    "Religión",
                    "De acuerdo con el censo del año 2001, el 81% de los habitantes son" +
                            " hinduistas. Los budistas constituyen el 11%, los musulmanes el 4 % y" +
                            " otras religiones el 3 %, también existen minorías de ateos y cristianos."
                ),
                TopicElement(
                    R.drawable.history_specialdays,
                    "Festividades",
                    "Indra Jātrā es el festival callejero religioso más grande de Katmandú " +
                            "\n" +
                            "\n" +
                            "Las celebraciones consisten en dos eventos, Indra Jātrā y Kumāri Jātrā." +
                            "Indra Jātrā está marcado por bailes enmascarados de deidades y demonios, " +
                            "exhibiciones de imágenes sagradas y cuadros en honor a la deidad Indra, " +
                            "el rey del cielo. Kumāri Jātrā es la procesión de carros de la diosa" +
                            "viviente Kumari."
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
                        "Sitapaila es una aldea (antiguamente miembro del Comité por el " +
                                "Desarrollo de los Pueblos) que ahora forma parte del Municipio de" +
                                " Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento" +
                                " del censo de 1991, Nepal tenía una población de 5156 habitantes y" +
                                " 1008 hogares"
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
            "Fauna",
            listOf(
                TopicElement(
                    R.drawable.nature_pantera,
                    "Pantera nebulosa",
                    "La pantera nebulosa o leopardo longibando (Neofelis nebulosa) es una de " +
                            "las dos especies de félidos pertenecientes al género Neofelis. " +
                            "\n" +
                            "\n" +
                            "Tiene una longitud de 60 a 110 cm; las hembras un peso de 11 a 20 kg y " +
                            "los machos hasta 65 kg. De hábitos arborícolas, esta especie es una " +
                            "excelente trepadora que se mueve ágilmente por las ramas gracias a su " +
                            "larga cola que actúa a modo de balancín. El pelaje está cubierto de " +
                            "grandes manchas irregulares de borde negro e interior pardo, lo que" +
                            " ayuda a la pantera nebulosa a confundirse entre las hojas. " +
                            "\n" +
                            "\n" +
                            "Su nombre procede precisamente de estas manchas, de forma parecida a una nube."

                ),
                TopicElement(
                    R.drawable.nature_yak,
                    "Yak",
                    "El yak (Bos mutus o Bos grunniens) es un mamífero bóvido de " +
                            "tamaño mediano y pelaje lanoso, nativo de las montañas de Asia " +
                            "Central y el Himalaya, vive en las altiplanicies esteparias y fríos " +
                            "desiertos del Nepal, Tíbet, Pamir y Karakórum, entre los 4000 y " +
                            "6000 metros de altitud, donde se encuentra tanto en estado salvaje " +
                            "como doméstico."
                ),
                TopicElement(
                    R.drawable.nature_rhyno,
                    "Rinoceronte indio",
                    "El rinoceronte indio (Rhinoceros unicornis) es una especie de mamífero " +
                            "perisodáctilo de la familia Rhinocerotidae, una de las tres especies " +
                            "de rinoceronte que existen actualmente en Asia. Las otras son el" +
                            " rinoceronte de Java, con la que está estrechamente emparentada, " +
                            "y el raro rinoceronte de Sumatra."
                )
            )
        ),
        Topic(
            "Flora",
            listOf(
                TopicElement(
                    R.drawable.nature_rododendro,
                    "Rododendro",
                    "Rhododendron arboreum, también denominado burans o laligurans o " +
                            "simplemente gurans (en nepalí, गुराँस) en Nepal, es un arbusto " +
                            "siempreverde o árbol pequeño con una fronda florida de flores " +
                            "rojo brillante." +
                            "\n" +
                            "\n" +
                            " Es propio de Bután, China, India, Myanmar, Sri Lanka, Pakistán " +
                            "y Tailandia pero también existe, y de hecho es la flor nacional, en Nepal."
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
                    R.drawable.trek_poon,
                    "Ghorepani-Poon Hill",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.trek_ebc,
                    "Everest Base Camp",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.trek_abc,
                    "Annapurna Base Camp",
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
                    R.drawable.gastronomy_momo,
                    "Momo",
                    "Siglo IV a.e.c hasta s. VIII e.c."
                ),
                TopicElement(
                    R.drawable.gastronomy_choila,
                    "Choila",
                    "Siglo IX e.c. hasta s.XVII e.c"
                ),
                TopicElement(
                    R.drawable.gastronomy_chaang,
                    "Chaang",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicElement(
                    R.drawable.gastronomy_chutney,
                    "Vanko chutney",
                    "Siglo XVIII e.c. hasta s. XIX e.c"
                ),
                TopicElement(
                    R.drawable.gastronomy_naan,
                    "Naan",
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
