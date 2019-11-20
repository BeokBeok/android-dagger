package com.example.android.dagger.storage

import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {

    @Binds
    abstract fun bindStorage(storage: SharedPreferencesStorage): Storage
}