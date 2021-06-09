package com.example.daggersample

import dagger.Binds
import dagger.Module

@Module(includes = [AppModule::class])
interface ActivityModule {

    @ActivityScope
    @Binds
    fun providePresenter(presenterImpl: PresenterImpl):Presenter
}