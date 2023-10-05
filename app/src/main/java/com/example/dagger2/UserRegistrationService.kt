package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
                              private val userRepository : UserRepository ,
                             @MessageQualifier private val notificationService: NotificationService) {     //Manual Dependency Injection


    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        notificationService.send(Email,"ABC@gmail.com","User Registered")
    }
}
