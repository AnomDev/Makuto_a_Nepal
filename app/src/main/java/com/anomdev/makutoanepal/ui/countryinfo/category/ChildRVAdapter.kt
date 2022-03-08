package com.anomdev.makutoanepal.ui.countryinfo.category

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.data.TopicElement
import com.anomdev.makutoanepal.databinding.ItemTopicChildBinding
import com.anomdev.makutoanepal.ui.countryinfo.detail.DetailActivity
import com.anomdev.makutoanepal.ui.countryinfo.detail.EXTRA_IMAGE
import com.anomdev.makutoanepal.ui.countryinfo.detail.EXTRA_SUBTITLE
import com.anomdev.makutoanepal.ui.countryinfo.detail.EXTRA_TITLE
import com.bumptech.glide.Glide

open class ChildMembersAdapter(private var elements: List<TopicElement>) :
    RecyclerView.Adapter<ChildMembersAdapter.TopicElementViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChildMembersAdapter.TopicElementViewHolder {
        val binding = ItemTopicChildBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TopicElementViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: TopicElementViewHolder, position: Int) {
        viewHolder.render(elements[position])

        //TODO expose this listener outside the adapter
        viewHolder.cardView.setOnClickListener {
            with(elements[position]) {
                val intent = Intent(viewHolder.binding.root.context, DetailActivity::class.java)
                //TODO use a bundle instead?
                intent.putExtra(EXTRA_TITLE, this.title)
                intent.putExtra(EXTRA_SUBTITLE, this.subtitle)
                intent.putExtra(EXTRA_IMAGE, this.image)
                ContextCompat.startActivity(viewHolder.binding.root.context, intent, null)
            }
        }
    }

    class TopicElementViewHolder(val binding: ItemTopicChildBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val cardView = binding.cvElementTopicList
        fun render(element: TopicElement) {
            binding.tvTitleElementCountryTopic.text = element.title
            Glide.with(cardView.context).load(element.image)
                .into(binding.ivImageElementCountryTopic)
        }
    }

    override fun getItemCount(): Int = elements.size

}