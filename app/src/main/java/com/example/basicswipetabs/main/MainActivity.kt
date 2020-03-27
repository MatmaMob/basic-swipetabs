package com.example.basicswipetabs.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.basicswipetabs.*
import com.example.basicswipetabs.adapter.MainPagerAdapter
import com.example.basicswipetabs.fragment.ListFragment
import com.example.basicswipetabs.fragment.MainFragment
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        setPagerAdapter()
    }

    fun setPagerAdapter(){
        val pagerAdapter = MainPagerAdapter(supportFragmentManager).apply {
            addFragment(Constants.TAB_TITLE_MAIN, MainFragment())
            addFragment(Constants.TAB_TITLE_LIST, ListFragment())
        }

        viewPager.apply {
            adapter = pagerAdapter
        }
        tabLayout.setupWithViewPager(viewPager)
    }
}
