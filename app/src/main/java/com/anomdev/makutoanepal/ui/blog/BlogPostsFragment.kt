package com.anomdev.makutoanepal.ui.blog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.databinding.FragmentBlogpostsBinding
import com.anomdev.makutoanepal.ui.settings.SettingsActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BlogPostsFragment : Fragment() {

    private var _binding: FragmentBlogpostsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: BlogPostsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlogpostsBinding.inflate(inflater, container, false)

        binding.rvBlogPosts.layoutManager = LinearLayoutManager(requireContext())


        observeData()
        binding.progressBlogPosts.visibility = View.VISIBLE

        onSettingsButtonClicked()
        return binding.root

    }

    private fun observeData() {
        viewModel.blogPosts.observe(viewLifecycleOwner) { blogPosts ->
            val adapter = BlogPostsAdapter(blogPosts)
            binding.rvBlogPosts.adapter = adapter
            binding.progressBlogPosts.visibility = View.GONE

        }
    }

    /*  fun initRecycler() {
          val adapter = BlogPostsAdapter(BlogPostDataSource.blogPostList)
          binding.postsFeedRv.adapter = adapter
      }*/

    fun onSettingsButtonClicked() {
        binding.btnSettings.setOnClickListener {
            val intent = Intent(binding.btnSettings.context, SettingsActivity::class.java)
            ContextCompat.startActivity(binding.btnSettings.context, intent, null)
        }
    }


}

