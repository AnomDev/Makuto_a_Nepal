package com.anomdev.makutoanepal.ui.countryinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.anomdev.makutoanepal.databinding.FragmentCountryBinding

class CategoriesFragment : Fragment() {
    private var _binding: FragmentCountryBinding? = null
    private val binding get() = _binding!!
    private val viewModel: CategoriesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCountryBinding.inflate(inflater, container, false)
        binding.rvCountryTopics.layoutManager = GridLayoutManager(requireContext(), 2)
        observeData()
        return binding.root
    }

    private fun observeData() {
        viewModel.categories.observe(viewLifecycleOwner) { categories ->
            val adapter = CategoriesAdapter(categories)
            binding.rvCountryTopics.adapter = adapter
        }
    }
}