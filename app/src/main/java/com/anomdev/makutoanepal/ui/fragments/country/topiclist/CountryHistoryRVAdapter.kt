package com.anomdev.makutoanepal.ui.fragments.country.topiclist

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemCountryTopicElementBinding
import com.anomdev.makutoanepal.model.countrydata.*

import com.anomdev.makutoanepal.ui.fragments.country.topiclist.detailtopicelement.CountryElementDetailActivity
import com.bumptech.glide.Glide

class CountryHistoryRVAdapter(val countryHistoryList: List<CountryData>) :
RecyclerView.Adapter<CountryHistoryRVAdapter.CountryHistoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHistoryRVAdapter.CountryHistoryViewHolder {

        val binding = ItemCountryTopicElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CountryHistoryViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryHistoryViewHolder, position: Int) {
        viewHolder.render(countryHistoryList[position])

        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, CountryElementDetailActivity::class.java)
            intent.putExtra("imageTopicElement", CountryDataProvider.ancientHistoryList[position].image )
            intent.putExtra("titleTopicElement", CountryDataProvider.ancientHistoryList[position].title)
            intent.putExtra("bodyTopicElement", CountryDataProvider.ancientHistoryList[position].body)

            Log.d("intentTOPICExtraTitle", "${intent.getStringExtra("titleTopicElement")}")
            Log.d("intentTOPICExtraImage", "${intent.getStringExtra("imageTopicElement")}")



            ContextCompat.startActivity(viewHolder.binding.root.context, intent, null)

        }
    }

    override fun getItemCount(): Int {
        return countryHistoryList.size
    }

    class CountryHistoryViewHolder(val binding: ItemCountryTopicElementBinding) : RecyclerView.ViewHolder(binding.root) {


        val cardView = binding.cvElementTopicList


        fun render(countryHistory: CountryData) {
            binding.tvTitleElementCountryTopic.text = countryHistory.title
            Glide.with(cardView.context).load(countryHistory.image).into(binding.ivImageElementCountryTopic)


        }
    }

}