package com.anomdev.makutoanepal.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.ActivityMainBinding
import com.anomdev.makutoanepal.ui.fragments.business.AssociationsListFragment
import com.anomdev.makutoanepal.ui.fragments.country.CountryFragment
import com.anomdev.makutoanepal.ui.fragments.map.MapFragment
import com.anomdev.makutoanepal.ui.fragments.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //    private lateinit var navController: NavController
    private val homeFragment = HomeFragment()
    private val countryFragment = CountryFragment()
    private val mapFragment = MapFragment()
    private val associationsFragment = AssociationsListFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeFragment)
        binding.bottomNavMenu.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.menuitem_home -> replaceFragment(homeFragment)
                R.id.menuitem_country -> replaceFragment(countryFragment)
                R.id.menuitem_associations -> replaceFragment(associationsFragment)
                R.id.menuitem_map -> replaceFragment(mapFragment)

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
            } else {

            }
    }
}



