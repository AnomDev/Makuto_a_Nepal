package com.anomdev.makutoanepal.ui.countryinfo.category.di

import androidx.lifecycle.SavedStateHandle
import com.anomdev.makutoanepal.data.country.CategoryType
import com.anomdev.makutoanepal.ui.countryinfo.category.CategoryActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named

@Module
@InstallIn(ViewModelComponent::class)
class CategoryModule {

    @Provides
    @ViewModelScoped
    @Named("CategoryActivity")
    fun provideCategoryType(savedStateHandle: SavedStateHandle): CategoryType {
        return savedStateHandle.get<CategoryType>(CategoryActivity.EXTRA_CATEGORY)
            ?: throw IllegalStateException("Category selected by user not included savedStateHandle")
    }
}