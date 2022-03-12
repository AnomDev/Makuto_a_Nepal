package com.anomdev.makutoanepal.ui.countryinfo.category

import androidx.lifecycle.*
import com.anomdev.makutoanepal.data.CategoryType
import com.anomdev.makutoanepal.data.CountryRepository
import com.anomdev.makutoanepal.data.Topic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryViewModel(private val categoryType: CategoryType) : ViewModel() {
    private val _topics = MutableLiveData<List<Topic>>()

    val topics: LiveData<List<Topic>>
        get() = _topics

    private val repo = CountryRepository()

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


