package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService
    @Inject
    lateinit var emailService: EmailService //Dagger will inject dependencies for this also
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerUserRegistrationComponent.builder().build().inject(this)
        userRegistrationService.registerUser("manu.km@sirmaindia.com","12345")
    }
}