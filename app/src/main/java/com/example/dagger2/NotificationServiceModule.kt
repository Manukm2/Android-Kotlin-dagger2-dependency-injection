package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }

}