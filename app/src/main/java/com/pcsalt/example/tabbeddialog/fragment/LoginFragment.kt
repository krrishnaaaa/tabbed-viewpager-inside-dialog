package com.pcsalt.example.tabbeddialog.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pcsalt.example.tabbeddialog.R

/**
 * Created by Navkrishna on 12 July, 2018
 */
class LoginFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.fragment_login, container, false)

    companion object {
        fun newInstance(): LoginFragment = LoginFragment()
    }
}