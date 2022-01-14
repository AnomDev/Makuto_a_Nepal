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
        "https://alongthisjourneyblog.files.wordpress.com/2015/11/p1160462.jpg",
        "La infancia en la región montañosa de Nepal",
        "13/01/2022"
    ),
    BlogPost(
        "https://www.publico.es/uploads/2016/05/18/573c0f92e7307.jpg",
        "Carlos Soria: \"Voy a intentar no hardcodear textos\"",
        "01/01/2022"
    ),
    BlogPost(
        "https://alongthisjourneyblog.files.wordpress.com/2016/01/img-20151016-wa0011.jpg",
        "Los sadhus, eremitas que se entregan a la fe",
        "24/12/2021"
    ),

    BlogPost(
        "https://www.excelenciasdelmotor.com/sites/default/files/inline-images/lukla2.jpg",
        "Lukla, el aeropuerto más peligroso del mundo (?)",
        "19/12/2021"
    ),

    BlogPost(
        "https://www.mochileandoporasia.com/wp-content/uploads/2018/12/Kathmandu-2.jpg",
        "Budismo e Hinduismo en Nepal: juntos pero no revueltos",
        "12/12/2021"
    ),

    BlogPost(
        "https://alongthisjourneyblog.files.wordpress.com/2015/10/img-20151013-wa0003.jpg",
        "5 trucos para fastidiar todas las fotos de un viaje por los Annapurnas",
        "03/12/2021"
    ),

    BlogPost(
        "https://www.lugaresdeaventura.com/sites/default/files/inline-images/14-peaks.jpeg",
        "Estreno mundial de \"14 Peaks: Nothis is impossible\" del escalador Nirmal Purja",
        "29/11/2021"
    ),
    BlogPost(
        "https://www.spotlightnepal.com/media/images/Nekapaa-70th-Anniversary-1-2.2e16d0ba.fill-650x500.jpg",
        "Los maoístas suben al poder en coalición con el partido congresista",
        "20/11/2021"
    ),

    BlogPost(
        "https://alongthisjourneyblog.files.wordpress.com/2015/11/p1160473.jpg?w=768",
        "La mujer nepalesa, ejemplo de superación",
        "14/11/2021"
    ),

    BlogPost(
        "https://static-abcblogs.abc.es/wp-content/uploads/sites/13/2017/11/Kumari-AFP.jpg",
        "Kumari Devi: la diosa viviente del Nepal",
        "06/11/2021"
    ),

    BlogPost(
        "https://alongthisjourneyblog.files.wordpress.com/2015/09/p1150468.jpg",
        "Los monos guardianes de Swayambhunath",
        "31/10/2021"
    ),
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
        binding.postsFeedRv.layoutManager = LinearLayoutManager(requireContext())
        val adapter = PostsFeedRVAdapter(feedList = postsOnFeed)
        binding.postsFeedRv.adapter = adapter
    }


}

