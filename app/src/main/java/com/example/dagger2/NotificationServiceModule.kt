package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @Singleton
    @Provides
    @MessageQualifier
    fun getMessageService(retryCount : Int) : NotificationService {
        return MessageService(retryCount)
    }
    @Provides
    @Named("email")
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }
}