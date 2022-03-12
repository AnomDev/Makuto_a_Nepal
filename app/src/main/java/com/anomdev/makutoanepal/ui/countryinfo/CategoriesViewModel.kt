package com.anomdev.makutoanepal.ui.countryinfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anomdev.makutoanepal.data.Category
import com.anomdev.makutoanepal.data.CountryRepository
import kotlinx.coroutines.launch

class CategoriesViewModel : ViewModel() {
    private val repo = CountryRepository()

    private val _categories = MutableLiveData<List<Category>>()

    val categories: LiveData<List<Category>>
        get() = _categories

    init {
        viewModelScope.launch {
            val categories = repo.getCategories()
            _categories.postValue(categories)
        }
    }
}