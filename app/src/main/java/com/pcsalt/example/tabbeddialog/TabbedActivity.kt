package com.pcsalt.example.tabbeddialog

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.ViewGroup
import com.pcsalt.example.tabbeddialog.adapter.TabPagerAdapter


/**
 * Created by Navkrishna on 12 July, 2018
 */
class TabbedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabbed)

        setDialogHeight()

        initUi()

    }

    private fun setDialogHeight() {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels

        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, (height * .5).toInt())
    }

    private fun initUi() {
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        val adapter = TabPagerAdapter(supportFragmentManager)

        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)
        tabLayout.tabMode = TabLayout.MODE_FIXED
    }
}