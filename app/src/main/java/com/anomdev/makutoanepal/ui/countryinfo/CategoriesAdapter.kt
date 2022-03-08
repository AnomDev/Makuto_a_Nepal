package com.anomdev.makutoanepal.ui.countryinfo

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.data.Category
import com.anomdev.makutoanepal.databinding.ItemGridCountryfragmentBinding
import com.anomdev.makutoanepal.ui.countryinfo.category.EXTRA_CATEGORY
import com.anomdev.makutoanepal.ui.countryinfo.category.InfoNestedActivity
import com.bumptech.glide.Glide


class CategoriesAdapter(private val categories: List<Category>) :
    RecyclerView.Adapter<CategoriesAdapter.CountryTopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryTopicViewHolder {
        val binding = ItemGridCountryfragmentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CountryTopicViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CountryTopicViewHolder, position: Int) {
        viewHolder.render(categories[position])
        //TODO this listener should be moved outside the adapter
        viewHolder.cardView.setOnClickListener {
            val intent = Intent(viewHolder.binding.root.context, InfoNestedActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, categories[position].type)
            startActivity(viewHolder.binding.root.context, intent, null)
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    class CountryTopicViewHolder(val binding: ItemGridCountryfragmentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val cardView = binding.cvCountryTopic
        fun render(categories: Category) {
            val title: String = binding.tvCountryTopic.context.resources.getString(categories.title)
            binding.tvCountryTopic.text = title
            Glide.with(cardView.context).load(categories.image).into(binding.ivCountryTopic)
        }
    }
}


