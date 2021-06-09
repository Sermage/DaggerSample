package com.example.daggersample

import android.app.Application
import javax.inject.Inject


class PresenterImpl @Inject constructor(application: Application) : Presenter {
}