package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService() : AnalyticsService {
        return Mixpanel()
    }

}