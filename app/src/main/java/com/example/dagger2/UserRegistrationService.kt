package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
                                   @Named("MongoDB") private val userRepository : UserRepository ,
                                   @Named("SMS") private val notificationService : NotificationService) {

    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        notificationService.send(Email,"ABC@gmail.com","User Registered")
    }
}