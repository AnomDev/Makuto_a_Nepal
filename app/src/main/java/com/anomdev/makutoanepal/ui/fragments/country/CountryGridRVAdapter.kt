package com.anomdev.makutoanepal.ui.fragments.country

import android.R
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemGridCountryfragmentBinding
import com.anomdev.makutoanepal.model.CountryTopic
import com.anomdev.makutoanepal.model.CountryTopicProvider
import com.anomdev.makutoanepal.ui.fragments.country.topiclist.CountryTopicListActivity
import com.bumptech.glide.Glide
import java.security.AccessController.getContext


class CountryGridRVAdapter(val countryTopicList: List<CountryTopic>) :
    RecyclerView.Adapter<CountryGridRVAdapter.CountryTopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryGridRVAdapter.CountryTopicViewHolder {
        val binding = ItemGridCountryfragmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CountryGridRVAdapter.CountryTopicViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryGridRVAdapter.CountryTopicViewHolder, position: Int) {
        viewHolder.render(countryTopicList[position])

        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, CountryTopicListActivity::class.java)
            //TODO: Hay que conseguir pillar el string de turno relativo al id que ahora mismo aparece.
            intent.putExtra("titleTopic", CountryTopicProvider.countryTopicsList[position].title.toString())


            Log.d("intentTOPICExtraTitle", "${intent.getStringExtra("titleTopic")}")


            startActivity(viewHolder.binding.root.context, intent, null)

        }
    }

    override fun getItemCount(): Int {
        return countryTopicList.size
    }

    class CountryTopicViewHolder(val binding: ItemGridCountryfragmentBinding) : RecyclerView.ViewHolder(binding.root) {


        val cardView = binding.cvCountryTopic


        fun render(countryTopicList: CountryTopic) {
            val title: String = binding.tvCountryTopic.getContext().getResources().getString(countryTopicList.title)
            binding.tvCountryTopic.text = title

            Glide.with(cardView.context).load(countryTopicList.image).into(binding.ivCountryTopic)


        }
    }

}


