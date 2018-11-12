package com.okamiye.www.simone.di

import com.okamiye.www.simone.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * ActivityInjectionModule -
 */
@Module
abstract class ActivityInjectionModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity
}