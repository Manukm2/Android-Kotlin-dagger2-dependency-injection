package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Provides
    @Named("Email")
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }

    @Provides
    @Named("SMS")
    fun getSMSService(smsService: SMSService) : NotificationService {
        return smsService
    }
}