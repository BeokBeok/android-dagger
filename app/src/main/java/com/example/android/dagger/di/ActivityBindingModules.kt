package com.example.android.dagger.di

import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationModules
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelFactoryModule::class])
abstract class ActivityBindingModules {

    @ActivityScope
    @ContributesAndroidInjector(modules = [RegistrationModules::class])
    abstract fun registrationActivity(): RegistrationActivity
}