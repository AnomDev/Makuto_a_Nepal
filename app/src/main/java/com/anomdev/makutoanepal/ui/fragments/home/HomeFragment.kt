package com.anomdev.makutoanepal.ui.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.FragmentHomeBinding

import com.anomdev.makutoanepal.model.BlogPost

val postsOnFeed = listOf(
    BlogPost(
        "https://www.publico.es/uploads/2016/05/18/573c0f92e7307.jpg",
        "Carlos Soria: Voy a intentar no hardcodear textos",
        "12/01/2022"
    ),
    BlogPost(
        "https://www.excelenciasdelmotor.com/sites/default/files/inline-images/lukla2.jpg",
        "Lukla, el aeropuerto más peligroso del mundo (?)",
        "19/12/2021"
    ),

    BlogPost(
        "https://www.mochileandoporasia.com/wp-content/uploads/2018/12/Kathmandu-2.jpg",
        "Budismo e Hinduismo en Nepal: juntos pero no revueltos",
        "07/12/2021"
    ),

    BlogPost(
        "https://www.spotlightnepal.com/media/images/Nekapaa-70th-Anniversary-1-2.2e16d0ba.fill-650x500.jpg",
        "Los maoístas suben al poder en coalición con el partido congresista",
        "20/11/2021"
    )


)

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        initRecycler()
        return binding.root

    }


    fun initRecycler() {
        binding.rvNewsFeed.layoutManager = LinearLayoutManager(requireContext())
        val adapter = PostsFeedRVAdapter(feedList = postsOnFeed)
        binding.rvNewsFeed.adapter = adapter
    }


}

