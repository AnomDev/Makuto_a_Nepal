package com.anomdev.makutoanepal.ui.info.nested

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.databinding.ActivityTopicListBinding
import com.anomdev.makutoanepal.model.countrydata.CountryDataProvider
const val EXTRA_CATEGORY = "EXTRA_CATEGORY"
class InfoNestedActivity : AppCompatActivity() {

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
            val category= intent.getSerializableExtra("EXTRA_CATEGORY").toString()
            Toast.makeText(this, "category: $category", Toast.LENGTH_SHORT).show()

            val titleTopic: String = intent.getStringExtra("titleTopic").toString()
            binding.tvTitleTopicDetail.text = titleTopic

            val headerKathmandu : String = intent.getStringExtra("headerKathmandu").toString()
            binding.rvFirstTitle.text = headerKathmandu
            val headerPokhara : String = intent.getStringExtra("headerPokhara").toString()
            binding.rvSecondTitle.text = headerPokhara
            val headerMountains : String = intent.getStringExtra("headerMountains").toString()
            binding.rvThirdTitle.text = headerMountains
            val headerOther : String = intent.getStringExtra("headerOther").toString()
            binding.rvFourthTitle.text = headerOther
        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()

        }

        binding.btnBackToCountryFragment.setOnClickListener{
            onBackButtonPressed()
        }

    }



    fun initRecycler() {

        binding.rvFirst.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterFirst = CountryPoiRVAdapter(CountryDataProvider.poiKathmanduElementsList)
        binding.rvFirst.adapter = adapterFirst

        binding.rvSecond.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterSecond = CountryPoiRVAdapter(CountryDataProvider.poiPokharaElementsList)
        binding.rvSecond.adapter = adapterSecond

        binding.rvThird.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterThird = CountryPoiRVAdapter(CountryDataProvider.poiMustangElementsList)
        binding.rvThird.adapter = adapterThird

        binding.rvFourth.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapterFourth = CountryPoiRVAdapter(CountryDataProvider.poiOtherElementsList)
        binding.rvFourth.adapter = adapterFourth
    }

    private fun onBackButtonPressed() {
        finish()
    }

}
