package com.example.android.dagger.di

import androidx.lifecycle.ViewModelProvider
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserComponent
import dagger.Binds
import dagger.Module

@Module(subcomponents = [
    RegistrationComponent::class,
    LoginComponent::class,
    UserComponent::class
])
abstract class AppSubComponents {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}