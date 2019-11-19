package com.example.android.dagger.registration

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.ViewModelKey
import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.di.scope.FragmentScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class RegistrationModules {

    @ActivityScope
    @Binds
    @IntoMap
    @ViewModelKey(EnterDetailsViewModel::class)
    abstract fun bindEnterDetailsViewModel(viewModel: EnterDetailsViewModel): ViewModel

    @ActivityScope
    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun bindRegistrationViewModel(viewModel: RegistrationViewModel): ViewModel

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun provideEnterDetailsFragment(): EnterDetailsFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun provideTermsAndConditionsFragment(): TermsAndConditionsFragment
}