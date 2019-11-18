package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.di.RegistrationActivityModules
import com.example.android.dagger.registration.di.RegistrationModules
import com.example.android.dagger.registration.di.RegistrationProviders
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModules {

    @ActivityScope
    @ContributesAndroidInjector(modules = [RegistrationActivityModules::class, RegistrationModules::class, RegistrationProviders::class])
    abstract fun bindRegeistrationActivity(): RegistrationActivity
}