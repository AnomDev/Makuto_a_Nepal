package com.anomdev.makutoanepal.ui.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.FragmentHomeBinding
import com.anomdev.makutoanepal.databinding.ItemBlogPostBinding
import com.anomdev.makutoanepal.model.BlogPost
import com.squareup.picasso.Picasso


class PostsFeedRVAdapter (val feedList:List<BlogPost>): RecyclerView.Adapter<PostsFeedRVAdapter.PostHolder>(){


    //Éste método crea el ViewHolder, en este caso el PostHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding = ItemBlogPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostHolder(binding)
    }

    //Éste método dice cuántos items tiene el RV
    override fun getItemCount(): Int {
        return feedList.size
    }

    // Éste metodo muestra los datos en la posición especificada
    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.render(feedList[position])
    }



    class PostHolder(private val binding : ItemBlogPostBinding): RecyclerView.ViewHolder(binding.root){

        fun render(feedList: BlogPost) {
            binding.tvTitle.text = feedList.title
            Picasso.get().load(feedList.image).into(binding.ivPost)
            binding.tvDate.text = feedList.date


        }
    }


}