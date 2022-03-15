package com.anomdev.makutoanepal.ui.countryinfo.detail

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anomdev.makutoanepal.data.country.TopicElement
import com.anomdev.makutoanepal.databinding.ActivityCountryElementDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TOPIC_ELEMENT = "EXTRA_TOPIC_ELEMENT"
    }

    private lateinit var binding: ActivityCountryElementDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCountryElementDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        onMapButtonPressed()


        if (intent.extras != null) {

            val element = intent.getParcelableExtra<TopicElement>(EXTRA_TOPIC_ELEMENT)
                ?: throw IllegalStateException("Topic element is not included in the intent")

            with(element) {
                Glide.with(this@DetailActivity).load(image)
                    .into(binding.ivImageCountryElementDetail)
                binding.tvTitleCountryElement.text = title
                binding.tvBodyCountryElementDetail.text = body
            }


        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()
        }

        binding.btnBackToCountryTopicList.setOnClickListener {
            onBackButtonPressed()
        }
    }

    /*private fun onMapButtonPressed() {
        binding.btnViewMap.setOnClickListener {
            //TODO: Esto falla principalmente porque no es una Activity a donde vamos, sino un fragment
            val intent = Intent(this, MapFragment::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
    }*/

    private fun onBackButtonPressed() {
        finish()
    }

}