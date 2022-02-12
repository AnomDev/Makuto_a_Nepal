package com.anomdev.makutoanepal.ui.fragments.country.topiclist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.databinding.ActivityTopicListBinding
import com.anomdev.makutoanepal.databinding.FragmentCountryBinding
import com.anomdev.makutoanepal.model.CountryTopicElementProvider
import com.anomdev.makutoanepal.model.CountryTopicProvider
import com.anomdev.makutoanepal.ui.fragments.country.CountryGridRVAdapter

class CountryTopicListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTopicListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopicListBinding.inflate(layoutInflater)
        initRecycler()
        setContentView(binding.root)


        Log.d("getExtraTOPICTitle", intent.getStringExtra("titleTopic").toString())

        if (binding == null) {
            Log.d("bindingNull", intent.extras.toString())

        }

        if (intent.extras != null) {

            val titleTopic: String = intent.getStringExtra("titleTopic").toString()
            binding.tvTitleTopicDetail.text = titleTopic
        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()

        }

    }



    fun initRecycler() {
        binding.rvFirst.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterFirst = CountryTopicListRVAdapter(CountryTopicElementProvider.countryTopicElementsList)
        binding.rvFirst.adapter = adapterFirst

        binding.rvSecond.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterSecond = CountryTopicListRVAdapter(CountryTopicElementProvider.countryTopicElementsList)
        binding.rvSecond.adapter = adapterSecond

        binding.rvThird.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterThird = CountryTopicListRVAdapter(CountryTopicElementProvider.countryTopicElementsList)
        binding.rvThird.adapter = adapterThird

        binding.rvFourth.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterFourth = CountryTopicListRVAdapter(CountryTopicElementProvider.countryTopicElementsList)
        binding.rvFourth.adapter = adapterFourth
    }

}
