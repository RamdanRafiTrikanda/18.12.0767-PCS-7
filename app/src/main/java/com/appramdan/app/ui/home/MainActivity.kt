package com.appramdan.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.appramdan.app.R
import com.appramdan.app.databinding.ActivityAuthBinding
import com.appramdan.app.databinding.ActivityMainBinding
import com.appramdan.app.ui.auth.AppramdanAuth
import com.appramdan.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init()
    }

    private fun init() {
        binding.bottomNav.setOnNavigationItemReselectedListener {
          when(it.itemId){
              R.id.ic_home -> navigate(R.id.homeFragment)
              R.id.ic_news -> navigate(R.id.newsFragment)
              R.id.ic_favorite -> navigate(R.id.favoriteFragment)
              R.id.ic_profile -> navigate(R.id.profileFragment)
              else -> false
          }
        }
    }
    private fun navigate(id: Int): Boolean {
        findNavController(R.id.navHost).navigate(id)
        return true
    }
}