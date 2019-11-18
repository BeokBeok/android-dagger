package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.MyApplication
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, StorageModule::class, ActivityModules::class, AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApplication)
}