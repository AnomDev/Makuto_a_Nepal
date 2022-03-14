package com.anomdev.makutoanepal.ui.countryinfo.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anomdev.makutoanepal.data.country.Topic
import com.anomdev.makutoanepal.databinding.ItemTopicParentBinding

class ParentRVAdapter(val topics: List<Topic>) :
    RecyclerView.Adapter<ParentRVAdapter.TopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        //TODO change this binding name to something generic
        val binding = ItemTopicParentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TopicViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: TopicViewHolder, position: Int) {
        viewHolder.render(topics[position])
    }

    override fun getItemCount(): Int {
        return topics.size
    }

    class TopicViewHolder(val binding: ItemTopicParentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun render(topic: Topic) {
            binding.contentTitle.text = topic.name
            binding.childRecyclerView.layoutManager =
                LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
            binding.childRecyclerView.adapter = ChildMembersAdapter(topic.topicElements)
        }
    }

}