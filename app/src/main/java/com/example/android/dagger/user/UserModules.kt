package com.example.android.dagger.user

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.ViewModelKey
import com.example.android.dagger.main.MainViewModel
import com.example.android.dagger.settings.SettingsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class UserModules {

    @LoggedUserScope
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @LoggedUserScope
    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    abstract fun bindSettingsViewModel(viewModel: SettingsViewModel): ViewModel
}