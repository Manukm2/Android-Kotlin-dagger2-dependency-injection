package com.example.dagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository : UserRepository ,
                              private val emailService : EmailService) {

    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        emailService.sendMail(Email,"ABC@gmail.com","User Registered")
    }
}