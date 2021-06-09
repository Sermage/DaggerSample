package com.example.daggersample

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideApplication(): Application {
        return Application()
    }
}