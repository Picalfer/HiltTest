package com.landfathich.hilttest

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModule {

    @Provides
    @ActivityRetainedScoped
    fun provideWiFiManager(settings: WiFiSettings): WiFiManager {
        return WiFiManager(settings)
    }

    @Provides
    fun provideWiFiSettings(): WiFiSettings {
        return WiFiSettings()
    }
}