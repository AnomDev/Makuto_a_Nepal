package com.anomdev.makutoanepal.ui.countryinfo.category

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.data.country.CategoryType
import com.anomdev.makutoanepal.databinding.ActivityTopicListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_CATEGORY = "EXTRA_CATEGORY"
    }

    private lateinit var binding: ActivityTopicListBinding
    private val viewModel: CategoryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopicListBinding.inflate(layoutInflater)
        binding.progressCategory.visibility = View.VISIBLE

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

        viewModel.topics.observe(this) { topics ->
            val parentAdapter = ParentRVAdapter(topics)
            binding.parentRecyclerView.adapter = parentAdapter
            binding.progressCategory.visibility = View.GONE

        }
    }

    private fun onBackButtonPressed() {
        finish()
    }

}
