package com.pcsalt.example.tabbeddialog.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.pcsalt.example.tabbeddialog.fragment.LoginFragment
import com.pcsalt.example.tabbeddialog.fragment.RegisterFragment

/**
 * Created by Navkrishna on 12 July, 2018
 */
class TabPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    override fun getItem(position: Int): Fragment? = when (position) {
        0 -> LoginFragment.newInstance()
        1 -> RegisterFragment.newInstance()
        else -> null
    }

    override fun getPageTitle(position: Int): CharSequence? = when (position) {
        0 -> "Login"
        1 -> "Register"
        else -> ""
    }

    override fun getCount(): Int = 2
}