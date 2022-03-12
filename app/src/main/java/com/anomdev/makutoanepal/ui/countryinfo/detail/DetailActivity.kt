package com.anomdev.makutoanepal.ui.countryinfo.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.anomdev.makutoanepal.databinding.ActivityCountryElementDetailBinding
import com.bumptech.glide.Glide
import com.google.android.gms.maps.MapFragment
const val EXTRA_TITLE = "EXTRA_TITLE"
const val EXTRA_SUBTITLE = "EXTRA_SUBTITLE"
const val EXTRA_IMAGE = "EXTRA_IMAGE"
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountryElementDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCountryElementDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onMapButtonPressed()


        if (intent.extras != null) {


            val imageTopicElement: Int = intent.getIntExtra(EXTRA_IMAGE,1)
            Glide.with(this).load(imageTopicElement).into(binding.ivImageCountryElementDetail)

            val titleTopicElement: String = intent.getStringExtra(EXTRA_TITLE).toString()
            binding.tvTitleCountryElement.text = titleTopicElement

            val bodyTopicElement: String = intent.getStringExtra(EXTRA_SUBTITLE).toString()
            binding.tvBodyCountryElementDetail.text = bodyTopicElement

        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()
        }

        binding.btnBackToCountryTopicList.setOnClickListener{
            onBackButtonPressed()
        }
    }

    private fun onMapButtonPressed(){
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