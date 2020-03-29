package com.example.basicswipetabs.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.basicswipetabs.*
import com.example.basicswipetabs.adapter.MainPagerAdapter
import com.example.basicswipetabs.api.ServiceGenerator
import com.example.basicswipetabs.fragment.ListFragment
import com.example.basicswipetabs.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    /**
     * Create:
     * - tabs related to swipe behaviour
     * - list tab with RecyclerView with mocked data inside
     * - main tab with details of one RecyclerView item from list tab
     */

    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        setPagerAdapter()
    }

    fun setPagerAdapter(){
        val pagerAdapter = MainPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(Constants.TAB_TITLE_MAIN, MainFragment())
        pagerAdapter.addFragment(Constants.TAB_TITLE_LIST, ListFragment())
        viewPager.adapter = pagerAdapter

    }
}