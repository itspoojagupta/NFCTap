package com.example.aircloudtap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)

        tvForgotPassword.setOnClickListener {
            val intent = Intent(this,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }

}