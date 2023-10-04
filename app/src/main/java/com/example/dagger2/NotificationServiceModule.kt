package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @Provides
    @EmailQulifier
    fun getEmailService() : NotificationService {
        return EmailService()
    }

    @Provides
    @SMSQualifierg
    fun getSMSService(retryCount : Int) : NotificationService {
        return SMSService(retryCount)
    }
}