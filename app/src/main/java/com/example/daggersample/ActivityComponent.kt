package com.example.daggersample

import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {
    fun getPresenter():Presenter
}