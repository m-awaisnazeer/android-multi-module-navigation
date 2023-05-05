package com.applications.multimodulenavigation.di

import com.applications.common.NavController
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavModule {

    @Binds
    abstract fun bindAnalyticsService(
        navControllerImpl: NavControllerImpl
    ): NavController
}