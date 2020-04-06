package com.example.experimentlist.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.experimentlist.R
import com.example.experimentlist.ui.fragments.ExperimentListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(
                R.id.mainFrame,
                ExperimentListFragment()
        ).commit()
    }
}
