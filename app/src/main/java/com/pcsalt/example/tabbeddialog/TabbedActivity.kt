package com.pcsalt.example.tabbeddialog

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
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

        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, (height * .75).toInt())
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