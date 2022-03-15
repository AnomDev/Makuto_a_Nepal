package com.anomdev.makutoanepal.data.blogpost

import kotlinx.coroutines.delay


interface BlogPostDataSource {
    /**
     * Get all [Category]s available
     */
    suspend fun getBlogPosts(): List<BlogPost>

}

class BlogPostDataSourceImpl : BlogPostDataSource {
    override suspend fun getBlogPosts(): List<BlogPost> {
        delay(1000)
        return retrieveBlogPosts()
    }
}


private fun retrieveBlogPosts(): List<BlogPost> {
    return listOf(
        BlogPost(
            "https://alongthisjourneyblog.files.wordpress.com/2015/11/p1160462.jpg",
            "La infancia en la región montañosa de Nepal",
            "13/01/2022",
            "Nepal tiene parte de la cordillera del Himalaya, la cordillera más alta del mundo" +
                    ". Ocho de los catorce ochomiles se encuentran en el país, ya sea en forma total" +
                    " o compartida a través de una frontera con el Tíbet o India.\n" +
                    "\n" +
                    "Al norte de los Grandes Himalaya, en el oeste de Nepal, las cordilleras " +
                    "fronterizas tibetanas (Tibetan Border Ranges) de unos 6000 m, forman la" +
                    " divisoria de las cuencas de los ríos Ganges-Brahmaputra, que en general" +
                    " sigue la frontera internacional. Al sur de los Grandes Himalayas, Nepal " +
                    "tiene una región de alta montaña, con cumbres de unos 4000 m; siguen a" +
                    " continuación, las Middle Hills y la cordillera Mahabharat, con cimas de" +
                    " 1500 a 3000 m. Al sur de los Mahabharats, una hay una cordillera exterior" +
                    " con cumbres de unos 1000 m, llamada los Siwaliks o Churiya Hills. Esta lista" +
                    " recoge las montañas y picos más altos de Nepal en el territorio nacional de" +
                    " Nepal, incluidas todas las elevaciones con una prominencia de al menos 150 m." +
                    " La lista está completa en el rango de 6900 a 8848 metros sobre el nivel del mar " +
                    ". Ocho de cada 14 ochomiles se encuentran, al menos parcialmente, en Nepal. " +
                    "Otros 36 picos principales alcanzan una altura de más de 7000 m."
        ),
        BlogPost(
            "https://www.publico.es/uploads/2016/05/18/573c0f92e7307.jpg",
            "Carlos Soria: \"Voy a intentar no hardcodear textos\"",
            "01/01/2022",
            "Carlos Soria Fontán (Ávila, 5 de febrero de 1939)1\u200B es un alpinista español " +
                    "que, con más de 80 años, está inmerso en el reto de ser la persona de más edad " +
                    "en alcanzar la cumbre de las 14 montañas más altas del mundo.2\u200B Es el" +
                    " único alpinista que ha escalado diez montañas de más de 8000 metros después " +
                    "de cumplir los 60 años, y es la persona más veterana en la historia que ha " +
                    "ascendido con éxito al K2 (65 años), Broad Peak (68 años), Makalu (69 años)," +
                    " Gasherbrum I (70 años), Manaslu (71 años), Kanchenjunga (75 años) y " +
                    "Annapurna (77 años)." +
                    "Por orden cronológico: 5\u200B\n" +
                    "\n" +
                    "Nanga Parbat (8125 m), Pakistán, 1990\n" +
                    "Gasherbrum II (8035 m), China/Pakistán, 1994\n" +
                    "Cho Oyu (8201 m), China/Nepal, 1999\n" +
                    "Everest (8848 m), China/Nepal, 2001\n" +
                    "K2 (8611 m), China/Pakistán, 2004\n" +
                    "Broad Peak (8047 m), China/Pakistán, 2007\n" +
                    "Makalu (8465 m), China/Nepal, 2008\n" +
                    "Gasherbrum I (8068 m), China/Pakistán, 2009\n" +
                    "Manaslu (8156 m), Nepal, 2010\n" +
                    "Lhotse (8516 m), China/Nepal, 2011\n" +
                    "Kanchenjunga (8586 m), Nepal, 20146\u200B\n" +
                    "Annapurna (8091 m), Nepal, 20167\u200B\n" +
                    "Asimismo, cabe destacar que, en 2005,8\u200B Carlos Soria ascendió a la " +
                    "cumbre central del Shisha Pangma en el Tíbet. Sin embargo, dicha cumbre no se " +
                    "suele tener en cuenta en su historial de ochomiles debido a que su altitud es " +
                    "inferior a la cumbre principal de la montaña (8027 m) y a que hay discrepancias" +
                    " respecto a la verdadera altitud de dicha cumbre central (según diversas " +
                    "fuentes se ha medido en 7999, 8008 y 8013 metros).\n" +
                    "\n" +
                    "En octubre de 2013 volvió intentar el ascenso a la cumbre central del Shisha " +
                    "Pangma pero tuvo que dejár la ascensión debido a las malas condiciones" +
                    " meteorológicas.9\u200B\n" +
                    "\n" +
                    "Según él mismo ha anunciado, volverá a intentar subir a la cumbre central " +
                    "del Shisha Pangma en septiembre del 2021.10\u200B"
        ),
        BlogPost(
            "https://alongthisjourneyblog.files.wordpress.com/2016/01/img-20151016-wa0011.jpg",
            "Los sadhus, eremitas que se entregan a la fe",
            "24/12/2021",
            "Un sadhu (Saa-dhu) es un asceta hindú o un monje que sigue el camino de la " +
                    "penitencia y la austeridad para obtener la iluminación y la felicidad.\n" +
                    "\n" +
                    "Es la cuarta fase de la vida en la religión hindú, después de estudiar, " +
                    "de ser padre y de ser peregrino. La tradición sadhu consiste en renunciar " +
                    "a todos los vínculos que los unen a lo terrenal o material en la búsqueda" +
                    " de los verdaderos valores de la vida. Por norma general, un sahdu vive incluido " +
                    "en la sociedad, pero intenta ignorar los placeres y dolores humanos.\n" +
                    "\n" +
                    "Muchos sadhus imitan la vida mitológica de Shiva, el principal de todos los" +
                    " ascetas. Llevan un tridente simbólico y se pintan tres rayas de ceniza en su" +
                    " frente para representar los tres aspectos de Shiva en su búsqueda asceta para " +
                    "destruir las tres impurezas (egoísmo, acción con deseo y el maya). Llevan " +
                    "túnicas de color azafrán, que significan que han sido bendecidos con la sangre" +
                    " fértil de Parvati, la consorte de Shiva.\n" +
                    "\n" +
                    "Dedican la mayor parte de su tiempo a la meditación. Muchos de estos se " +
                    "reúnen en determinadas fiestas como es el Kumbhamela.\n" +
                    "\n" +
                    "Los sadhus son la respuesta en India para el sistema de valores. Han dejado " +
                    "atrás todas las ataduras materiales para liberarse a un mundo con la realidad" +
                    " divina, y viven en cuevas, bosques y templos por toda la India. Existen" +
                    " alrededor de 4 o 5 millones de sadhus hoy en día en el país, y son personas " +
                    "respetadas, veneradas e incluso temidas. Son mantenidos por todos los ciudadanos" +
                    " que les donan alimentos.\n" +
                    "\n" +
                    "\n" +
                    "Sadhu con su discípulo.\n" +
                    "Hay muchas clases de sadhus. Dentro de los sadhus, los Nagas son los más" +
                    " prominentes ya que se mantienen desnudos, cubiertos solamente con un " +
                    "\"vibhuti\" o cenizas sagradas. Dejan crecer su pelo en bucles llamados jata.\n" +
                    "\n" +
                    "Los sadhus se dividen en tres principales \"akharas\" o denominaciones, " +
                    "las cuales fueron establecidas en el siglo VIII por el sabio Adi Shankaracharya." +
                    " Este estableció cuatro \"maths\" o centros en las cuatro puntas extremas " +
                    "de India. En estos akharas, los sadhus aprenden el control de la mente y " +
                    "del cuerpo hasta ser maestros del yoga.\n" +
                    "\n" +
                    "Los sadhus generalmente pasan el primer año de su vida, después de la" +
                    " renuncia a lo mundano, con sus gurus o maestros. Los sadhus tradicionales " +
                    "se rapan el cráneo como un signo de renuncia. Una vez que hayan aprendido " +
                    "las artes espirituales y de yoga, tienen que dejar al guru para caminar por " +
                    "las calles y bosques, nunca quedándose en un solo lugar ya que creen que" +
                    " moverse mantiene al cuerpo en alerta, mientras que quedarse en un lugar los" +
                    "hace inactivos."
        ),

        BlogPost(
            "https://www.excelenciasdelmotor.com/sites/default/files/inline-images/lukla2.jpg",
            "Lukla, el aeropuerto más peligroso del mundo (?)",
            "19/12/2021",
            "Lukla es una ciudad de la región de Khumbu al este de Nepal donde comienzan su viaje la gran mayoría de los visitantes del Himalaya. Lukla, a una altitud de 2.860 metros, cuenta con un pequeño aeropuerto, pero a pesar de su tamaño es muy conocido en el mundo de la aeronáutica por ser el aeropuerto más peligroso del mundo. Aunque Lukla significa lugar con muchas cabras, no es probable ver muchas en la actualidad.\n" +
                    "\n" +
                    "Alrededor del 90-95% de los visitantes extranjeros a la región llegan desde Katmandú, a ½ hora de vuelo. El resto puede llegar caminando desde Jiri, a siete u ocho días de viaje. En viajes organizados, la mayoría de los guías nepalíes y cocineros vienen caminando desde Jiri, normalmente, en la mitad de tiempo. Cuando Tenzing Norgay y Edmund Hillary realizaron su famosa primera ascensión al monte Everest en 1953, su expedición vino, igualmente, desde Jiri.\n" +
                    "\n" +
                    "Lukla cuenta con una cierta variedad de tiendas y albergues donde se pueden tomar comidas del tipo occidental y comprar los últimos objetos necesarios para la expedición, aunque también es posible aprovisionarse en Namche Bazaar en el camino hacia el Everest. Desde Lukla, gran parte de los grupos tardarán dos días hasta llegar a Namche Bazaar, un buen lugar para comenzar la aclimatación a la altitud.\n" +
                    "\n" +
                    "En enero de 2008, el aeropuerto fue rebautizado en honor de Sir Edmund Hillary y el Sherpa Tenzing Norgay, las primeras personas en alcanzar la cumbre del Monte Everest y también por efectuar los primeros esfuerzos para la construcción de este aeropuerto."
        ),

        BlogPost(
            "https://www.mochileandoporasia.com/wp-content/uploads/2018/12/Kathmandu-2.jpg",
            "Budismo e Hinduismo en Nepal: juntos pero no revueltos",
            "12/12/2021",
            "Las religiones védicas, el budismo y el yainismo, comparten una cultura regional situada alrededor del noreste indio, lo que hoy es Uttar Pradesh, Bijar y Nepal. Fue en esta región donde se compiló el Brijad-araniaka-upanishad, considerado entre los Upanishad más antiguos, bajo el imperio del rey Yanaka de Mithila. Tanto Siddhartha Gautama (después conocido como Buda) y Majavira (el histórico fundador del yainismo) provienen de esta región.\n" +
                    "\n" +
                    "La antigua India tenía dos líneas de pensamiento: las religiones shramana y las védicas (hoy continuadas en el hinduismo). Tanto el budismo como el yainismo son continuación de las tradiciones shramánicas que han coexistido con la tradición védica. Ambas corrientes han existido conjuntamente durante miles de años, influyendo y siendo influidas entre sí, durante todo ese tiempo.\n" +
                    "\n" +
                    "El budismo antiguo estaba muy influenciado además por la cosmología brahmánica, incorporando algunos de los conceptos que aparecen en los Upanishads.\n" +
                    "\n" +
                    "Siddharta Gautama aceptaba e incorporaba a su doctrina varias creencias ya existentes, pero teniendo en cuenta que para alcanzar la \"iluminación\" no debía aceptarse como fe ni a las autoridades, ni las escrituras ni la existencia de un dios.\n" +
                    "\n" +
                    "A su vez, religiones indias aparecidas posteriormente, fueron influidas por las nuevas interpretaciones e ideas nuevas del budismo.\n" +
                    "\n" +
                    "El budismo tuvo un cierto predominio en el subcontinente indio, pero fue eclipsado en su lugar de origen por el hinduismo y el islamismo. En cambio, el budismo floreció fuera de India. Así el budismo tibetano puede ser visto como una continuación del budismo tal y como existía en India antes de las invasiones musulmanas. Hoy en día predomina en la región del Himalaya, como budismo theravada (en Sri Lanka) y como budismo zen (en el este de Asia)."
        ),

        BlogPost(
            "https://alongthisjourneyblog.files.wordpress.com/2015/10/img-20151013-wa0003.jpg",
            "5 trucos para fastidiar todas las fotos de un viaje por los Annapurnas",
            "03/12/2021",
            "Tras abrigarme como si no hubiera un mañana, salí fuera. Esa mañana nos levantamos ansiosos mirando al cielo y, por fin, Indra, el dios de las tormentas (o el azar más favorecedor) nos brindó la oportunidad de disfrutar de esas elevadas cimas. Unas montañas que con su blanco fulgor, destacaban sobre todo lo demás. Esa enorme pared de nieve que separaba dos valles y que parecía que estuvieran ahí, con el zoom de la cámara, a unos pocos metros. Las sensaciones se confrontaban con la tensión de hacer la mejor foto; Javi ya había sacado todo su potencial para capturar el mejor recuerdo en forma de imagen y yo, aún tardaría un poco más en sacar la cámara. Me apetecía disfrutar de esa panorámica que se abría ante mis ojos: la amalgama de colores blancos, negros y azulados; la sensación de frío polar que generaba mirar las nubes que parecían nacer desde las cimas; la soledad de imaginar que por un momento yo estuviera allí; o el respeto de pensar que hay personas (héroes o inconscientes) que emprenden la escalada hasta los techos del planeta Tierra. Mi hermano estaba buscando las mejores luces, aunque aún era bastante pronto y el sol aún no se había decidido a despertar: todavía faltaba para que los haces de luz le dieran a cada montaña su mágico brillar.\n" +
                    "\n" +
                    "Sin duda, la montaña que más destacaba por si singular belleza era el Macchapucchre. Una montaña que, con sus dos picos, me hacía recordar a ese tornavaqueño Peña Negra (1.827m) en su versión más colosal, por supuesto. Su nombre en nepalí, Macchapucchre, tiene su traducción al inglés y es uno de los nombres que más he visto utilizar por los propietarios de guest houses para llamar a la suya: Fish’s Tail (cola de pescado). Como veréis en una foto un poquito más abajo, es un nombre muy bien elegido para esta montaña por su parecido con la cola de algunos peces. Pero esta montaña tiene también su leyenda: su propia mitología. Jamás nadie ha escalado esta montaña, pero no por su dificultad ni por su altitud, la razón es puramente supersticiosa como quien dice. Según la cultura popular (o la religión, según se quiera ver) de la región, esta montaña es muy querida por Shiva, quien a veces la toma como su hogar, y por ende se decidió prohibir cualquier intento de ascensión a la misma quedando como una de las pocas montañas del mundo (casi) totalmente virgen aún a día de hoy. Sólo se intentó una vez, en el año 1957, por un grupo de escaladores británicos. Subieron por la cara norte pero no pudieron completar su ascensión, a cincuenta metros de la cima decidieron darse la vuelta: habían prometido al Gobierno (y pueblo) de Nepal que jamás pisarían su cima."
        ),

        BlogPost(
            "https://www.lugaresdeaventura.com/sites/default/files/inline-images/14-peaks.jpeg",
            "Estreno mundial de \"14 Peaks: Nothis is impossible\" del escalador Nirmal Purja",
            "29/11/2021",
            "Nirmal Purja (Distrito de Myagdi, Nepal, 1984)1\u200B también conocido como Nims, es un militar y alpinista nepalí.2\u200B3\u200B\n" +
                    "\n" +
                    "El 9 de junio de 2018, fue nombrado por la reina Isabel II, Miembro de la Orden del Imperio Británico.4\u200B\n" +
                    "\n" +
                    "Purja ganó relevancia internacional con su proyecto \"Project Possible 14/7\", consistente en coronar los catorce ocho miles en solo siete meses (con la ayuda suplementaria de oxígeno embotellado), pulverizando el anterior récord del mundo de 2013, cuando el montañero coreano Kim Chang-ho completó las catorce cumbres después de siete años, diez meses y seis días.5\u200B\n" +
                    "\n" +
                    "El 29 de octubre de 2019, Purja, completó su gesta coronando la cima del Sishapangma y con ello el último de los catorce ochomiles en menos de siete meses, pulverizando la anterior marca mundial.6\u200B\n" +
                    "\n" +
                    "El 2020 , Purja hizo el primer ascenso invernal en el K2, convirtiéndose así en el primer montañista en coronar la cima de la segunda montaña más alta y peligrosa del mundo."
        ),
        BlogPost(
            "https://www.spotlightnepal.com/media/images/Nekapaa-70th-Anniversary-1-2.2e16d0ba.fill-650x500.jpg",
            "Los maoístas suben al poder en coalición con el partido congresista",
            "20/11/2021",
            "Marxismo-Leninismo-Maoísmo-Camino Prachanda (en nepalí: मालेमावाद र प्रचण्डपथ Mālemāvād ra Prachaṇḍapath, a veces abreviado a Camino Prachanda) se refiere a la línea ideológica del Partido Comunista Unificado de Nepal (Maoísta), también conocido como PCUN(M). Es considerado un desarrollo del Marxismo-Leninismo-Maoísmo (MLM) y recibió el nombre del líder de la PCUN(M), Pushpa Kamal Dahal, generalmente conocido como Prachanda\u200B El Camino Prachanda fue proclamado en 2001. La ideología fue parcialmente inspirada en el ejemplo del Partido Comunista del Perú (Sendero Luminoso), que se refiere a su línea ideológica como \"Marxismo-Leninismo-Maoísmo-Pensamiento Gonzalo\".\u200B\n" +
                    "\n" +
                    "El Camino Prachanda no pretende romper ideológicamente con el marxismo, leninismo o maoísmo, pero pretende antes ser una extensión de estas ideologías, basada en la política de Nepal. La doctrina apareció tras el partido determinar que las ideologías del Marxismo, Leninismo, y Maoísmo ya no podían ser practicadas en su totalidad como en el pasado. El partido adoptó el Camino Prachanda por considerarlo una ideología adecuada, con base en la realidad de la política nepalesa. Militarmente y en el contexto del conflicto armado de 1996-2006 en Nepal, el punto céntrico de la ideología fue la realización de la revolución por medio del control de las áreas rurales y del cerco de los aglomerados urbanos\u200B\n" +
                    "\n" +
                    "Hoy, las posiciones de Prachanda son vistas por algunos marxistas-leninistas-maoístas en todo el mundo como \"revisionistas\", y son criticadas por organizaciones revolucionarias en Nepal.\u200B Esas críticas se concentran en la entrada del Partido Comunista Unificado de Nepal (Maoísta) en la política partidaria dominante en Nepal. Estas críticas también se basaron en la cooperación entre el PCUN-M bajo Pushpa Kamal Dahal y el Partido Comunista de Nepal (Marxista-Leninista Unificado).5\u200B"
        ),

        BlogPost(
            "https://alongthisjourneyblog.files.wordpress.com/2015/11/p1160473.jpg?w=768",
            "La mujer nepalesa, ejemplo de superación",
            "14/11/2021",
            "epal se encuentra en la posición 149 de 189 países en desigualdad de género, según el índice de desigualdad de Naciones Unidas. En su sociedad contemporánea siguen arraigadas las formas históricas patriarcales. Una desigualdad de poder en la que la mujer pasa de estar bajo el dominio del padre al del marido. En estas esferas privadas se mueve la suerte de las mujeres nepalíes, cuyo papel y obligaciones están atadas a las tradiciones y la jerarquía social.\n" +
                    "\n" +
                    "La nueva Constitución aprobada en 2015 y las leyes de la novísima República de Nepal miran hacia la igualdad. En ella está garantizada que el 33% de los diputados del Parlamento sean mujeres (hace diez años apenas rozaban el 6%) o que, a nivel local, el 40% de cargos políticos se reserven para ellas."
        ),

        BlogPost(
            "https://static-abcblogs.abc.es/wp-content/uploads/sites/13/2017/11/Kumari-AFP.jpg",
            "Kumari Devi: la diosa viviente del Nepal",
            "06/11/2021",
            "Kumari, o Kumari Deví es el nombre con que se designa a una persona a quien se le considera como una diosa viviente en Nepal. En idioma sánscrito, kumari significa \"inocente, virgen, puro\". Después, en idioma nepalí, kumari pasó a significar ‘niña virgen’. Se cree que una Kumari es la reencarnación de la diosa Taleju hasta que la niña comienza a menstruar, después de lo cual, los nepalíes creen que esta diosa se desencarna de su cuerpo, y por tanto su vida como diosa sagrada es realmente corta.\n" +
                    "\n" +
                    "Una Kumari es una niña seleccionada de la casta shakia, perteneciente a la comunidad nepalesa de Newari. La Kumari es venerada e idolatrada por algunos de los hinduistas del país, como también por budistas nepalíes, pero no por los budistas tibetanos.1\u200BMientras que existen muchas Kumaríes a lo largo de todo el territorio nepalí, contando que algunas ciudades ostentan varias de ellas, la más conocida es la Kumari Real de Katmandú. Ella vive en el Kumari Ghar, un palacio en el centro de la ciudad. El proceso de selección es especialmente riguroso para las candidatas. La actual Kumari Real, Trishna Shakya, fue elegida el 28 de septiembre de 2017 a los tres años de edad.2\u200B\n" +
                    "\n" +
                    "Se cree que una Kumari es la reencarnación de la diosa Taleju hasta que la niña comienza a menstruar, después de lo cual, los nepalíes creen que esta diosa se desencarna de su cuerpo. Igualmente, una enfermedad grave o un accidente que ocasione un profuso derrame de sangre, también son consideradas como posibles causas para que ella pueda retornar a su previo estado como una niña normal. Aunque últimamente, una de las tres diosas nepalíes, una niña de nueve años, Sajani Shakya sería desposeída de su divinidad por el gobierno nepalí, más precisamente por el tribunal supremo de Nepal, por haber viajado a Estados Unidos por un mes y sin autorización, un caso insólito en los 700 años de historia de las diosas Kumari. Salir sin permiso de su templo de adoración es considerado en Nepal como un acto sacrílego, pues las Kumari no pueden ser tocadas por nadie y solamente se alimentan por medio de una comida ritual llamada pura.3\u200B"
        ),

        BlogPost(
            "https://alongthisjourneyblog.files.wordpress.com/2015/09/p1150468.jpg",
            "Los monos guardianes de Swayambhunath",
            "31/10/2021",
            "Swayambhunath (Devnagari : स्वयम्भूनाथ स्तुप romanizado como svayambhūnātha stupa) es un antiguo complejo religioso a lo alto de una colina en el valle de Katmandú, al oeste de la ciudad de Katmandú. Junto a otras construcciones del valle, fueron elegidas como Patrimonio de la Humanidad de la Unesco en 1979.1\u200B\n" +
                    "\n" +
                    "También es conocido como el templo de los monos, ya que hay monos que viven en santas partes del templo en el norte-oeste. El nombre tibetano para el sitio significa \"Sublimes árboles\" (Wylie : Phags.pa Shing.kun), por las muchas variedades de árboles que se encuentran en la colina. Sin embargo, Shing.kun puede ser una corrupción de los locales newari nombre para el complejo, Singgu, que significa \"auto-nacido\".2\u200B Para los budistas Newars en cuya historia mitológica y mito de origen, así como la práctica religiosa del día a día, Swayambhunath ocupa una posición central, que es probablemente el más sagrado entre los lugares de peregrinación budista. Para los tibetanos y seguidores del budismo tibetano, que en segundo lugar solamente se encuentra Boudhanath.\n" +
                    "\n" +
                    "El complejo Swayambhunath consiste en una estupa, una variedad de santuarios y templos, algunos que datan del período de Licchavi. Un monasterio tibetano, el museo y la biblioteca son más recientes adiciones. La estupa tiene los ojos de Buda y las cejas pintadas. Entre ellos, hay algo que parece una pintura de nariz (pero es el símbolo de Nepal de \"unidad\", en el dialecto principal de la lengua nepalí). También hay tiendas, restaurantes y hostales. El sitio tiene dos puntos de acceso: una larga escalera, que tiene 365 escalones, que conducen directamente a la plataforma principal del templo, que es desde la cima de la colina al este, y una carretera de coches alrededor de la colina del sur líder a la entrada suroeste. "
        ),
    )
}
