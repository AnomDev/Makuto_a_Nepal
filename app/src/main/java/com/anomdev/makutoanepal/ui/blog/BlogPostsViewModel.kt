package com.anomdev.makutoanepal.ui.blog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anomdev.makutoanepal.data.BlogPost
import com.anomdev.makutoanepal.data.BlogPostRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BlogPostsViewModel : ViewModel() {

    private val blogPostsRepository = BlogPostRepository()

    private val _blogPosts = MutableLiveData<List<BlogPost>>()
    val blogPosts : LiveData<List<BlogPost>>
        get() = _blogPosts

    init{
        viewModelScope.launch(Dispatchers.IO){
            val blogPosts = blogPostsRepository.getBlogPosts()
            _blogPosts.postValue(blogPosts)
        }
    }

}