package com.anomdev.makutoanepal.ui.info

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.databinding.ItemGridCountryfragmentBinding
import com.anomdev.makutoanepal.model.CountryTopic
import com.anomdev.makutoanepal.model.CountryTopicProvider
import com.anomdev.makutoanepal.model.countrydata.CountryDataProvider
import com.anomdev.makutoanepal.ui.info.nested.InfoNestedActivity
import com.bumptech.glide.Glide


class InfoGridAdapter(val countryTopicList: List<CountryTopic>) :
    RecyclerView.Adapter<InfoGridAdapter.CountryTopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryTopicViewHolder {
        val binding = ItemGridCountryfragmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CountryTopicViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryTopicViewHolder, position: Int) {
        viewHolder.render(countryTopicList[position])


        //TODO: En función del "topic" que se pulse, volcará en la CountryElementDetailActivity un intent con los datos del provider en cuestion
        /*   when{
               countryTopicElementList[position]== primer item del RV -> que se vaya a la activity con los elementos del CountryHistoryProvider
               countryTopicElementList[position]== segundo item del RV -> que se vaya a la activity con los elementos del CountryNatureProvider
               countryTopicElementList[position]== tercer item del RV -> que se vaya a la activity con los elementos del CountryPoiProvider
               countryTopicElementList[position]== cuarto item del RV -> que se vaya a la activity con los elementos del CountryTrekkingsProvider
               countryTopicElementList[position]== quinto item del RV -> que se vaya a la activity con los elementos del CountryGastronomyProvider
               countryTopicElementList[position]== sexto item del RV -> que se vaya a la activity con los elementos del CountryOthersProvider
           }
        */

        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, InfoNestedActivity::class.java)
            //TODO: Hay que conseguir pillar el string de turno relativo al id que ahora mismo aparece.
            intent.putExtra("titleTopic", CountryTopicProvider.countryTopicsList[position].title.toString())

            intent.putExtra("headerKathmandu", CountryDataProvider.headerKathmandu)
            intent.putExtra("headerPokhara", CountryDataProvider.headerPokhara)
            intent.putExtra("headerMountains", CountryDataProvider.headerMountains)
            intent.putExtra("headerOther", CountryDataProvider.headerOther)

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


