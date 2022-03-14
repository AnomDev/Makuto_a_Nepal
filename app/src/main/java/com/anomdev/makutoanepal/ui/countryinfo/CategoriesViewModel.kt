package com.anomdev.makutoanepal.ui.countryinfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anomdev.makutoanepal.data.country.Category
import com.anomdev.makutoanepal.data.country.CountryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(private val repo: CountryRepository) : ViewModel() {

    private val _categories = MutableLiveData<List<Category>>()

    val categories: LiveData<List<Category>>
        get() = _categories

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val categories = repo.getCategories()
            _categories.postValue(categories)
        }
    }
}