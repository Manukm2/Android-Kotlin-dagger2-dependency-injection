package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class , NotificationServiceModule::class ])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun  build() : UserRegistrationComponent

        fun retryCount(@BindsInstance retryCount: Int) : Builder

        fun appComponent(appComponent: AppComponent) : Builder

    }
}