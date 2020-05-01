package com.pcsalt.example.tabbeddialog

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openTabbedDialog(view: View) {
        startActivity(Intent(this@MainActivity, TabbedActivity::class.java))
    }
}
