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
                            "Aproximadamente entre el 450 y 750, en Nepal gobern?? el reino " +
                            "Licchavi;1\u200B las evidencias arqueol??gicas de este per??odo " +
                            "consisten en inscripciones en piedra.\n" +
                            "\n" +
                            "La mayor??a de las inscripciones listan las fechas de fabricaci??n y " +
                            "comisionado de las construcciones en piedra, otras informan sobre " +
                            "edictos reales, mantras religiosos o notas hist??ricas; es gracias a " +
                            "la corroboraci??n de los mitos locales que se ha podido identificar a" +
                            " un pueblo anterior a los licchavi, conocidos como los kir?????a, " +
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
                    "Historia contempor??nea",
                    "Siglo XX e.c hasta nuestros d??as (dinastia rana, revoluci??n de 1951, " +
                            "sistema panchayat, democracia, guerra civil, rep??blica y actualidad)" +
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
                    "Un thangka, tambi??n llamado Tangka, Thanka o Tanka (tibetano: ???????????????, Nepal" +
                            " Bhasa: ????????????) es un tapiz o bandera budista, de seda pintada o bordada." +
                            " Suele colgarse en monasterios o altares familiares y ocasionalmente es" +
                            " llevado por los monjes en procesiones ceremoniales religiosas." +
                            "\n" +
                            "\n" +
                            "Originalmente, las pinturas thangka se hicieron populares entre los " +
                            "monjes itinerantes ya que las pinturas en rollos eran f??ciles de " +
                            "transportar de monasterio en monasterio. Estos thangka eran importantes" +
                            " herramientas de ense??anza, ya que mostraban escenas de la vida del " +
                            "Buda, o a varios destacados Lamas, o a otras deidades o a Bodhisattva." +
                            " Un tema popular de los thangka es La rueda de la vida, que es una " +
                            "representaci??n visual de las ense??anzas del Abhidharma (o Arte de la" +
                            " Iluminaci??n)" +
                            "\n" +
                            "\n" +
                            "Mientras que para algunas personas estos son solo coloridos tapices, " +
                            "para los budistas, estas pinturas religiosas tibetanas poseen una" +
                            " belleza que se interpreta como una manifestaci??n de ciertas energ??as " +
                            "iluminadas, y por lo tanto son visualmente estimulantes."

                ),
                TopicElement(
                    R.drawable.history_language,
                    "Lenguas",
                    "En Nepal se hablan m??s de 120 idiomas diferentes pero el idioma nacional" +
                            ", el nepal??s, es el m??s extensamente hablado. Se ense??a en escuelas y" +
                            " es usado por el gobierno. El nepal??s tambi??n se habla en But??n, y " +
                            "partes de la India y de Birmania." +
                            "\n" +
                            "\n" +
                            " Incluye influencias del s??nscrito y los idiomas tib??ticos y birmanos " +
                            "vecinos. Tambi??n comparte similitudes con el hindi, que utiliza el " +
                            "mismo estilo de escritura"
                ),
                TopicElement(
                    R.drawable.history_religion,
                    "Religi??n",
                    "De acuerdo con el censo del a??o 2001, el 81% de los habitantes son" +
                            " hinduistas. Los budistas constituyen el 11%, los musulmanes el 4 % y" +
                            " otras religiones el 3 %, tambi??n existen minor??as de ateos y cristianos."
                ),
                TopicElement(
                    R.drawable.history_specialdays,
                    "Festividades",
                    "Indra J??tr?? es el festival callejero religioso m??s grande de Katmand?? " +
                            "\n" +
                            "\n" +
                            "Las celebraciones consisten en dos eventos, Indra J??tr?? y Kum??ri J??tr??." +
                            "Indra J??tr?? est?? marcado por bailes enmascarados de deidades y demonios, " +
                            "exhibiciones de im??genes sagradas y cuadros en honor a la deidad Indra, " +
                            "el rey del cielo. Kum??ri J??tr?? es la procesi??n de carros de la diosa" +
                            "viviente Kumari."
                )
            )
        )
    )

    private fun retrievePOIs(): List<Topic> {
        //TODO move out hardcoded strings

        return listOf(
            Topic(
                "??rea de Katmand??",
                listOf(
                    TopicElement(
                        R.drawable.cte_poi_sitapaila,
                        "Sitapaila",
                        "Sitapaila es una aldea (antiguamente miembro del Comit?? por el " +
                                "Desarrollo de los Pueblos) que ahora forma parte del Municipio de" +
                                " Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento" +
                                " del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y" +
                                " 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_tergar,
                        "Tergar Osel Ling",
                        "Este es el body que pasar?? a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_swayambhu,
                        "Swayambhunath",
                        "Este es el body que pasar?? a la detail"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_pashu,
                        "Pashupatinath",
                        "Este es el body que pasar?? a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_durbar,
                        "Durbar square",
                        "Este es el body que pasar?? a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_boudha,
                        "Boudhanath",
                        "Este es el body que pasar?? a la detail"

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
                                "Sitapaila es una aldea (antiguamente miembro del Comit?? por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_sarangkot,
                        "Sarangkot",
                        "Este es el body que pasar?? a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_phewa,
                        "Phewa lake",
                        "Este es el body que pasar?? a la detail"
                    )
                )
            ),
            Topic(
                "Area de Mustang",
                listOf(
                    TopicElement(
                        R.drawable.cte_poi_lomanthang,
                        "Lo Manthang",
                        "Sitapaila es una aldea (antiguamente miembro del Comit?? por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_kagbeni,
                        "Kagbeni",
                        "Este es el body que pasar?? a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_jomsom,
                        "Jomsom",
                        "Este es el body que pasar?? a la detail"
                    ),
                )
            ),
            Topic(
                "Otras regiones",
                listOf(
                    TopicElement(
                        R.drawable.cte_poi_lumbini,
                        "Lumbini",
                        "Sitapaila es una aldea (antiguamente miembro del Comit?? por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y 1008 hogares"
                    ),
                    TopicElement(
                        R.drawable.cte_poi_terai,
                        "Terai",
                        "Este es el body que pasar?? a la detail"

                    ),
                    TopicElement(
                        R.drawable.cte_poi_biratnagar,
                        "Biratnagar",
                        "Este es el body que pasar?? a la detail"
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
                            "las dos especies de f??lidos pertenecientes al g??nero Neofelis. " +
                            "\n" +
                            "\n" +
                            "Tiene una longitud de 60 a 110 cm; las hembras un peso de 11 a 20 kg y " +
                            "los machos hasta 65 kg. De h??bitos arbor??colas, esta especie es una " +
                            "excelente trepadora que se mueve ??gilmente por las ramas gracias a su " +
                            "larga cola que act??a a modo de balanc??n. El pelaje est?? cubierto de " +
                            "grandes manchas irregulares de borde negro e interior pardo, lo que" +
                            " ayuda a la pantera nebulosa a confundirse entre las hojas. " +
                            "\n" +
                            "\n" +
                            "Su nombre procede precisamente de estas manchas, de forma parecida a una nube."

                ),
                TopicElement(
                    R.drawable.nature_yak,
                    "Yak",
                    "El yak (Bos mutus o Bos grunniens) es un mam??fero b??vido de " +
                            "tama??o mediano y pelaje lanoso, nativo de las monta??as de Asia " +
                            "Central y el Himalaya, vive en las altiplanicies esteparias y fr??os " +
                            "desiertos del Nepal, T??bet, Pamir y Karak??rum, entre los 4000 y " +
                            "6000 metros de altitud, donde se encuentra tanto en estado salvaje " +
                            "como dom??stico."
                ),
                TopicElement(
                    R.drawable.nature_rhyno,
                    "Rinoceronte indio",
                    "El rinoceronte indio (Rhinoceros unicornis) es una especie de mam??fero " +
                            "perisod??ctilo de la familia Rhinocerotidae, una de las tres especies " +
                            "de rinoceronte que existen actualmente en Asia. Las otras son el" +
                            " rinoceronte de Java, con la que est?? estrechamente emparentada, " +
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
                    "Rhododendron arboreum, tambi??n denominado burans o laligurans o " +
                            "simplemente gurans (en nepal??, ??????????????????) en Nepal, es un arbusto " +
                            "siempreverde o ??rbol peque??o con una fronda florida de flores " +
                            "rojo brillante." +
                            "\n" +
                            "\n" +
                            " Es propio de But??n, China, India, Myanmar, Sri Lanka, Pakist??n " +
                            "y Tailandia pero tambi??n existe, y de hecho es la flor nacional, en Nepal."
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Bosque2",
                    "Este es el body que pasar?? a la detail"
                ),
                TopicElement(
                    R.drawable.silk_sea,
                    "Bosque3",
                    "Sitapaila es una aldea (antiguamente miembro del Comit?? por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y 1008 hogares"
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
                    "Sitapaila es una aldea (antiguamente miembro del Comit?? por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y 1008 hogares"
                ),
                TopicElement(
                    R.drawable.bluegridbackground,
                    "Postres2",
                    "Este es el body que pasar?? a la detail"
                ),
                TopicElement(
                    R.drawable.silk_sea,
                    "Postres3",
                    "Sitapaila es una aldea (antiguamente miembro del Comit?? por el Desarrollo de los Pueblos) que ahora forma parte del Municipio de Nagarjun en la Provincia No. 3 del centro de Nepal. En el momento del censo de 1991, Nepal ten??a una poblaci??n de 5156 habitantes y 1008 hogares"
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
