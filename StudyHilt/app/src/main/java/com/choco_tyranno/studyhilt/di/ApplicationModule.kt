package com.choco_tyranno.studyhilt.di

import com.choco_tyranno.studyhilt.di.qualifier.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @AppHash
    @Provides
    fun provideHash() = hashCode().toString()

}