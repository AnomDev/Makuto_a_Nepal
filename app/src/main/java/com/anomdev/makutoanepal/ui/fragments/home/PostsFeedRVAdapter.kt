package com.anomdev.makutoanepal.ui.fragments.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemBlogPostBinding
import com.anomdev.makutoanepal.model.BlogPost
import com.anomdev.makutoanepal.ui.MainActivity
import com.anomdev.makutoanepal.ui.fragments.home.detailpost.PostDetailActivity
import com.squareup.picasso.Picasso


class PostsFeedRVAdapter(val feedList: List<BlogPost>) :
    RecyclerView.Adapter<PostsFeedRVAdapter.PostHolder>() {


    //Éste método crea el ViewHolder, en este caso el PostHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding =
            ItemBlogPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostHolder(binding)
    }

    //Éste método dice cuántos items tiene el RV
    override fun getItemCount(): Int {
        return feedList.size
    }

    // Éste metodo muestra los datos en la posición especificada
    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.render(feedList[position])

        holder.cardView.setOnClickListener {

            val intent = Intent(holder.binding.root.context, PostDetailActivity::class.java)
            startActivity(holder.binding.root.context,intent,null)
        }

    }



class PostHolder(val binding: ItemBlogPostBinding) : RecyclerView.ViewHolder(binding.root) {

    val cardView = binding.topCardview

    fun render(feedList: BlogPost) {
        binding.postOnFeedTitleTv.text = feedList.title
        Picasso.get().load(feedList.image).into(binding.postOnFeedImageIv)
        binding.postOnFeedDateTv.text = feedList.date


    }
}

}