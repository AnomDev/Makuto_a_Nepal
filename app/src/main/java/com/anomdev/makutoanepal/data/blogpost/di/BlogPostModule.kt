package com.anomdev.makutoanepal.data.blogpost.di

import com.anomdev.makutoanepal.data.blogpost.BlogPostDataSource
import com.anomdev.makutoanepal.data.blogpost.BlogPostDataSourceImpl
import com.anomdev.makutoanepal.data.blogpost.BlogPostRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class BlogPostModule {

    @Provides
    @Singleton
    fun provideBlogpostDataSource(): BlogPostDataSource{
        return BlogPostDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideBlogPostRepository(blogPostDataSource: BlogPostDataSource): BlogPostRepository {
        return BlogPostRepository(blogPostDataSource)
    }
}