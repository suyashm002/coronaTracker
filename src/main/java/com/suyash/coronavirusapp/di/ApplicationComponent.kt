package com.suyash.coronavirusapp.di

import com.suyash.coronavirusapp.CoronaApp
import com.suyash.coronavirusapp.base.BaseActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(app: CoronaApp)
    fun inject(activity: BaseActivity)
}