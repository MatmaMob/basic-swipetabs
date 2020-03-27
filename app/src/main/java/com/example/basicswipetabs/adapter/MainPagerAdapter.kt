package com.example.basicswipetabs.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.basicswipetabs.Constants

class MainPagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)  {

    private val titles = ArrayList<String>()
    private val fragments = ArrayList<Fragment>()

    override fun getPageTitle(position: Int): CharSequence? = titles[position]

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int =
        Constants.NUMBER_OF_PAGES

    fun addFragment(title: String, fragment: Fragment){
        titles.add(title)
        fragments.add(fragment)
    }
}