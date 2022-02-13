package com.anomdev.makutoanepal.ui.fragments.country.topiclist.detailtopicelement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.anomdev.makutoanepal.databinding.ActivityCountryElementDetailBinding
import com.anomdev.makutoanepal.model.CountryTopicElementProvider
import com.bumptech.glide.Glide
import com.google.android.gms.maps.MapFragment

class CountryElementDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountryElementDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCountryElementDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onMapButtonPressed()

        Log.d("getExtraTOPICTitle", intent.getStringExtra("titleTopic").toString())

        if (binding == null) {
            Log.d("bindingNull", intent.extras.toString())

        }

        if (intent.extras != null) {


            val imageTopicElement: Int = intent.getIntExtra("imageTopicElement",1).toInt()
            Glide.with(this).load(imageTopicElement).into(binding.ivImageCountryElementDetail)

            val titleTopicElement: String = intent.getStringExtra("titleTopicElement").toString()
            binding.tvTitleCountryElement.text = titleTopicElement

            val bodyTopicElement: String = intent.getStringExtra("bodyTopicElement").toString()
            binding.tvBodyCountryElementDetail.text = bodyTopicElement

        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()
        }

        binding.btnBackToCountryTopicList.setOnClickListener{
            onBackButtonPressed()
        }
    }

    fun onMapButtonPressed(){
       binding.btnViewMap.setOnClickListener {
           //TODO: Esto falla principalmente porque no es una Activity a donde vamos, sino un fragment
           val intent = Intent(this, MapFragment::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
    }

    private fun onBackButtonPressed() {
        finish()
    }

}