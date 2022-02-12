package com.anomdev.makutoanepal.ui.fragments.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.SettingsActivity
import com.anomdev.makutoanepal.databinding.FragmentHomeBinding
import com.anomdev.makutoanepal.model.BlogPost

import com.anomdev.makutoanepal.model.BlogPostProvider
import com.anomdev.makutoanepal.ui.fragments.home.detailpost.PostDetailActivity


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        initRecycler()
        onSettingsButtonClicked()
        return binding.root

    }

    fun initRecycler() {
        binding.postsFeedRv.layoutManager = LinearLayoutManager(requireContext())
        val adapter = PostsFeedRVAdapter(BlogPostProvider.blogPostList)
        binding.postsFeedRv.adapter = adapter
    }

    fun onSettingsButtonClicked() {
        binding.btnSettings.setOnClickListener {
            val intent = Intent(binding.btnSettings.context, SettingsActivity::class.java)
            ContextCompat.startActivity(binding.btnSettings.context, intent, null)
        }
    }


}

