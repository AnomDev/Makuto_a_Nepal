package com.anomdev.makutoanepal.ui.countryinfo.category

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.data.CategoryType
import com.anomdev.makutoanepal.data.CountryRepository
import com.anomdev.makutoanepal.databinding.ActivityTopicListBinding
import kotlinx.coroutines.launch

const val EXTRA_CATEGORY = "EXTRA_CATEGORY"

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTopicListBinding
    private val repo = CountryRepository()

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
        Toast.makeText(this, "category: $category", Toast.LENGTH_SHORT).show()
        binding.parentRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        lifecycleScope.launch {
            val parentAdapter = ParentRVAdapter(repo.getTopicInformation(category))
            binding.parentRecyclerView.adapter = parentAdapter
        }
    }

    private fun onBackButtonPressed() {
        finish()
    }

}
