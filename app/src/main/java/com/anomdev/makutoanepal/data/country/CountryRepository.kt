package com.anomdev.makutoanepal.data.country

class CountryRepository(
    private val countryDataSource: CountryDataSource
) {

    /**
     * Get all [Category]s available
     */
    suspend fun getCategories(): List<Category> = countryDataSource.getCategories()


    /**
     * Get all information from a specific [Category]
     */
    suspend fun getTopicInformation(categoryType: CategoryType): List<Topic> =
        countryDataSource.getTopicInformation(categoryType)

}