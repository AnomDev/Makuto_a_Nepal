package com.anomdev.makutoanepal.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.ActivityMainBinding
import com.anomdev.makutoanepal.ui.business.BusinessListFragment
import com.anomdev.makutoanepal.ui.info.InfoGridFragment
import com.anomdev.makutoanepal.ui.map.MapFragment
import com.anomdev.makutoanepal.ui.blog.BlogFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //    private lateinit var navController: NavController
    private val homeFragment = BlogFragment()
    private val countryFragment = InfoGridFragment()
    private val mapFragment = MapFragment()
    private val businessFragment = BusinessListFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeFragment)
        binding.bottomNavMenu.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menuitem_home -> replaceFragment(homeFragment)
                R.id.menuitem_country -> replaceFragment(countryFragment)
                R.id.menuitem_business -> replaceFragment(businessFragment)
                R.id.menuitem_map -> replaceFragment(mapFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        } else {

        }
    }

    private var doubleBackToExitPressedOnce = false

    override fun onBackPressed() {
        replaceFragment(homeFragment)
        if(doubleBackToExitPressedOnce) {
            val dialog = AlertDialog.Builder(this)
                .setTitle(R.string.alert_dialog_exit_title)
                .setMessage(R.string.alert_dialog_exit_message)
                .setNegativeButton(R.string.alert_dialog_exit_negative_btn) { view, _ ->
                    view.dismiss()
                }
                .setPositiveButton(R.string.alert_dialog_exit_positive_btn) { _, _ ->
                    finish()
                }
                .setCancelable(false)
                .create()

            dialog.show()
        }
        this.doubleBackToExitPressedOnce = true
        Handler(Looper.getMainLooper()).postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)

    }
}



