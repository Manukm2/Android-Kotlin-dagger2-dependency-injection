package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ApplicationScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}