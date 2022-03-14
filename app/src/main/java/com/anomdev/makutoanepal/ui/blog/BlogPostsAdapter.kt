package com.anomdev.makutoanepal.ui.blog

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.data.blogpost.BlogPost
import com.anomdev.makutoanepal.databinding.ItemBlogPostBinding
import com.anomdev.makutoanepal.ui.blog.detailpost.BlogPostDetailActivity
import com.anomdev.makutoanepal.ui.blog.detailpost.EXTRA_BLOGPOST
import com.bumptech.glide.Glide


class BlogPostsAdapter(private val blogPostsList: List<BlogPost>) :
    RecyclerView.Adapter<BlogPostsAdapter.BlogPostViewHolder>() {


    //Éste método crea el ViewHolder, en este caso el PostHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogPostViewHolder {
        val binding =
            ItemBlogPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BlogPostViewHolder(binding)

    }

    //Éste método dice cuántos items tiene el RV
    override fun getItemCount(): Int {
        return blogPostsList.size
    }

    // Éste metodo muestra los datos en la posición especificada
    override fun onBindViewHolder(viewHolder: BlogPostViewHolder, position: Int) {
        viewHolder.render(blogPostsList[position])

        viewHolder.cardView.setOnClickListener {

            val intent =
                Intent(viewHolder.binding.root.context, BlogPostDetailActivity::class.java)
            intent.putExtra(EXTRA_BLOGPOST, blogPostsList[position])
            startActivity(viewHolder.binding.root.context, intent, null)


        }

    }

    class BlogPostViewHolder(val binding: ItemBlogPostBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val cardView = binding.topCardview
        fun render(feedList: BlogPost) {
            binding.postOnFeedTitleTv.text = feedList.title
            binding.postOnFeedDateTv.text = feedList.date
            Glide.with(cardView.context).load(feedList.image).into(binding.postOnFeedImageIv)


        }
    }

}