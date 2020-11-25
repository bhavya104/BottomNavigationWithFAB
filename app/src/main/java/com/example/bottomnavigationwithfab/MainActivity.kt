package com.example.bottomnavigationwithfab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

  //  private val mainlayout = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mainlayout.background = null
//        mainlayout.menu.getItem(2).isEnabled = false


    }
}