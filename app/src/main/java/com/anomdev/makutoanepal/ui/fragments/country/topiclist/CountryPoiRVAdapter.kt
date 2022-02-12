package com.anomdev.makutoanepal.ui.fragments.country.topiclist

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemCountryTopicElementBinding

import com.anomdev.makutoanepal.model.countrytopicelementproviders.Poi
import com.anomdev.makutoanepal.model.countrytopicelementproviders.PoiProvider

import com.anomdev.makutoanepal.ui.fragments.country.topiclist.detailtopicelement.CountryElementDetailActivity
import com.bumptech.glide.Glide

class CountryPoiRVAdapter(val countryPoiList: List<Poi>) :
RecyclerView.Adapter<CountryPoiRVAdapter.CountryPoiViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryPoiRVAdapter.CountryPoiViewHolder {

        val binding = ItemCountryTopicElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CountryPoiViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryPoiViewHolder, position: Int) {
        viewHolder.render(countryPoiList[position])

        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, CountryElementDetailActivity::class.java)
            intent.putExtra("imageTopicElement", PoiProvider.poiKathmanduElementsList[position].image )
            intent.putExtra("titleTopicElement", PoiProvider.poiKathmanduElementsList[position].title)
            intent.putExtra("bodyTopicElement", PoiProvider.poiKathmanduElementsList[position].body)





            Log.d("intentTOPICExtraTitle", "${intent.getStringExtra("titleTopicElement")}")
            Log.d("intentTOPICExtraImage", "${intent.getStringExtra("imageTopicElement")}")



            ContextCompat.startActivity(viewHolder.binding.root.context, intent, null)

        }
    }

    override fun getItemCount(): Int {
        return countryPoiList.size
    }

    class CountryPoiViewHolder(val binding: ItemCountryTopicElementBinding) : RecyclerView.ViewHolder(binding.root) {


        val cardView = binding.cvElementTopicList


        fun render(countryPoi: Poi) {
            binding.tvTitleElementCountryTopic.text = countryPoi.title
            Glide.with(cardView.context).load(countryPoi.image).into(binding.ivImageElementCountryTopic)


        }
    }

}