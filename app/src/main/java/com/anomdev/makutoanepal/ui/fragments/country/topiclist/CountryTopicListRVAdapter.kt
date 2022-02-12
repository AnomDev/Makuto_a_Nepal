package com.anomdev.makutoanepal.ui.fragments.country.topiclist

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemCountryTopicElementBinding
import com.anomdev.makutoanepal.model.BlogPostProvider

import com.anomdev.makutoanepal.model.CountryTopicElement
import com.anomdev.makutoanepal.model.CountryTopicElementProvider

import com.anomdev.makutoanepal.ui.fragments.country.topiclist.detailtopicelement.CountryElementDetailActivity
import com.bumptech.glide.Glide

class CountryTopicListRVAdapter (val countryTopicElementList: List<CountryTopicElement>) :
RecyclerView.Adapter<CountryTopicListRVAdapter.CountryTopicListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryTopicListRVAdapter.CountryTopicListViewHolder {

        val binding = ItemCountryTopicElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CountryTopicListRVAdapter.CountryTopicListViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryTopicListRVAdapter.CountryTopicListViewHolder, position: Int) {
        viewHolder.render(countryTopicElementList[position])

        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, CountryElementDetailActivity::class.java)
            intent.putExtra("titleTopicElement", CountryTopicElementProvider.countryTopicElementsList[position].title)
            intent.putExtra("imageTopicElement", CountryTopicElementProvider.countryTopicElementsList[position].image )

            Log.d("intentTOPICExtraTitle", "${intent.getStringExtra("titleTopicElement")}")
            Log.d("intentTOPICExtraImage", "${intent.getStringExtra("imageTopicElement")}")



            ContextCompat.startActivity(viewHolder.binding.root.context, intent, null)

        }
    }

    override fun getItemCount(): Int {
        return countryTopicElementList.size
    }

    class CountryTopicListViewHolder(val binding: ItemCountryTopicElementBinding) : RecyclerView.ViewHolder(binding.root) {


        val cardView = binding.cvElementTopicList


        fun render(countryTopicElementList: CountryTopicElement) {
            binding.tvTitleElementCountryTopic.text = countryTopicElementList.title
            Glide.with(cardView.context).load(countryTopicElementList.image).into(binding.ivImageElementCountryTopic)


        }
    }

}