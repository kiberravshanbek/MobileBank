package com.example.mobilebank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilebank.ui.Splash

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container,Splash()).commit()
    }
}