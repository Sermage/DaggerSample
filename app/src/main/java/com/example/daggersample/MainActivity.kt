package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent= getAppComponent()
        getActivityComponent(appComponent).inject(this)
    }

    private fun getAppComponent():AppComponent{
        return DaggerAppComponent.builder()
            .build()
    }

    private fun getActivityComponent(
        appComponent: AppComponent
    ):ActivityComponent{
        return DaggerActivityComponent.builder()
            .appComponent(appComponent)
            .appModule(AppModule())
            .build()
    }

}