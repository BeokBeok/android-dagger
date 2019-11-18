package com.example.android.dagger.registration.di

import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RegistrationProviders {

    @ContributesAndroidInjector(modules = [RegistrationModules::class])
    abstract fun provideEnterDetailsFragment(): EnterDetailsFragment

    @ContributesAndroidInjector
    abstract fun provideTermsAndConditionsFragment(): TermsAndConditionsFragment
}