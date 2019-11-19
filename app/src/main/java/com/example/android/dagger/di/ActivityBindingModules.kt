package com.example.android.dagger.di

import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.login.LoginModules
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationModules
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.LoggedUserScope
import com.example.android.dagger.user.UserModules
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelFactoryModule::class])
abstract class ActivityBindingModules {

    @ActivityScope
    @ContributesAndroidInjector(modules = [RegistrationModules::class])
    abstract fun registrationActivity(): RegistrationActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginModules::class])
    abstract fun loginActivity(): LoginActivity

    @LoggedUserScope
    @ContributesAndroidInjector(modules = [UserModules::class])
    abstract fun mainActivity(): MainActivity

    @LoggedUserScope
    @ContributesAndroidInjector(modules = [UserModules::class])
    abstract fun settingsActivity(): SettingsActivity
}