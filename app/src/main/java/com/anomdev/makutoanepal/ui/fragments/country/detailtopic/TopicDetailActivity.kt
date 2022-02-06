package com.anomdev.makutoanepal.ui.fragments.country.detailtopic

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anomdev.makutoanepal.databinding.ActivityTopicDetailBinding

class TopicDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTopicDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopicDetailBinding.inflate(layoutInflater)
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
}
