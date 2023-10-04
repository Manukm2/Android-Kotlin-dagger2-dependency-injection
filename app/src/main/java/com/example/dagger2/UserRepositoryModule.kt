package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {

    @Provides
    @Named("SQL")
    fun getSQLDBRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    @Provides
    @Named("MongoDB")
    fun getmongoDBRepository(mongoDBRepository: MongoDBRepository) : UserRepository {
        return mongoDBRepository
    }
}