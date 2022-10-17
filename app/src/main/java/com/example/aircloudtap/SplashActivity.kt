package com.example.aircloudtap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            sendToLogin()
        }, 3000)
    }

    private fun sendToLogin() {
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
        finish()
    }

}