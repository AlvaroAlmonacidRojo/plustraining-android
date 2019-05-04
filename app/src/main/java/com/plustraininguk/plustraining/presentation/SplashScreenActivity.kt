package com.plustraininguk.plustraining.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import com.plustraininguk.plustraining.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        when{
            isLogged() -> Log.d("SplashScreenActivity","Go to main activity")
            noLogged() -> Log.d("SplashScreenActivity","Go to loggin activity")
            else -> finish()
        }
    }

    private fun isLogged(): Boolean{
        return false
    }

    private fun noLogged(): Boolean{
        return true
    }
}