package com.yinjin.expandtextview.navigationdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp() = Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
}
