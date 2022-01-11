package com.anomdev.makutoanepal.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.ActivityMainBinding
import com.anomdev.makutoanepal.ui.fragments.AssociationsDetailFragment
import com.anomdev.makutoanepal.ui.fragments.AssociationsListFragment
import com.anomdev.makutoanepal.ui.fragments.CountryFragment
import com.anomdev.makutoanepal.ui.fragments.MapFragment
import com.anomdev.makutoanepal.ui.fragments.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //    private lateinit var navController: NavController
    private val homeFragment = HomeFragment()
    private val countryFragment = CountryFragment()
    private val mapFragment = MapFragment()
    private val associationsFragment = AssociationsListFragment()

    private val associationDetailFragment = AssociationsDetailFragment()


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

/*

                val navView: BottomNavigationView = findViewById(R.id.bottom_nav_menu)
                val appBarConfiguration = AppBarConfiguration(
                    setOf(
                        R.id.homeFragment,
                        R.id.associationsListFragment,
                        R.id.mapFragment,
                    )
                )

                navController = Navigation.findNavController(this, R.id.nav_host_fragment)

                NavigationUI.setupWithNavController(navView,navController)
                navView.setupWithNavController(navController)
            }



            override fun onCreateOptionsMenu(menu: Menu?): Boolean {
                menuInflater.inflate(R.menu.bnv_menu, menu)
                val navController = findNavController(R.id.nav_host_fragment)
                val homeIcon: View? = findViewById(R.id.navHomeFragment)
                val mapIcon: View? = findViewById(R.id.navMapFragment)
                val associationsIcon: View? = findViewById(R.id.navNgosFragment)

                navController.addOnDestinationChangedListener { _, destination, _ ->

                    when (destination.id) {

                        R.id.main_navigation -> {
                            menu?.findItem(R.id.navHomeFragment)?.isVisible = true
                            menu?.findItem(R.id.navMapFragment)?.isVisible = true
                            menu?.findItem(R.id.navNgosFragment)?.isVisible = true
                            mapIcon?.visibility = View.VISIBLE
                            homeIcon?.visibility = View.VISIBLE
                            associationsIcon?.visibility = View.VISIBLE
                        }

                        else -> {
                            menu?.findItem(R.id.navHomeFragment)?.isVisible = false
                            menu?.findItem(R.id.navMapFragment)?.isVisible = false
                            menu?.findItem(R.id.navNgosFragment)?.isVisible = false

                            mapIcon?.visibility = View.GONE
                            homeIcon?.visibility = View.GONE
                            associationsIcon?.visibility = View.GONE

                        }

                    }
                }

                return super.onCreateOptionsMenu(menu)

            }

            override fun onOptionsItemSelected(item: MenuItem): Boolean {
                when (item?.itemId) {
                    R.id.navHomeFragment ->
                        findNavController(R.id.nav_host_fragment).navigate(R.id.action_homeFragment_to_mapFragment)

                    R.id.navMapFragment ->
                        findNavController(R.id.nav_host_fragment).navigate(R.id.action_homeFragment_to_mapFragment)

                    R.id.navNgosFragment ->
                        findNavController(R.id.nav_host_fragment).navigate(R.id.action_homeFragment_to_mapFragment)
                }

                return super.onOptionsItemSelected(item)
            }
*/

