package com.anomdev.makutoanepal.ui.countryinfo.category

import androidx.lifecycle.*
import com.anomdev.makutoanepal.data.country.CategoryType
import com.anomdev.makutoanepal.data.country.CountryDataSourceImpl
import com.anomdev.makutoanepal.data.country.CountryRepository
import com.anomdev.makutoanepal.data.country.Topic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryViewModel(private val categoryType: CategoryType) : ViewModel() {
    private val _topics = MutableLiveData<List<Topic>>()

    val topics: LiveData<List<Topic>>
        get() = _topics

    private val repo = CountryRepository(CountryDataSourceImpl())

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val data = repo.getTopicInformation(categoryType)
            _topics.postValue(data)
        }
    }
}

class CategoryViewModelFactory(private val type: CategoryType) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CategoryViewModel::class.java)) {
            return CategoryViewModel(type) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}


