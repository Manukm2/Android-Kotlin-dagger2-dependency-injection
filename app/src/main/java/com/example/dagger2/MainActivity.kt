package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService() /* Afetr building
        the project, Dagger will create one class and implement to UserRegistrationComponent interface. That class name is called
         DaggerUserRegistrationComponent. By using that class object we are calling getUserRegistrationService() method present
         UserRegistrationComponent interface. */
        userRegistrationService.registerUser("manu.km@sirmaindia.com","12345")
    }
}