package com.example.android.dagger.registration.di

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.ViewModelKey
import com.example.android.dagger.registration.RegistrationViewModel
import com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class RegistrationModules {

    @Binds
    @IntoMap
    @ViewModelKey(EnterDetailsViewModel::class)
    abstract fun bindEnterDetailsViewModel(viewModel: EnterDetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun bindRegistrationViewModel(viewModel: RegistrationViewModel): ViewModel
}