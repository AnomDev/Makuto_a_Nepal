package com.anomdev.makutoanepal.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.anomdev.makutoanepal.data.CountryRepository
import com.anomdev.makutoanepal.databinding.FragmentCountryBinding
import kotlinx.coroutines.launch

class CategoriesFragment : Fragment() {
    private var _binding: FragmentCountryBinding? = null
    private val binding get() = _binding!!
    private val repo = CountryRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCountryBinding.inflate(inflater, container, false)
        initRecycler()
        return binding.root
    }

    private fun initRecycler() {
        //TODO add progressbar while the "server request" is processed
        binding.rvCountryTopics.layoutManager = GridLayoutManager(requireContext(), 2)
        //TODO do this within a ViewModel
        lifecycleScope.launch {
            val adapter = CategoriesAdapter(repo.getCategories())
            binding.rvCountryTopics.adapter = adapter
        }
    }
}