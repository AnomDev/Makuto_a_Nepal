package com.anomdev.makutoanepal.ui.fragments.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.ItemBlogPostBinding
import com.anomdev.makutoanepal.model.BlogPost
import com.squareup.picasso.Picasso


class PostsFeedRVAdapter (val feedList:List<BlogPost>): RecyclerView.Adapter<PostsFeedRVAdapter.PostHolder>(){

   private val title = R.id.tvTitle

    //Éste método crea el ViewHolder, en este caso el PostHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PostHolder(layoutInflater.inflate(R.layout.item_blog_post, parent, false))
    }

    //Éste método dice cuántos items tiene el RV
    override fun getItemCount(): Int {
        return feedList.size
    }

    // Éste metodo muestra los datos en la posición especificada
    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.render(feedList[position])
    }



    class PostHolder(private val view : View): RecyclerView.ViewHolder(view){

        fun render(feedList: BlogPost) {
            //TODO Mejorar usando sólo "ItemBlogPostBinding"
            (view as ItemBlogPostBinding).tvTitle.text = feedList.title
            Picasso.get().load(feedList.image).into( (view as ItemBlogPostBinding).ivPost)
        }
    }


}