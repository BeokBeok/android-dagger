package com.example.android.dagger.registration.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Module
import dagger.Provides

@Module
class RegistrationActivityModules {

    @Provides
    fun provideRegistrationActivity(activity: RegistrationActivity) = activity
}