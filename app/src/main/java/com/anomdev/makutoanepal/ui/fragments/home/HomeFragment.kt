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
        "Carlos Soria: Voy a intentar no hardcodear textos"
    ),
    BlogPost(
        "https://www.excelenciasdelmotor.com/sites/default/files/inline-images/lukla2.jpg",
        "Lukla, el aeropuerto más peligroso del mundo (?)"
    ),

    BlogPost(
        "https://www.explorenepal.com/info/world_heritage_sites/images/swayambhu_stupa.jpg",
        "Budismo e Hinduismo en Nepal"
    ),

    BlogPost(
        "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
        "Imagen funcional 100%"
    )


)

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

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

