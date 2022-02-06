package com.anomdev.makutoanepal.ui.fragments.country

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemBlogPostBinding
import com.anomdev.makutoanepal.databinding.ItemGridCountryfragmentBinding
import com.anomdev.makutoanepal.model.BlogPost
import com.anomdev.makutoanepal.model.BlogPostProvider
import com.anomdev.makutoanepal.model.CountryTopic
import com.anomdev.makutoanepal.model.CountryTopicProvider
import com.anomdev.makutoanepal.ui.fragments.country.detailtopic.TopicDetailActivity
import com.anomdev.makutoanepal.ui.fragments.home.PostsFeedRVAdapter
import com.anomdev.makutoanepal.ui.fragments.home.detailpost.PostDetailActivity
import com.bumptech.glide.Glide

class CountryGridRVAdapter(val countryTopicList: List<CountryTopic>) :
    RecyclerView.Adapter<CountryGridRVAdapter.CountryTopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryGridRVAdapter.CountryTopicViewHolder {
        val binding = ItemGridCountryfragmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CountryGridRVAdapter.CountryTopicViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryGridRVAdapter.CountryTopicViewHolder, position: Int) {
        viewHolder.render(countryTopicList[position])

        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, TopicDetailActivity::class.java)
            intent.putExtra("titleTopic", CountryTopicProvider.countryTopicsList[position].title)

            Log.d("intentTOPICExtraTitle", "${intent.getStringExtra("titleTopic")}")


            startActivity(viewHolder.binding.root.context, intent, null)

        }
    }

    override fun getItemCount(): Int {
        return countryTopicList.size
    }

    class CountryTopicViewHolder(val binding: ItemGridCountryfragmentBinding) : RecyclerView.ViewHolder(binding.root) {


        val cardView = binding.cvGridCountryFragment


        fun render(countryTopicList: CountryTopic) {
            binding.tvTopicCountryFragment.text = countryTopicList.title
            Glide.with(cardView.context).load(countryTopicList.image).into(binding.ivTopicCountryFragment)


        }
    }

}


