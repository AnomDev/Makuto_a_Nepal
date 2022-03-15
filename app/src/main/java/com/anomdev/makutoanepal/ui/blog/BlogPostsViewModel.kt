package com.anomdev.makutoanepal.ui.blog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anomdev.makutoanepal.data.blogpost.BlogPost
import com.anomdev.makutoanepal.data.blogpost.BlogPostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogPostsViewModel @Inject constructor(private val blogPostsRepository: BlogPostRepository) :
    ViewModel() {

    private val _blogPosts = MutableLiveData<List<BlogPost>>()
    val blogPosts: LiveData<List<BlogPost>>
        get() = _blogPosts

    init {
        viewModelScope.launch(Dispatchers.IO) {

            val blogPosts = blogPostsRepository.getBlogPosts()
            _blogPosts.postValue(blogPosts)
        }
    }

}