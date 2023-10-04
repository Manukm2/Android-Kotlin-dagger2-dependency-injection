package com.example.dagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
                                    private val userRepository : UserRepository ,
                                    private val notificationService : NotificationService) {

    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        notificationService.send(Email,"ABC@gmail.com","User Registered")
    }
}