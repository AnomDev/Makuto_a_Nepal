package com.anomdev.makutoanepal.ui.fragments.country

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.FragmentCountryBinding
import com.anomdev.makutoanepal.databinding.FragmentHomeBinding
import com.anomdev.makutoanepal.model.BlogPostProvider
import com.anomdev.makutoanepal.model.CountryTopicProvider
import com.anomdev.makutoanepal.ui.fragments.home.PostsFeedRVAdapter

class CountryFragment : Fragment() {
    private var _binding: FragmentCountryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCountryBinding.inflate(inflater, container, false)
        initRecycler()
        return binding.root
    }

    fun initRecycler() {
        binding.rvCountryTopics.layoutManager = GridLayoutManager(requireContext(), 2)
        val adapter = CountryGridRVAdapter(CountryTopicProvider.countryTopicsList)
        binding.rvCountryTopics.adapter = adapter
//
    }

}