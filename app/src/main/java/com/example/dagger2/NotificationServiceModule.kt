package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount : Int) {

    @Provides
    @EmailQulifier
    fun getEmailService() : NotificationService {
        return EmailService()
    }

    @Provides
    @SMSQualifierg
    fun getSMSService() : NotificationService {
        return SMSService(retryCount)
    }
}