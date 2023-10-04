package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {

    @Binds
    abstract fun getEmailService(emailService: EmailService) : NotificationService

}