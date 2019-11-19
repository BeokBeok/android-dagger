package com.example.android.dagger.login

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.ViewModelKey
import com.example.android.dagger.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginModules {

    @ActivityScope
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel
}