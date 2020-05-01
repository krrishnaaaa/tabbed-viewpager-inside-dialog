package com.pcsalt.example.tabbeddialog.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.pcsalt.example.tabbeddialog.fragment.LoginFragment
import com.pcsalt.example.tabbeddialog.fragment.RegisterFragment

/**
 * Created by Navkrishna on 12 July, 2018
 */
class TabPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment = when (position) {
        0 -> LoginFragment.newInstance()
        1 -> RegisterFragment.newInstance()
        else -> LoginFragment.newInstance()
    }

    override fun getPageTitle(position: Int): CharSequence? = when (position) {
        0 -> "Login"
        1 -> "Register"
        else -> "Login"
    }

    override fun getCount(): Int = 2
}