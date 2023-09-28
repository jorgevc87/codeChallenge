package com.culqui.code.challengue.main.framework

import android.app.Application
import com.culqui.code.challengue.main.framework.koin.ApiModule
import com.culqui.code.challengue.main.framework.koin.UseCaseModule
import com.culqui.code.challengue.main.framework.koin.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class CodeChallengueAplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@CodeChallengueAplication)
            modules(getModule())
        }
    }

    private fun getModule(): List<Module> {
        return listOf(
            ApiModule,
            UseCaseModule,
            ViewModelModule
        )
    }
}