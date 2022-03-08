package com.anomdev.makutoanepal.data

class CountryRepository(
    private val countryDataSource: CountryDataSource = CountryDataSourceImpl()
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