package com.example.daggersample

import dagger.Binds
import dagger.Module

@Module(includes = [AppModule::class])
abstract class ActivityModule {

    @ActivityScope
    @Binds
    abstract fun providePresenter(presenterImpl: PresenterImpl):Presenter
}