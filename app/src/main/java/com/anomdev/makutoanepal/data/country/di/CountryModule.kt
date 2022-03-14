package com.anomdev.makutoanepal.data.country.di

import com.anomdev.makutoanepal.data.country.CountryDataSource
import com.anomdev.makutoanepal.data.country.CountryDataSourceImpl
import com.anomdev.makutoanepal.data.country.CountryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CountryModule {

    @Provides
    @Singleton
    fun provideCountryDataSource(): CountryDataSource {
        return CountryDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideCountryRepository(countryDatasource: CountryDataSource): CountryRepository {
        return CountryRepository(countryDatasource)
    }

}