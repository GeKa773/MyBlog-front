package com.radchecko.geka.myblog.front.android

import PlatformConfiguration
import PlatformSDK
import android.app.Application

class MyBlogApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initPlatformSDK()
    }
}

fun MyBlogApp.initPlatformSDK() = PlatformSDK.init(
    configuration = PlatformConfiguration(androidContext = applicationContext)
)