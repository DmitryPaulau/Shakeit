package com.example.shakeit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.shakeit.ui.allcocktails.AllCocktailsFragment
import com.example.shakeit.ui.onboarding.OnboardingFragment
import com.example.shakeit.util.replaceFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .replaceFragment(R.id.container, OnboardingFragment())
    }
}