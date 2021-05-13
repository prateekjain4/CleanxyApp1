package com.example.cleanxyapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val sign_up: TextView = findViewById(R.id.signup_already_has_acc)
        sign_up.setOnClickListener {
            startActivity(Intent(this@Register, Login::class.java))
            finish()
        }
    }
}