package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService : UserRegistrationService = UserRegistrationService()
        userRegistrationService.registerUser("manu.km@sirmaindia.com","12345")
    }
}