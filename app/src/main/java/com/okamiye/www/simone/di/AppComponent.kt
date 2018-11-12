package com.okamiye.www.simone.di

import com.okamiye.www.simone.SimOne
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

/**
 * AppComponent -
 */
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityInjectionModule::class])
interface AppComponent: AndroidInjector<SimOne>