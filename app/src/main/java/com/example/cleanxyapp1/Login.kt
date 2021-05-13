package com.example.cleanxyapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login: TextView = findViewById(R.id.login_has_no_acc)
        login.setOnClickListener {
            startActivity(Intent(this@Login, Register::class.java))
            finish()
        }
    }
}