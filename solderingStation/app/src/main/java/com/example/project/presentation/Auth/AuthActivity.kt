package com.example.project.presentation.Auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        supportActionBar!!.hide()
    }
}