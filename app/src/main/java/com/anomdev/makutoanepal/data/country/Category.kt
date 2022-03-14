package com.anomdev.makutoanepal.data.country

data class Category(
    val type: CategoryType,
    val image: Int,
    val title: Int,
)

//TODO move out strings to strings.xml
enum class CategoryType(name: String) {
    CULTURE("Cultura"),
    NATURE("Naturaleza"),
    POI("Puntos de interes"),
    TREKKING("Rutas de paseo"),
    GASTRONOMY("Gastronomia"),
    OTHERS("Otros")
}