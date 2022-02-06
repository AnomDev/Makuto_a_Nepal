package com.anomdev.makutoanepal.ui.fragments.home

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemBlogPostBinding
import com.anomdev.makutoanepal.model.BlogPost
import com.anomdev.makutoanepal.model.BlogPostProvider
import com.anomdev.makutoanepal.ui.fragments.home.detailpost.PostDetailActivity
import com.bumptech.glide.Glide


class PostsFeedRVAdapter(val feedList: List<BlogPost>) :
    RecyclerView.Adapter<PostsFeedRVAdapter.PostViewHolder>() {

    //Éste método crea el ViewHolder, en este caso el PostHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding =
            ItemBlogPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)

    }

    //Éste método dice cuántos items tiene el RV
    override fun getItemCount(): Int {
        return feedList.size
    }

    // Éste metodo muestra los datos en la posición especificada
    override fun onBindViewHolder(viewHolder: PostViewHolder, position: Int) {
        viewHolder.render(feedList[position])

        viewHolder.cardView.setOnClickListener {

//            itemClickListener.OnItemClick()

            val intent = Intent(viewHolder.binding.root.context, PostDetailActivity::class.java)
                intent.putExtra("imagePost", BlogPostProvider.blogPostList[position].image )
                intent.putExtra("titlePost", BlogPostProvider.blogPostList[position].title )
                intent.putExtra("datePost", BlogPostProvider.blogPostList[position].date )
                intent.putExtra("bodyPost", BlogPostProvider.blogPostList[position].body )

            Log.d("intentExtraImage", "${intent.getStringExtra("imagePost")}")
            Log.d("intentExtraTitle", "${intent.getStringExtra("titlePost")}")
            Log.d("intentExtraDate", "${intent.getStringExtra("datePost")}")
            Log.d("intentExtraBody", "${intent.getStringExtra("bodyPost")}")


            startActivity(viewHolder.binding.root.context, intent, null)
        }

    }

    class PostViewHolder(val binding: ItemBlogPostBinding) : RecyclerView.ViewHolder(binding.root) {

//    class PostViewHolder(val binding: ItemBlogPostBinding, listener: OnItemClickListener) : RecyclerView.ViewHolder(binding.root) {

        val cardView = binding.topCardview
//        init{
//            itemView.setOnClickListener{
//                listener.onItemClick(adapterPosition)
//            }
//        }

        fun render(feedList: BlogPost) {
            binding.postOnFeedTitleTv.text = feedList.title
            binding.postOnFeedDateTv.text = feedList.date
            Glide.with(cardView.context).load(feedList.image).into(binding.postOnFeedImageIv)


        }
    }

}