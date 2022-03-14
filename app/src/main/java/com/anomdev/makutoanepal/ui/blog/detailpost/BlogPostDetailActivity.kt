package com.anomdev.makutoanepal.ui.blog.detailpost

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anomdev.makutoanepal.data.blogpost.BlogPost
import com.anomdev.makutoanepal.databinding.ActivityPostDetailBinding
import com.bumptech.glide.Glide
import java.lang.IllegalStateException

const val EXTRA_BLOGPOST = "EXTRA_BLOGPOST"

class BlogPostDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_BLOGPOST = "EXTRA_BLOGPOST"
    }

    private lateinit var binding: ActivityPostDetailBinding

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

            val blogPost = intent.getParcelableExtra<BlogPost>(EXTRA_BLOGPOST)
                ?: throw IllegalStateException("\"Blog post is not included in the intent")

            with (blogPost){
                Glide.with(this@BlogPostDetailActivity).load(image).into(binding.imageBlogPostDetail)
                binding.tvPostTitleDetailActivity.text = title
                binding.tvDateActivityDetail.text = date
                binding.tvBodyPostDetailActivity.text = body

            }

        } else {
            Toast.makeText(this, "Pues viene vacío el puto intent", Toast.LENGTH_LONG).show()
        }

        binding.btnBackToHomeFragment.setOnClickListener {
            onBackButtonPressed()
        }

    }

    private fun onBackButtonPressed() {
        finish()
    }


}
