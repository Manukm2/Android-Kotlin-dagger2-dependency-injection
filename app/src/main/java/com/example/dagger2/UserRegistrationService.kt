package com.example.dagger2

class UserRegistrationService {
        private val userRepository : UserRepository = UserRepository()
        private val emailService : EmailService = EmailService()

    fun registerUser(Email : String , Password : String){
        userRepository.saveUser(Email,Password)
        emailService.sendMail(Email,"ABC@gmail.com","User Registered")
    }
}