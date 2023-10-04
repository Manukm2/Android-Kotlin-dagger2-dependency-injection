package com.example.dagger2

class UserRegistrationService(private val userRepository : UserRepository ,
                              private val emailService : EmailService) {     //Manual Dependency Injection


    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        emailService.sendMail(Email,"ABC@gmail.com","User Registered")
    }
}