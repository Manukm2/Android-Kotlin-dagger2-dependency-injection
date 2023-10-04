package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Manual Dependency Injection
        val userRepository : UserRepository = UserRepository()
        val emailService : EmailService = EmailService()

        val userRegistrationService : UserRegistrationService = UserRegistrationService(userRepository , emailService)  //Manual Dependency Injection
        userRegistrationService.registerUser("manu.km@sirmaindia.com","12345")
    }
}