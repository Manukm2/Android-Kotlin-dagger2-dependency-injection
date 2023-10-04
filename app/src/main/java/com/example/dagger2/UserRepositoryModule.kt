package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {

    @Provides
    @SMSQualifierg
    fun getSQLDBRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    @Provides
    @MongoDBQualifier
    fun getmongoDBRepository(mongoDBRepository: MongoDBRepository) : UserRepository {
        return mongoDBRepository
    }
}