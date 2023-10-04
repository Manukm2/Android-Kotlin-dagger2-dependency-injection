package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
                                   @MongoDBQualifier private val userRepository : UserRepository ,
                                   @SMSQualifierg private val notificationService : NotificationService) {

    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        notificationService.send(Email,"ABC@gmail.com","User Registered")
    }
}