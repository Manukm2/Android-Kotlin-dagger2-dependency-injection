package com.example.dagger2

import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class , NotificationServiceModule::class ])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount : Int , appComponent: AppComponent) : UserRegistrationComponent
    }
}