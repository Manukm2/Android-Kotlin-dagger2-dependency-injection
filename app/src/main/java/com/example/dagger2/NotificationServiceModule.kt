package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @ActivityScope
    @Provides
    @MessageQualifier
    fun getMessageService() : NotificationService {
        return MessageService(3)
    }
    @Provides
    @Named("email")
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }
}