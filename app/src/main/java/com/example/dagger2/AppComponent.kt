package com.example.dagger2

import dagger.Component
import javax.inject.Singleton

@Component(modules = [AnalyticsModule::class])
@Singleton
interface AppComponent {
    fun getAnalyticsService() : AnalyticsService
}