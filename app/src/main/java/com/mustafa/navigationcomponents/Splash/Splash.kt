package com.mustafa.navigationcomponents.Splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rigix.navigationcomponents.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()
    }
}