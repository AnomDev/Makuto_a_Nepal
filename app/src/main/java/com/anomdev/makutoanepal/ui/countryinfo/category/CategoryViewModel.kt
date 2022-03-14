package com.anomdev.makutoanepal.ui.countryinfo.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anomdev.makutoanepal.data.country.CategoryType
import com.anomdev.makutoanepal.data.country.CountryDataSourceImpl
import com.anomdev.makutoanepal.data.country.CountryRepository
import com.anomdev.makutoanepal.data.country.Topic
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class CategoryViewModel @Inject constructor(
    @Named("CategoryActivity")
    private val categoryType: CategoryType
) : ViewModel() {
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


