package com.anomdev.makutoanepal.ui.countryinfo.category

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.data.CategoryType
import com.anomdev.makutoanepal.databinding.ActivityTopicListBinding

const val EXTRA_CATEGORY = "EXTRA_CATEGORY"

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTopicListBinding
    private lateinit var viewModel: CategoryViewModel
    private lateinit var factory: CategoryViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopicListBinding.inflate(layoutInflater)
        initRecycler()
        setContentView(binding.root)
        binding.btnBackToCountryFragment.setOnClickListener {
            onBackButtonPressed()
        }
    }


    private fun initRecycler() {
        val category: CategoryType = intent.getSerializableExtra(EXTRA_CATEGORY) as CategoryType
        binding.parentRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        factory = CategoryViewModelFactory(category)
        viewModel = ViewModelProvider(this, factory).get(CategoryViewModel::class.java)

        viewModel.topics.observe(this) { topics ->
            val parentAdapter = ParentRVAdapter(topics)
            binding.parentRecyclerView.adapter = parentAdapter
        }
    }

    private fun onBackButtonPressed() {
        finish()
    }

}
