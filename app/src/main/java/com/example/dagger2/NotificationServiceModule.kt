package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @ActivityScope
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