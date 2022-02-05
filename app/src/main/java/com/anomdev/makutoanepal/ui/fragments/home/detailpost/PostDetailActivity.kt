package com.anomdev.makutoanepal.ui.fragments.home.detailpost

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.ActivityPostDetailBinding
import com.bumptech.glide.Glide


class PostDetailActivity : AppCompatActivity() {

    //TODO: Recuperar los datos que trae el intent del Adapter y pintarlos en esta activity
    private lateinit var binding: ActivityPostDetailBinding

//    val imageView: ImageView = findViewById<ImageView>(R.id.post_detail_image_iv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("extras", intent.extras.toString())

        Log.d("getExtraImage", intent.getStringExtra("imagePost").toString())
        Log.d("getExtraTitle", intent.getStringExtra("titlePost").toString())
        Log.d("getExtraDate", intent.getStringExtra("datePost").toString())
        Log.d("getExtraBody", intent.getStringExtra("bodyPost").toString())

        if (binding == null) {
            Log.d("bindingNull", intent.extras.toString())

        }


        if (intent.extras != null) {

            val imagePost: String = intent.getStringExtra("imagePost").toString()
            Glide.with(this).load(imagePost).into(binding.ivImageDetailActivity)

            val titlePost: String = intent.getStringExtra("titlePost").toString()
            binding.tvPostTitleDetailActivity.text = titlePost

            val datePost: String = intent.getStringExtra("datePost").toString()
            binding.tvDateActivityDetail.text = datePost

            val bodyPost: String = intent.getStringExtra("bodyPost").toString()
            binding.tvBodyPostDetailActivity.text = bodyPost

//            Log.d("getExtraImage", "$imagePost")
            Log.d("getExtraTitle", "$titlePost")
            Log.d("getExtraDate", datePost)
            Log.d("getExtraBody", "$bodyPost")

        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()
        }
    }
}
