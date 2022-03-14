package com.anomdev.makutoanepal.data.blogpost

class BlogPostRepository(
    private val blogPostDataSource: BlogPostDataSource = BlogPostDataSourceImpl()
) {

    /**
     * Get all [BlogPost]s available
     */
    suspend fun getBlogPosts(): List<BlogPost> = blogPostDataSource.getBlogPosts()


}